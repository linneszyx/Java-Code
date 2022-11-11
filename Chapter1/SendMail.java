import java.util.*;
import javax.mail.*;
import javax.mail.internet.*; 

public class SendMail 
{
        public static void main(String args[]) 
        {
       try
       {
        String host = "192.168.10.118";
        String from = "tanweer@localhost";
        String to = "test@localhost"; 
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        Session session = Session.getDefaultInstance(properties);
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject("hi..!");
        message.setText("Hi ......");
        Transport.send(message);
        System.out.println("Message Send.....");
        }
catch(Exception e)
{
System.out.println(e);
}
}
}
