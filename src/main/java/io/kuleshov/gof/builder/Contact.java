package io.kuleshov.gof.builder;

public class Contact {
    private final String name;

    private final String surName;

    private final String mail;

    private final String phone;

    private final String address;

     Contact(final ContactBuilder contactBuilder) {
        this.name = contactBuilder.getName();
        this.surName = contactBuilder.getSurName();
        this.mail = contactBuilder.getMail();
        this.phone = contactBuilder.getPhone();
        this.address = contactBuilder.getAddress();
    }

    public static void main(String[] args) {
final  Contact contact = new ContactBuilder()
        .name("Slave")
        .surName("sur")
        .address("add")
        .phone("555-55-55")
        .mail("mail@mail.com")
        .build();
    }
}


