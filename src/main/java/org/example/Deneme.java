import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        int mat,fizik,tukce,kimya,muzik;
        Scanner input=new Scanner(System.in);

        System.out.println("matematik notunu gir:");
        mat= input.nextInt();
        if((mat<0) || (mat>100)){
            mat=0;
        }

        System.out.println("fizik notunu gir:");
        fizik= input.nextInt();
        if((fizik<0) || (fizik>100)){
            fizik=0;
        }

        System.out.println("türkçe notunu gir:");
        tukce= input.nextInt();
        if((tukce<0) || (tukce>100)){
            tukce=0;
        }

        System.out.println("kimya notunu gir:");
        kimya= input.nextInt();
        if((kimya<0) || (kimya>100)){
            kimya=0;
        }

        System.out.println("müzik notunu gir:");
        muzik= input.nextInt();
        if((muzik<0) || (muzik>100)){
            muzik=0;
        }

        double avarege=(mat+kimya+muzik+fizik+tukce) / 5;
        System.out.println("ortalamanız:" + avarege);

        if (avarege<55){
            System.out.println("geçtiniz.");
        }else{
            System.out.println("kaldınız");
        }
        input.close();
    }
}
