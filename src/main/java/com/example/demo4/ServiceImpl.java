package com.example.demo4;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl {


    List<Person> personList =new ArrayList<>();
    public String addToPhoneBook( String name, String number, String lastName, Gender gender , TypePhone typePhone) {
        personList.add(new Person(name,lastName,number,gender,typePhone));
        return "successfully added";
    }

    public List<String> show() {

        List<String> myList = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            myList.add(personList.get(i).toString());
        }

        return myList;

    }

    public String search( String name) {
        String searchResult = null;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(name))
                searchResult = this.personList.get(i).toString();
            else
                searchResult = "Not Founded";


        }
        return searchResult;
    }

}

