package org.example.java101.kodlamaio;

public class SesliHarf {
    public static void main(String[] args) {

        char harf ='Ö';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("kalın sesli harf:"+ harf);
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("ince sesli harf:"+harf);
                break;
            default:
                System.out.println("sessiz harf:"+harf);
        }
    }
}
