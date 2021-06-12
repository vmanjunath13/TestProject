package ennate.io.complex;

import ennate.io.complex.email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    // Property based Dependency Injection (DI)
    @Autowired
    @Qualifier("gmailService")
    private EmailService emailService;

    // Constructor based Dependency Injection (DI)
//    public NotificationService(EmailService emailService) {
//        this.emailService = emailService;
//    }

    public void sendNotification(String to, String message) {
        this.emailService.sendEmail(to, message);
    }

    // Setter based Dependency Injection (DI)
    // public void setEmailService(EmailService emailService) {
    //    this.emailService = emailService;
    // }
}
