package com.anapedra.iphone.model;

import com.anapedra.iphone.model.enums.PhoneType;
import com.anapedra.iphone.model.impl.PhoneImpl;

import java.util.*;

public class Phone implements PhoneImpl {

    private Long id;

    private IPhone iPhone;
    private String description;

    private List<PhoneContact> contacts=new ArrayList<>();

    public Phone() {
    }

    public Phone(Long id, IPhone iPhone, String description) {
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

    public void setDescription(String description) {
        this.description = description;
    }


    public void ListContact() {
        Phone phone = new Phone(1L,iPhone,"phone");
        PhoneContact c1 = new PhoneContact(1L,phone, PhoneType.HOME,"Amada","06125918766");
        PhoneContact c2 = new PhoneContact(2L,phone, PhoneType.HOME,"Amada","061336942456");
        PhoneContact c3 = new PhoneContact(3L,phone,PhoneType.WHATSAPP,"Flavio","06112598766");
        PhoneContact c4 = new PhoneContact(4L,phone ,PhoneType.WORK,"Flavio","06133692456");
        PhoneContact c5 = new PhoneContact(5L,phone,PhoneType.HOME,"Ana","06125498766");
        PhoneContact c6 = new PhoneContact(6L,phone, PhoneType.HOME,"Ana","061336792456");
        PhoneContact c7 = new PhoneContact(7L,phone,PhoneType.WHATSAPP,"Marcos","06125989766");
        PhoneContact c8 = new PhoneContact(8L,phone,PhoneType.WORK,"Sandra","061533692456");
        contacts.addAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8));


    }


    @Override
    public void makePhoneColl() {
        Scanner scanner = new Scanner(System.in);
        ListContact();
        String numero = "";
        String numeroTelefone= "";
        String name = "";

        System.out.println();
        System.out.println("Digite o digite um numero: ");
        numero = scanner.nextLine();
        for (PhoneContact n: contacts ) {
            if (n.getTelefone().equals(numero)) {
                numeroTelefone = n.getTelefone();
                name = n.getNome();
            }
        }
        String contact = (numeroTelefone.equalsIgnoreCase(numero)) ? "Chamando " + name : "A númro, "+ numero +", não existe na lista de contatos\nchamando númro: "+ numero;
        System.out.println(contact);


    }


    public void getContacts() {
       ListContact();
        for (PhoneContact c : contacts) {
            System.out.println("\nNome: " + c.getNome() + " \nTelefone: " + c.getTelefone());
        }


    }

    public void getNumber() {
        for (PhoneContact c : contacts) {
            String number = c.getTelefone();
        }
    }


    @Override
    public void  answerPhoneCall() {

        System.out.println("Atendendo ligação");


    }

    @Override
    public void startVoiceMail() {
        System.out.println("Iniciando correio voz");

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(id, phone.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", iPhone=" + iPhone +
                ", description='" + description + '\'' +
                ", contacts=" + contacts +
                '}';
    }

}