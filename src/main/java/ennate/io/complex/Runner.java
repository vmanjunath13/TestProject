package ennate.io.complex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        NotificationService notificationService = context.getBean(NotificationService.class);
        notificationService.sendNotification("vaishnavi.m1913@gmail.com", "Hello! How are you Doing?");
        context.close();
    }
}
