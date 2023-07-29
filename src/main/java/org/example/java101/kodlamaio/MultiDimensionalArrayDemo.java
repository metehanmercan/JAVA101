package org.example.java101.kodlamaio;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        String[][] citys = new String[3][3];

        citys[0][0] = "adana";
        citys[0][1] = "mersin";
        citys[0][2] = "osmaniye";
        citys[1][0] = "izmir";
        citys[1][1] = "muğla";
        citys[1][2] = "aydın";
        citys[2][0] = "antep";
        citys[2][1] = "Adıyaman";
        citys[2][2] = "maraş";

        for (String[] city : citys) {
            for (String bolge : city) {
                System.out.print(bolge + " ");
            }
            System.out.println();
        }

    }
}
