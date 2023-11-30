package com.workintech.model;

import java.util.*;
import java.util.Collections;

public class GroceryList {

    private ArrayList<String> items;

    public GroceryList() {
        this.items = new ArrayList<>();
    }

    public void addItems(String items ){
        String[] splitedItems = items.split(",");
      for(String item: splitedItems ){
          String trimmedItem  = item.trim();
          if(checkItemIsList(trimmedItem)){
              System.out.println("Girdiginiz"+item+ " listede bulunmaktadir");

          }
          else {
              this.items.add(trimmedItem);
          }
      printSorted();
      }
        System.out.println(this.items);

    }
    public boolean checkItemIsList(String item){
            return items.contains(item);
        }

    public void printSorted(){
        Collections.sort(this.items);

    }


    public void removeItems(String items){
        String[] splitedItems = items.split(",");
        for(String item: splitedItems ){
            String trimmedItem  = item.trim();
            if(!(checkItemIsList(trimmedItem))){
                System.out.println("Girdiginiz"+item+ " listede bulunmamaktadir");

            }
            else {
                this.items.remove(trimmedItem);
            }
            printSorted();
        }
        System.out.println(this.items);

    }

    @Override
    public String toString() {
        return "groceryList{" +
                "items=" + items +
                '}';
    }
}
