package com.example.demo4;

public class Person {
    private String name;
    private String lastName;
    private String number;
    private Gender gender;
    private TypePhone  typePhone;

    public Person(){

    }

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String getLastNameName(){return lastName;}
    public void setLastName(String lastName){this.lastName=lastName;}

    public String getNumber(){return number;}
    public void setNumber(String number){this.number=number;}

    public Gender getGender(){return gender;}
    public void setGender(Gender gender){this.gender=gender;}

    public TypePhone getTypePhone(){return typePhone;}
    public void setTypePhone(TypePhone typePhone){this.typePhone=typePhone;}

    public Person(String name,String lastName,String number,Gender gender,TypePhone typePhone)
    {
        this.name=name;
        this.lastName=lastName;
        this.number=number;
        this.gender=gender;
        this.typePhone=typePhone;

    }

    @Override
    public String toString(){
        return "name:" + name + "family:" + lastName + "gender:" + gender +"phone number:" +number+ "type phone:"+typePhone;
    }


}


