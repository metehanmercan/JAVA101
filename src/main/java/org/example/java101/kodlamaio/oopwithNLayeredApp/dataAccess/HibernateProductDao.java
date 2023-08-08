package org.example.java101.kodlamaio.oopwithNLayeredApp.dataAccess;

import org.example.java101.kodlamaio.oopwithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product) {
        // sadece ve sadece db erişim kodları buraya yazılır...SQL
        System.out.println("Hibernate ile veri tabanına eklendi ");
    }
}
