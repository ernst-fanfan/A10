import java.util.Date;
import java.util.Scanner;

public class Faculty extends Employee {
    //states
    String officeNumber;
    String rank;
    //constructor
    public Faculty(String name, String address, String phone, double salary, String office, String rank){
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
            System.out.print("What year is the Student?\n\tFreshmen\n\tSophomore\n\tJunior\n\tSenior\n\t \t::");//prompt
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
        return super.toString()+"\nOffice:\t"+officeNumber+"\nRank:\t \t"+rank;
    }
}
