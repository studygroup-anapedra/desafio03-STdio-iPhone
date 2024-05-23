package com.anapedra.iphone.model;

import com.anapedra.iphone.model.enums.PhoneType;

import java.util.Objects;

public class PhoneContact {


    private Long id;

    private Phone phone;
    private Integer phoneType;
    private String nome;
    private String telefone;

    public PhoneContact() {
    }

    public PhoneContact(Long id, Phone phone, PhoneType phoneType, String nome, String telefone) {
        this.id = id;
        this.phone = phone;
        setPhoneType(phoneType);
        this.nome = nome;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public PhoneType getPhoneType(){
        return PhoneType.valueOf(phoneType);
    }

    public void setPhoneType(PhoneType phoneType) {
        if (phoneType != null){
            this.phoneType = phoneType.getCode();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneContact contato = (PhoneContact) o;
        return Objects.equals(id, contato.id) && Objects.equals(phoneType, contato.phoneType) && Objects.equals(nome, contato.nome) && Objects.equals(telefone, contato.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneType, nome, telefone);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", phone=" + phone +
                ", phoneType=" + phoneType +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
