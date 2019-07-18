package com.example.demo.controlles;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
public class HomeController {

    private String name;

    private String surname;

    @PostConstruct
    private void init() {

    }

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
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Successful123",  "Hello444"));
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "234324",  "456456456"));
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "456546",  "456546"));

        System.out.println("Hello1 " + name + " " + surname);
    }
}
