package com.blz.addressbook;
import java.util.*;

public class AddressBookMain {
    public AddressBookMain(String fname, String lname, String address, String city, String state, String email, String number, String zip) {
    }

    public static void main(String[] args) {
        System.out.println("Welcome to address book system");

        Collection<AddressBookMain> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        int ch;
        System.out.println("To enter a record press 1 or 0 to exit");
        ch = c.nextInt();
        while (ch != 0) {
            System.out.println("Enter the first name - ");
            String fname = sc.nextLine();
            System.out.println("Enter the last name - ");
            String lname = sc.nextLine();
            System.out.println("Enter the address - ");
            String address = sc.nextLine();
            System.out.println("Enter the city - ");
            String city = sc.nextLine();
            System.out.println("Enter the state - ");
            String state = sc.nextLine();
            System.out.println("Enter the email - ");
            String email = sc.nextLine();
            System.out.println("Enter the contact number - ");
            String number = sc.nextLine();
            System.out.println("Enter the zip code- ");
            String zip = sc.nextLine();

            a.add(new AddressBookMain(fname, lname, address, city, state, email, number, zip));
            System.out.println("To enter a record press 1or 0 to exit");
            ch = c.nextInt();
        }
        System.out.println(" Contacts ");
        Iterator<AddressBookMain> i =a.iterator();
        while (i.hasNext()){
            AddressBookMain address = i.next();
            System.out.println(address);
        }
    }
}
