package ru.gb.Denisov.level_1.HomeWork5;

public class Person {
    private String fullName;
    private String email;
    private String position;
    private String phoneNumber;
    private int salary;
    private int age;

    Person (String fullName, String position, String email, String phoneNumber, int salary, int age){
        this.fullName = fullName;
        this.position=position;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.salary=salary;
        this.age=age;
    }

    String getFullName (){
        return this.fullName;
    }
    int getSalary(){
        return this.salary;
    }
    int getAge(){
        return this.age;
    }
    String getEmail(){
        return this.email;
    }
    String getPosition(){
        return this.position;
    }
    String getPhoneNumber(){
        return this.phoneNumber;
    }
    void printInfo (){
        System.out.println(getFullName()+" "+
                getPosition()+" "+ getEmail()+" "+
                getPhoneNumber()+" "+getSalary()+" "+
                getAge());

    }

}
