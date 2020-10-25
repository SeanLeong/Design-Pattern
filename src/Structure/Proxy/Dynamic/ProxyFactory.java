package Structure.Proxy.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: ProxyFactory
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/23 19:41
 */
public class ProxyFactory{
    /*
    用于创建动态代理
     */

    private Object obj;

    /**
     * 初始化用于创建该目标对象的代理
     * @param obj
     */
    public ProxyFactory(Object obj) {
        this.obj = obj;
    }

    /*
       用于演示理解：Proxy.newProxyInstance参数：目标类启动器、目标类接口、代理方法的处理
     */
    public Object newBankProxyInstance(){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理类:" + proxy.getClass() + " 方法：" + method.getName() + " 参数:" + args.toString());
                Object result = method.invoke(obj, args);
                System.out.println("代理结束了");
                return result;
            }
        });
    }
}
