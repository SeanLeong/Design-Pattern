package Structure.Proxy.CglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName: ProxyFactory
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/23 20:51
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object obj) {
        this.target = obj;
    }

    public Object newProxyInstance(){
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println("before method run...");
                Object result = method.invoke(target, args);
                System.out.println("after method run...");
                return result;
            }
        });
        //创建对象：代理对象
        return enhancer.create();
    }

}
