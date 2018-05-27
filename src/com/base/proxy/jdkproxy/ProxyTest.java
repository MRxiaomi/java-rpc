package com.base.proxy.jdkproxy;

/**
 * 执行结果：
 *
 * ---------before-----------
 * add方法执行...
 * ---------after-----------
 *
 * 原理分析：
 *
 */
public class ProxyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userService);

        UserService proxy = (UserService) myInvocationHandler.getProxy();

        proxy.add();
    }
}