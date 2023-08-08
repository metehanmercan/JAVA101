package org.example.java101.kodlamaio.oopwithNLayeredApp.business;

import org.example.java101.kodlamaio.oopwithNLayeredApp.core.loging.Logger;
import org.example.java101.kodlamaio.oopwithNLayeredApp.dataAccess.HibernateProductDao;
import org.example.java101.kodlamaio.oopwithNLayeredApp.dataAccess.JdbcProductDao;
import org.example.java101.kodlamaio.oopwithNLayeredApp.dataAccess.ProductDao;
import org.example.java101.kodlamaio.oopwithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void Add(Product product) throws Exception {
        // iş kuralları
        if (product.getUnitPrice() < 10) {
            throw new Exception("ürün fiyatı 10 dan küçük olamaz");
        }
        productDao.add(product);

        for (Logger logger:loggers ) {
          logger.log(product.getName());
        }
    }
}
