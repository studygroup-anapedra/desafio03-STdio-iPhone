package com.anapedra.iphone.model;

import java.util.Objects;

public class IPhone {

    private Long id;
    private String description;
    private String model;

    private Phone phone;
    private Internet internet;

    private Ipod ipod;


    public IPhone() {
    }

    public IPhone(Long id, String description, String model, Phone phone, Internet internet, Ipod ipod) {
        this.id = id;
        this.description = description;
        this.model = model;
        this.phone = phone;
        this.internet = internet;
        this.ipod = ipod;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Internet getInternet() {
        return internet;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }

    public Ipod getIpod() {
        return ipod;
    }

    public void setIpod(Ipod ipod) {
        this.ipod = ipod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IPhone iPhone = (IPhone) o;
        return Objects.equals(id, iPhone.id) && Objects.equals(description, iPhone.description) && Objects.equals(model, iPhone.model) && Objects.equals(phone, iPhone.phone) && Objects.equals(internet, iPhone.internet) && Objects.equals(ipod, iPhone.ipod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, model);
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}