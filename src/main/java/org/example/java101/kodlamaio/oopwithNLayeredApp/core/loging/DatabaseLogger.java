package org.example.java101.kodlamaio.oopwithNLayeredApp.core.loging;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("veri tabanına loglandı: "+ data);
    }
}
