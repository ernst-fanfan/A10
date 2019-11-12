//Class: CS 5000
//Term: Fall 2019
//Name: Ernst Fanfan
//Instructor: Dr. Haddad
//Assignment: 10
//IDE Name: IntelliJ

import java.util.Date;
import java.text.DecimalFormat;

public class Employee extends Person{
    //states
    private double salary = 0;
    private Date dateHired;
    //constructor
    public Employee(){//non-Args
        dateHired = new Date();
    }
    public Employee(String name, String address, String phone, double salary){//with args
        super.setName(name);
        super.setAddress(address);
        super.setPhoneNumber(phone);
        this.salary = salary;
        dateHired = new Date();
    }
    //get
    public double getSalary() {
        return salary;
    }
    public Date getDateHired() {
        return dateHired;
    }
    //set
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired() {
        this.dateHired = new Date();
    }
    //to string

    @Override
    public String toString() {
        DecimalFormat dollar = new DecimalFormat("$###,##0");
        return "\nEmployee Object:\n\tName:\t \t"+getName()+"\n\tAddress:\t"+getAddress()+"\n\tPhone:\t \t"+getPhoneNumber()+"\n\tSalary:\t \t"+dollar.format(salary)+"\n\tDate Hired:\t"+dateHired;
    }
}
