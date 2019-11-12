import java.util.Scanner;

public class Student extends Person {
    private String year = "Freshmen";
    public Student (){
        Scanner inputString = new Scanner(System.in);

        //set super variables
        System.out.print("Student Name:\t");
        super.setName(inputString.nextLine());
        System.out.print("Address:\t");
        super.setAddress(inputString.nextLine());
        System.out.print("Phone:\t\t");
        super.setPhoneNumber(inputString.nextLine());

        //set year
        setYear();
    }
    //set
    public void setYear() {
        int exit = 0;//exit trigger
        String year = "";
        Scanner inputString = new Scanner(System.in);//scanner
        //data validation
        while(exit != 1) {
            System.out.print("What year is the Student?\n\tFreshmen\n\tSophomore\n\tJunior\n\tSenior\n\t \t::");//prompt
            year = inputString.nextLine();//scan
            if (year.compareTo("Freshmen") != 0 && year.compareTo("Sophomore") != 0 && year.compareTo("Junior") != 0 && year.compareTo("Senior") != 0) {//data check
                System.out.println("Invalid entree");//not good
            } else {//good
                this.year = year;//set year
                exit = 1;//set exit loop trigger to exit
            }
        }
    }
    //get
    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return super.toString()+"\nYear:\t \t"+year;
    }
}
