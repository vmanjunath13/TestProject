package ennate.io.complex.email;

import org.springframework.stereotype.Component;

@Component("awsService")
public class AWSEmailService implements EmailService {

    public AWSEmailService() {
        System.out.println("Inside AWSEmailService Constructor");
    }

    @Override
    public void sendEmail(String toAddress, String body) {
        System.out.println("******AWS EMail Service******");
        System.out.println("Sending to " + toAddress);
        System.out.println("Message sent is " + body);
        System.out.println("*****************************");
    }
}
