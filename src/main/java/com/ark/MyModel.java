package com.ark;

import javax.persistence.*;

@Entity
@Table(name = "MY_MODEL")
@NamedQuery(name = "MyModel.getAllData",
            query = "select s.data from MyModel s")
public class MyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String data;

    public MyModel() {
    }

    public MyModel(String data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
