package org.example.java101.kodlamaio.oopwithNLayeredApp.core.loging;

public class FileLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("dosyaya loglandı: "+ data);
    }
}
