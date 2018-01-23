package com.wangxiang.datacollectorserver.web;

import com.wangxiang.datacollectorserver.domain.dao.ActiveCodeRepository;
import com.wangxiang.datacollectorserver.domain.dao.IMEIRepository;
import com.wangxiang.datacollectorserver.domain.entity.ActiveCode;
import com.wangxiang.datacollectorserver.domain.entity.ImeiModel;
import com.wangxiang.datacollectorserver.share.ApplyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    ActiveCodeRepository activeCodeRepository;
    @Autowired
    IMEIRepository imeiRepository;

    @RequestMapping(value = "/apply/imei", method = RequestMethod.POST)
    public ApplyResult applyImei(String imei, String inputActiveCode) {
        ApplyResult applyResult = new ApplyResult();
        Long code = Long.valueOf(inputActiveCode);
        ActiveCode activeCode =  activeCodeRepository.findActiveCodeByActiveCode(code);
        if (activeCode.active()) {
            applyResult.setMessage("激活成功，剩余激活次数:" + activeCode.getLeftTime());
            activeCodeRepository.updateLeftTime(activeCode.getLeftTime());
            imeiRepository.save(new ImeiModel(imei));
        } else {
            applyResult.setMessage("激活失败，激活次数已耗尽");
        }
        return applyResult;
    }

}
