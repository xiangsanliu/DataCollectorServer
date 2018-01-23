package com.wangxiang.datacollectorserver.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiang
 */
@RestController
public class WebController {

    @RequestMapping(value = "/apply", method = RequestMethod.GET)
    public String apply() {
        return "apply";
    }

}
