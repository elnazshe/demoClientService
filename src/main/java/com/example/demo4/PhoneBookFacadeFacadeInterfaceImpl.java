package com.example.demo4;

import java.util.List;

public class PhoneBookFacadeFacadeInterfaceImpl implements PhoneBookFacadeInterface {
    ServiceImpl service =new ServiceImpl();


    @Override
    public String addToPhoneBook(String name, String number, String lastName, Gender gender, TypePhone typePhone) {
        return service.addToPhoneBook( name, number, lastName, gender, typePhone);
    }

    @Override
    public List<String> show() {
        return service.show();
    }

    @Override
    public String search(String name) {
        return service.search(name);
    }
}


