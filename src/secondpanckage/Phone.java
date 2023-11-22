package secondpanckage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Phone implements PhoneInterface{
    private String brand;
    private String name;
    private String password;
    Contact[] contacts;


    public Phone(String brand, String name, String password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }





    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public void turnOn(String password) {
            if (this.password.equals(password)) {
                System.out.println("\nPhone is turn oned");
            } else {
                String pp;
                Loop:
                do {
                    System.out.println("Invalid password");
                    System.out.println("Enter password: ");
                    pp = new Scanner(System.in).nextLine();
                }while (!pp.equals(this.password));
                if(pp.equals(this.password)) {
                    System.out.println("\nPhone is turn oned!");
                }
            }
    }

    @Override
    public void call(long number) {
        boolean isTrue = true;
        for (int i = 0; i < contacts.length; i++) {
            if(contacts[i].getPhoneNumber()==number){
                isTrue = true;
                System.out.println("You are calling to " + contacts[i].getFullName());
            }
        }
        if(isTrue!=true) {
            System.out.println("Contact is not found!");
        }
    }

    @Override
    public void call(String name) {
        boolean isTrue = true;
        for (int i = 0; i < contacts.length; i++) {
            if(contacts[i].getFullName().equals(name)){
                isTrue = true;
                System.out.println("You are calling to " + contacts[i].getPhoneNumber());
            }
        }
        if(isTrue!=true){
            System.out.println("Contact is not found!");
        }
    }

    @Override
    public void searchContact(String name) {
        boolean isTrue = true;
        for (Contact contact : contacts) {
            if(name.equals(contact.getFullName())){
                isTrue = true;
                System.out.println(contact);
            }
        }
        if(isTrue!=true){
            System.out.println("Contact is not found!");
        }
    }

    @Override
    public void contactUpdate(String oldName, String newName) {
        boolean isTrue = true;
        for (Contact contact : contacts) {
            if(contact.getFullName().equals(oldName)){
                isTrue = true;
                contact.setFullName(newName);
                System.out.println(oldName + " changed to new name: " + newName);
            }
        }
        if(isTrue!=true){
            System.out.println("Contact is not found whith this name: " + oldName);
        }
    }

    @Override
    public void getAllContacts(Contact[] contacts) {
        System.out.println(Arrays.toString(contacts));
    }
}
