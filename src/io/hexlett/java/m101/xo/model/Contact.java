package io.hexlett.java.m101.xo.model;

public class Contact {
    private final String name;
    private final String surname;
    private final String mail;
    private final String phone;
    private final String address;

    Contact(final ContactBuilder contactBuilder) {
        this.name = contactBuilder.getName();
        this.surname = contactBuilder.getSurname();
        this.mail = contactBuilder.getMail();
        this.phone = contactBuilder.getPhone();
        this.address = contactBuilder.getAddress();
    }


//    public static void main(String[] args) {
//        new Contact("name", "surname", "mail", "phone", "address");
//    }
}
