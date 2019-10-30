package com.example.Controller;

import com.example.service.ParseUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.Map;


@Controller
public class ApplicationController {

    @Autowired
    private ParseUrlService service;

    @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
    public String index() {
        System.out.println("===========");
        return "index";
    }

    @RequestMapping(value = "/getMessage", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> getMessage(String url, String cer, String cpr) {
        Map<String, Object> mapping = new HashMap<>();
        String result = service.doParseUrl(url, cer, cpr);
        System.out.println(url);
        mapping.put("message", result);
        return mapping;
    }

    @RequestMapping(value = "/mymusiclist", method = RequestMethod.GET)
    public String myMusicList() {
        return "/testpage/mymusiclist";
    }

    @RequestMapping(value = "/mylayout", method = RequestMethod.GET)
    public String myLayout() {
        return "/testpage/mylayout";
    }

    @RequestMapping(value = "/mylayout2", method = RequestMethod.GET)
    public String myLayout2() {
        return "/testpage/mylayout2";
    }

    @RequestMapping(value = "/mylayout3", method = RequestMethod.GET)
    public String myLayout3() {
        return "/testpage/mylayout3";
    }

    @RequestMapping(value = "/mytab", method = RequestMethod.GET)
    public String mytab() {
        return "/testpage/mytab";
    }

    @RequestMapping(value = "/myechart", method = RequestMethod.GET)
    public String myEchart() {
        return "/testpage/echarts_test";
    }

    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String login(){
        return "/loginpage/login";
    }
}
