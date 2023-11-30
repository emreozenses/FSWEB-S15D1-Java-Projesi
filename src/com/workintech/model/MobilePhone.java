package com.workintech.model;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){

        if(findContact(contact.getName())>=0){
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }

    public int findContact (String contactName){
        for (int i=0;i<myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equalsIgnoreCase(contactName)){
                return i;

            }

        }
        return -1;
    }

    public int findContact (Contact contact){
        return this.myContacts.indexOf(contact);
    }

    public Contact queryContact(String contactName){
    int indexNumber = findContact(contactName);
    if(indexNumber<0){
        return null;
    }
    return myContacts.get(indexNumber);
    }

    public void printContacts() {

        for (Contact contact : myContacts) {
            System.out.println((myContacts.indexOf(contact)+1)+"."+ contact.getName() +" -> "+ contact.getPhoneNumber());
        }
    }


    public boolean updateContact(Contact newContact,Contact oldContact){

        int contactIndex = findContact(oldContact.getName());
        if (contactIndex<0){
            return false;
        }
        this.myContacts.set(contactIndex,newContact);
        return true;
    }

    public boolean removeContact(String removedContactName){
        int removedContact = findContact(removedContactName);
        if(removedContact<0){
            return false;
        }
        this.myContacts.remove(removedContact);
        return true;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "myNumber='" + myNumber + '\'' +
                ", myContacts=" + myContacts +
                '}';
    }
}
