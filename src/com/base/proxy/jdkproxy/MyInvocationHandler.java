package com.base.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
    /**
     *  目标杜希昂
     */
    private Object taget;

    /**
     * 构造目标对象
     * @param taget
     */
    public MyInvocationHandler(Object taget){
        super();
        this.taget = taget;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {

        System.out.println("---------before-----------");

        //执行目标对象的方法
        Object object = method.invoke(taget,args);

        System.out.println("---------after-----------");
        return null;
    }

    /**
     * 生成目标对象的代理对象
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),taget.getClass().getInterfaces(),this);
    }
}
