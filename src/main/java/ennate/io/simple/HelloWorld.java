package ennate.io.simple;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") -> used when we need brand new object i.e.,L not as singleton
public class HelloWorld implements InitializingBean, DisposableBean {

    public HelloWorld() {
        System.out.println("Inside HelloWorld Bean Constructor");
    }

    public void sayHello() {
        System.out.println( "Spring Application" );
        System.out.println( "Hello World!" );
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside the afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside the destroy");
    }
}
