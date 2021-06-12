package ennate.io.complex.email;

import org.springframework.stereotype.Component;

@Component("gmailService")
public class GmailService implements EmailService {

    public GmailService() {
        System.out.println("Inside GmailService Constructor");
    }

    @Override
    public void sendEmail(String toAddress, String body) {
        System.out.println("******Gmail EMail Service******");
        System.out.println("Sending to " + toAddress);
        System.out.println("Message sent is " + body);
        System.out.println("*****************************");
    }
}
