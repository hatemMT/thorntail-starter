package com.ark.hello;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class HelloRepository {
    @PersistenceContext(unitName = "app-punit")
    private EntityManager entityManager;

    public List<String> getAllStrings() {
        return entityManager.createNamedQuery("MyModel.getAllData", String.class)
                            .getResultList();
    }

    @Transactional
    public MyModel add(String string) {
        MyModel obj = new MyModel(string);
        entityManager.persist(obj);
        return obj;
    }
}
