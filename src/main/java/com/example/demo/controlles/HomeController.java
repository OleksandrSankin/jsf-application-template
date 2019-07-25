package com.example.demo.controlles;

import com.example.demo.Car;
import com.example.demo.repos.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.util.Date;

@Named
public class HomeController {

    private String name;

    private String surname;

    @Autowired
    private CarRepository carRepository;

    public void saveCar() {
        Car car = new Car();
        car.setName("toyota");
        car.setNumber(555);
        car.setDate(new Date());
        carRepository.save(car);
    }

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
