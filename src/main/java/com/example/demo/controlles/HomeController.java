package com.example.demo.controlles;

import javax.inject.Named;

@Named
public class HomeController {

    private String name;

    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String sayHello1() {
        System.out.println("Hello2 " + name + " " + surname);
        return "hello.xhtml?faces-redirect=true&name=" + name;
    }

    public void sayHello2() {
        System.out.println("Hello1 " + name + " " + surname);
    }
}
