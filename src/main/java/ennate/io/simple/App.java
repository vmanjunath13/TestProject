package ennate.io.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        HelloWorld helloBean = context.getBean(HelloWorld.class);
        helloBean.sayHello();
        context.close();
    }
}
