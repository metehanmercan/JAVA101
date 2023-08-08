package org.example.java101.kodlamaio.oopwithNLayeredApp.core.loging;

public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("mail gönderildi: "+ data);
    }
}
