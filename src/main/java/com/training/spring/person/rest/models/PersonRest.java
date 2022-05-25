package com.training.spring.person.rest.models;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class PersonRest {

    @NotEmpty
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$")
    private String password;
    @NotEmpty(message = "name null olamaz")
    @Size(min = 2,max = 20)
    private String name;
    @NotEmpty(message = "surname null olamaz")
    @Size(min = 3,max = 25)
    private String surname;
    @NotNull
    @Max(300)
    @Min(10)
    private Integer weight;
    @NotNull
    @Positive
    @Max(300)
    @Min(50)
    private Integer height;
    @Past
    private LocalDate birthday;

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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", birthday=" + birthday +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
