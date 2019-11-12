//Class: CS 5000
//Term: Fall 2019
//Name: Ernst Fanfan
//Instructor: Dr. Haddad
//Assignment: 10
//IDE Name: IntelliJ

import java.util.Date;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Faculty extends Employee {
    //states
    String officeNumber;
    String rank;
    //constructor
    public Faculty(String name, String address, String phone, double salary, String office){
        super.setName(name);
        super.setAddress(address);
        super.setPhoneNumber(phone);
        super.setSalary(salary);
        super.setDateHired();
        this.officeNumber = office;
        setRank();
    }
    //get
    public String getOfficeNumber() {
        return officeNumber;
    }
    public String getRank() {
        return rank;
    }
    //set
    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
    public void setRank() {
        int exit = 0;//exit trigger
        String rank = "";
        Scanner inputString = new Scanner(System.in);//scanner
        //data validation
        while(exit != 1) {
            System.out.print("What rank is the faculty?\n\tAssistant Professor\n\tAssociate Professor\n\tFull Professor\n\t \t::");//prompt
            rank = inputString.nextLine();//scan
            if (rank.compareTo("Assistant Professor") != 0 && rank.compareTo("Associate Professor") != 0 && rank.compareTo("Full Professor") != 0) {//data check
                System.out.println("Invalid entree");//not good
            } else {//good
                this.rank = rank;//set rank
                exit = 1;//set exit loop trigger to exit
            }
        }
    }
    //to string
    @Override
    public String toString() {
        DecimalFormat dollar = new DecimalFormat("$###,##0");
        return "\nFaculty Object:\n\tName:\t \t"+getName()+"\n\tAddress:\t"+getAddress()+"\n\tPhone:\t \t"+getPhoneNumber()+"\n\tSalary:\t \t"+dollar.format(getSalary())+"\n\tDate Hired:\t"+getDateHired()+"\n\tOffice:\t \t"+officeNumber+"\n\tRank:\t \t"+rank;
    }
}
