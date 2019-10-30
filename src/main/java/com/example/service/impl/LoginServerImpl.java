package com.example.service.impl;

import com.example.mapper.SystemUserLoginMapper;
import com.example.model.User;
import com.example.service.LoginServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServerImpl implements LoginServer {

    @Autowired
    private SystemUserLoginMapper loginDao;
//    @Override
    public boolean isLogin2(String username, String password) {

            if(username==null||username.equals("")||password==null||password.equals(""))
            {
                return false;
            }
           int result=loginDao.isLogin(username,password);
            if(result>0)
            {
                return true;
            }
            return false;
    }

    @Override
    public int isLogin(String username, String password){
        return 1;
    }
}
