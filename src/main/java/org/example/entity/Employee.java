package org.example.entity;

import java.util.Objects;

public class Employee {
    private  int id;
    private String firstName;
    private  String lastName;

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String firstName) {
        this.firstName = firstName;
    }
    public Employee(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                '}'
    }
}
