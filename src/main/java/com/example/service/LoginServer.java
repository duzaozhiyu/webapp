package com.example.service;

import org.springframework.stereotype.Service;

@Service
public interface LoginServer {
    public int isLogin(String username,String password);
}
