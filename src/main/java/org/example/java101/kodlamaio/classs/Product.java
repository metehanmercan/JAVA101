package org.example.java101.kodlamaio.classs;

public class Product {


    public Product(int id,String name,String description,double price,int stockAmount,String renk){
        System.out.println("kurucu metot çalıştı");
        this.id=id;
        this.name=name;
        this.renk=renk;
        this.price=price;
        this.description=description;
        this.stockAmount=stockAmount;
    }

    // attribute veya field
    private int id;
    private String name;
    private String description;   //açıklama
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }


    // kodu yazamasın
    /*public void setKod(String kod) {
        this.kod = kod;
    }

     */
}
