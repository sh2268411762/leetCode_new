package com.gdpph.o1kuaixue.demo.chapter12.section4.section1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 零壹学堂
 */
public class Test {
    public static void main(String[] args) {
        // 步骤1. 创建目标对象，在生成代理对象时会需要目标对象对其初始化
        BusinessService target = new BusinessServiceImpl();
        // 步骤2. 创建代理对象
        BusinessService service = (BusinessService) Proxy.newProxyInstance(
                // 通过反射获取对象的类加载器
                target.getClass().getClassLoader(),
                // 通过反射获取对象的接口
                target.getClass().getInterfaces(),
          		// handler是业务增强逻辑，需要实现这个接口
                new MyInvocationHandler(target));

        // 步骤3. 通过代理对象调用主业务方法
        service.transfer();
    }
}

class MyInvocationHandler implements InvocationHandler {
    // 引入目标对象，此处使用Object而不是具体的类是为了更好的扩展性
    private Object target;

    public MyInvocationHandler() {
    }

    // 通过带参构造器传入目标对象
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 对主业务的增强逻辑
        System.out.println("模拟对转账的账户进行安全验证");

        // 使用method调用目标对象的目标方法
        return method.invoke(target, args);
    }
}

// 某个业务接口
interface BusinessService {
    // 转账业务
    void transfer();
}

// 实现某个业务接口
class BusinessServiceImpl implements BusinessService {
    @Override
    public void transfer() {
        System.out.println("模拟DAO层的调用，执行转账业务");
    }
}
