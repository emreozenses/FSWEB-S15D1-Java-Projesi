package com.workintech.main;

import com.workintech.model.Contact;
import com.workintech.model.GroceryList;
import com.workintech.model.MobilePhone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GroceryList pazarListesi = new GroceryList();
        int choice;

        do {
            System.out.println("Yapilmak istenen islemi seciniz. 0: cikis | 1:ekleme | 2:silme");
            choice = scanner.nextInt();
            //scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Eklenmesini istediginiz elemanlari giriniz.Birden cok eleman eklemek icin aralarinda virgul kullaniniz.");
                    String addedItems = scanner.next();
                    pazarListesi.addItems(addedItems);
                    break;
                    case 2:
                    System.out.println("Silinmesini istediginiz elemanlari giriniz.Birden cok eleman eklemek icin aralarinda virgul kullaniniz.");
                        String removedItems = scanner.next();
                        pazarListesi.removeItems(removedItems);
            }
            pazarListesi.printSorted();
        }
        while(choice != 0);
scanner.close();


        Contact emre  =  new Contact("Emre","5398237309");
        Contact goksen  =  new Contact("Goksen","5355712309");
        Contact burcin  =  new Contact("Burcin","5356332531");
        Contact erdi  =  new Contact("Erdi","5356338796");

        MobilePhone samsungS23 = new MobilePhone("5356337309");
        samsungS23.addNewContact(emre);
        samsungS23.addNewContact(goksen);
        samsungS23.addNewContact(burcin);
        samsungS23.addNewContact(erdi);
        System.out.println("Initial contacts started");
        samsungS23.printContacts();
        System.out.println("Initial contacts ended");

        System.out.println("Update  started");
        samsungS23.updateContact(new Contact("emre","5987412536"),emre);
        samsungS23.printContacts();
        System.out.println("Update  ended");

        System.out.println("Remove  started");
        samsungS23.removeContact("erdi");
        samsungS23.printContacts();
        System.out.println("Remove  ended");

        System.out.println("Query  started");
        Contact contact = samsungS23.queryContact("emre");
        System.out.println(contact.getName() +"--"+ contact.getPhoneNumber());
        System.out.println("Query  ended");




    }
}