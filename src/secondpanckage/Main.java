package secondpanckage;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact[] contacts = new Contact[]{
                new Contact(220183491, "Ajybek"),
                new Contact(505183201, "Myrzaiym"),
                new Contact(707229456, "Gulumkan"),
                new Contact(29458292, "Nurmuhammed")
        };

        System.out.println();
        System.out.print("Enter phone name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        Phone phone = new Phone(brand, name, password, contacts);

        System.out.println();
        System.out.println("Enter the password to turn on phone");
        phone.turnOn(scanner.nextLine());
        System.out.println("Contacts: ");
        System.out.println(Arrays.toString(contacts));

        System.out.println();
        System.out.println("CALL BY PHONE NUMBER");
        System.out.println("Enter phone number to call: ");
        phone.call(new Scanner(System.in).nextLong());

        System.out.println();
        System.out.println("CALL BY NAME");
        System.out.println("Enter contact's name to call: ");
        phone.call(scanner.nextLine());

        System.out.println();
        System.out.println("SEARCH CONTACT");
        System.out.println("Enter name: ");
        phone.searchContact(scanner.nextLine());

        System.out.println();
        System.out.println("CONTACT UPDATE");
        System.out.println("Enter old name: ");
        String oldName = scanner.nextLine();
        System.out.println("Enter new name: ");
        String newName = scanner.nextLine();
        phone.contactUpdate(oldName, newName);

        System.out.println();
        System.out.println("GET ALL CONTANCTS");
        phone.getAllContacts(contacts);
    }
}
