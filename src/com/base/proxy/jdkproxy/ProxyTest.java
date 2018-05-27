package com.base.proxy.jdkproxy;

/**
 * 执行结果：
 *
 * ---------before-----------
 * add方法执行...
 * ---------after-----------
 *
 * 原理分析：
 * http://rejoy.iteye.com/blog/1627405(写的非常详尽了)
 *
 * “jdk动态代理之所以只能代理接口是因为代理类本身已经extends了Proxy，而java是不允许多重继承的，但是允许实现多个接口，因此才有cglib的需要吧”
 */
public class ProxyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userService);

        UserService proxy = (UserService) myInvocationHandler.getProxy();

        proxy.add();
    }
}