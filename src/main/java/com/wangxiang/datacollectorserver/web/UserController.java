package com.wangxiang.datacollectorserver.web;


import com.alibaba.fastjson.JSON;
import com.wangxiang.datacollectorserver.domain.dao.ActiveCodeRepository;
import com.wangxiang.datacollectorserver.domain.entity.ActiveCode;
import com.wangxiang.datacollectorserver.share.Constants;
import com.wangxiang.datacollectorserver.domain.dao.IMEIRepository;
import com.wangxiang.datacollectorserver.domain.dao.UserRepository;
import com.wangxiang.datacollectorserver.share.HttpResult;
import com.wangxiang.datacollectorserver.domain.entity.ImeiModel;
import com.wangxiang.datacollectorserver.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author xiang
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private UserRepository userRepository;

    private IMEIRepository imeiRepository;

    private ActiveCodeRepository activeCodeRepository;

    @Autowired
    public UserController(UserRepository userRepository, IMEIRepository imeiRepository
            , ActiveCodeRepository activeCodeRepository) {
        this.userRepository = userRepository;
        this.imeiRepository = imeiRepository;
        this.activeCodeRepository = activeCodeRepository;
    }

    @RequestMapping("/login")
    public HttpResult<Void> login(@RequestParam("imei") String imei) {
        HttpResult<Void> result = new HttpResult<>();
        ImeiModel imeiModel = imeiRepository.findImeiModelByImei(imei);
        if (imeiModel == null) {
            result.setResultCode(Constants.USER_LOGIN_FAILED);
        } else {
            result.setResultCode(Constants.USER_LOGIN_SUCCESS);
        }
        return result;
    }

    @PostMapping("/get")
    public User getUser(Long id) {
        return userRepository.findUserById(id);
    }

    @PostMapping("/register")
    public String register(String content) {            //对user传进的user进行检查，返回错误（成功）信息
        userRepository.save(JSON.parseObject(content, User.class));
        return null;
    }

    @RequestMapping(value = "/save/imei", method = RequestMethod.POST)
    public String  applyImei(String inputActiveCode, String imei) {
        Long code = Long.valueOf(inputActiveCode);
        if (activeCodeRepository.exists(code)) {
            ActiveCode activeCode = activeCodeRepository.findActiveCodeByActiveCode(code);
            if (activeCode.active()) {
                activeCodeRepository.delete(code);
                imeiRepository.save(new ImeiModel(imei));
                activeCodeRepository.save(activeCode);
                return "激活成功，剩余激活次数:" + activeCode.getLeftTime();
            } else {
                return "激活失败，激活次数已耗尽！";
            }
        } else {
            return "激活失败，该激活码不存在！";
        }
    }

}
