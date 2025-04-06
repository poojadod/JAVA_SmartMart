/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author Samarth
 */
public class SendMail {

    private static final String SMTP_HOST = "smtp.gmail.com";
    private static final String SMTP_PORT = "587";
    private static final String EMAIL_FROM = "xyz@gmail.com";
    private static final String APP_PASSWORD = "qefqdwefwqf"

    private String subject;
    private String message;

    public SendMail(String toEmail, String subject, String message) {
        this.subject = subject;
        this.message = message;
        try {
            sendEmail(toEmail);
        } catch (Exception e) {
            System.err.println("Failed to send email: " + e.getMessage());
                 }
    }

    private void sendEmail(String toEmail) throws MessagingException {
        // Configure email server properties
        Properties props = new Properties();
        props.put("mail.smtp.host", SMTP_HOST);
        props.put("mail.smtp.port", SMTP_PORT);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        // Create session with authenticator
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL_FROM, APP_PASSWORD);
            }
        });

        try {
            // Create message
            Message mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(EMAIL_FROM));
            mimeMessage.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(toEmail));
            mimeMessage.setSubject(subject);
            mimeMessage.setText(message);

            // Send message
            Transport.send(mimeMessage);
            System.out.println("Email sent successfully to " + toEmail);

        } catch (MessagingException e) {
            System.err.println("Email send failed: " + e.getMessage());
            // Show error but don't prevent order completion
            javax.swing.SwingUtilities.invokeLater(() -> {
                javax.swing.JOptionPane.showMessageDialog(null,
                        "Order placed successfully but email notification failed.\n"
                        + "Please check your email settings.",
                        "Email Warning",
                        javax.swing.JOptionPane.WARNING_MESSAGE);
            });
        }
    }
}
