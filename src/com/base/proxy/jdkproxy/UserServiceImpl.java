package com.base.proxy.jdkproxy;

public class UserServiceImpl implements UserService{

    @Override
    public void add() {
        System.out.println("add方法执行...");
    }
}
