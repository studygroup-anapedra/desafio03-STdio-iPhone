package com.anapedra.iphone.model;

import com.anapedra.iphone.model.impl.InternetImpl;

import java.util.Objects;

public class Internet implements InternetImpl {

    private Long id;

    private IPhone iPhone;
    private String description;

    public Internet() {
    }

    public Internet(Long id, IPhone iPhone, String description) {
        this.id = id;
        this.iPhone = iPhone;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IPhone getiPhone() {
        return iPhone;
    }

    public void setiPhone(IPhone iPhone) {
        this.iPhone = iPhone;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void displayWebPage() {
        System.out.println("Exibindo página");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando aba");
    }

    @Override
    public void updatePage() {

        System.out.println("Atualizando Página");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Internet internet = (Internet) o;
        return Objects.equals(id, internet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Internet{" +
                "id=" + id +
                ", iPhone=" + iPhone +
                ", description='" + description + '\'' +
                '}';
    }


}