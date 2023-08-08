package org.example.java101.kodlamaio.oopwithNLayeredApp;

import org.example.java101.kodlamaio.oopwithNLayeredApp.business.ProductManager;
import org.example.java101.kodlamaio.oopwithNLayeredApp.core.loging.DatabaseLogger;
import org.example.java101.kodlamaio.oopwithNLayeredApp.core.loging.FileLogger;
import org.example.java101.kodlamaio.oopwithNLayeredApp.core.loging.Logger;
import org.example.java101.kodlamaio.oopwithNLayeredApp.dataAccess.HibernateProductDao;
import org.example.java101.kodlamaio.oopwithNLayeredApp.dataAccess.JdbcProductDao;
import org.example.java101.kodlamaio.oopwithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1=new Product(1,"Iphone XR",10000 );
        Logger[] logers={new DatabaseLogger(),new FileLogger()};

        ProductManager productManager=new ProductManager(new HibernateProductDao(),logers);
        productManager.Add(product1);



    }

}
