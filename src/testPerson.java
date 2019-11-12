//Class: CS 5000
//Term: Fall 2019
//Name: Ernst Fanfan
//Instructor: Dr. Haddad
//Assignment: 10
//IDE Name: IntelliJ

import java.util.Scanner;

public class testPerson {
    public static void main (String[] Args){
        //Init & Decl
        int exit = 0;
        Scanner inputString = new Scanner(System.in);
        Scanner inputDouble = new Scanner(System.in);

        //main program
        while (exit != 1) {//exit loop
            //Person object
            System.out.println("Person test:");
            System.out.print("Name:\t \t");
            String name = inputString.nextLine();
            System.out.print("Address:\t");
            String address = inputString.nextLine();
            System.out.print("Phone:\t \t");
            String phone = inputString.nextLine();
            Person one = new Person(name, address, phone);
            System.out.println(one);
            System.out.println("************************************");

            //Student object
            System.out.println("Student test:");
            System.out.print("Name:\t \t");
            name = inputString.nextLine();
            System.out.print("Address:\t");
            address = inputString.nextLine();
            System.out.print("Phone:\t \t");
            phone = inputString.nextLine();
            Student two = new Student(name, address, phone);
            System.out.println(two);
            System.out.println("************************************");

            //Employee object
            System.out.println("Employee test:");
            System.out.print("Name:\t \t");
            name = inputString.nextLine();
            System.out.print("Address:\t");
            address = inputString.nextLine();
            System.out.print("Phone:\t \t");
            phone = inputString.nextLine();
            System.out.print("Salary:\t \t");
            double salary = inputDouble.nextDouble();
            Employee three = new Employee(name, address, phone, salary);
            System.out.println(three);
            System.out.println("************************************");

            //Visitor object
            System.out.println("Visitor test:");
            System.out.print("Name:\t \t");
            name = inputString.nextLine();
            System.out.print("Address:\t");
            address = inputString.nextLine();
            System.out.print("Phone:\t \t");
            phone = inputString.nextLine();
            System.out.print("Visit reason:\t \t");
            String visit = inputString.nextLine();
            Visitor four = new Visitor(name, address, phone, visit);
            System.out.println(four);
            System.out.println("************************************");

            //Faculty object
            System.out.println("Faculty test:");
            System.out.print("Name:\t \t");
            name = inputString.nextLine();
            System.out.print("Address:\t");
            address = inputString.nextLine();
            System.out.print("Phone:\t \t");
            phone = inputString.nextLine();
            System.out.print("Salary:\t \t");
            salary = inputDouble.nextDouble();
            System.out.print("Office#:\t");
            String office = inputString.nextLine();
            Faculty five = new Faculty(name, address, phone, salary, office);
            System.out.println(five);
            System.out.println("************************************");

            //Staff object
            System.out.println("Staff test:");
            System.out.print("Name:\t \t");
            name = inputString.nextLine();
            System.out.print("Address:\t");
            address = inputString.nextLine();
            System.out.print("Phone:\t \t");
            phone = inputString.nextLine();
            System.out.print("Salary:\t \t");
            salary = inputDouble.nextDouble();
            System.out.print("Title:\t \t");
            String title = inputString.nextLine();
            Staff six = new Staff(name, address, phone, salary, title);
            System.out.println(six);
            System.out.println("************************************");

            //exit loop
            exit = exitLoop();
        }
    }

    public static int exitLoop(){
        //Init and decl
        Scanner inputInt = new Scanner(System.in);
        int exit = 0;
        while(exit !=2 && exit !=1){
            //prompt for exit
            System.out.println("\n \nExit:");
            System.out.println("\t \t1. Yes\n\t \t2. No");
            System.out.print("\t \t::");
            //scan
            exit = inputInt.nextInt();
            //validation
            if (exit != 2 && exit != 1)
                System.out.println("Invalid input.");
        }
        //return choice
        return exit;
    }
}
