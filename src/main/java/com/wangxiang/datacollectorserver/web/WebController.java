package com.wangxiang.datacollectorserver.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xiang
 */
@Controller
public class WebController {

    @RequestMapping(value = "/apply", method = RequestMethod.GET)
    public String apply() {
        return "apply";
    }

}
