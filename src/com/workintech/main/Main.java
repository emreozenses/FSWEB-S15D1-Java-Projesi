package com.workintech.main;

import com.workintech.model.GroceryList;

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
        while(choice !=0);
scanner.close();

    }
}