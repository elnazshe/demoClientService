package com.example.demo4;

import java.util.List;


public interface PhoneBookInterface {
    String addToPhoneBook( String name, String number, String lastName, Gender gender , TypePhone typePhone);
    List<String> show();
    String search( String name);
}


