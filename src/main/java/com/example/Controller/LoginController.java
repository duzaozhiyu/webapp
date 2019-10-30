package com.example.Controller;

import com.example.service.LoginServer;
import com.example.service.UserService;
import com.example.service.impl.LoginServerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    public LoginServer loginServer;
    @RequestMapping(value="toLogin",method= RequestMethod.GET)
    public ModelAndView toLoginPage(@RequestParam(value="username") String username ,
                                    @RequestParam(value="password")String password){
           int flag=loginServer.isLogin(username,password);

           if(flag>=1)
           {
              ModelAndView view =new ModelAndView("index");
              return view;
           }else{
              return null;
           }
    }

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }

}
