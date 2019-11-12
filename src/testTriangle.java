
import java.util.Scanner;

public class testTriangle {
    public static void main (String[] Args) {
        int exit = 0;
        while (exit != 1) {
            //instanciate two triangle
            Triangle myTriangle = new Triangle();//test non-argument constructor
            Triangle yourTriangle = new Triangle("yourTriangle", 3, 3, 5);//test constructor

            //test set methods
            myTriangle.setColor("black");
            myTriangle.setFilled(true);
            yourTriangle.setColor("Pink");
            yourTriangle.setFilled(true);

            //test get methods
            System.out.println("************************************************");
            System.out.println("yourTriangle's color is " + yourTriangle.getColor() + ".");
            System.out.println("yourTriangle's perimeter is " + yourTriangle.getPerimeter() + ".");
            System.out.println("yourTriangle's area is " + yourTriangle.getArea() + ".");
            System.out.println("yourTriangle's 1st side is " + yourTriangle.getSide1() + " long.");
            System.out.println("yourTriangle's 2nd side is " + yourTriangle.getSide2() + " long.");
            System.out.println("yourTriangle's 3rd side is " + yourTriangle.getSide3() + " long.");
            System.out.println("yourTriangle's filled status:\t" + yourTriangle.isFilled());
            System.out.print("your triangle's creation date is " + yourTriangle.getDateCreated() + "\n");
            System.out.println("************************************************\n");

            System.out.println("************************************************");
            System.out.println("myTriangle's color is " + myTriangle.getColor() + ".");
            System.out.println("myTriangle's perimeter is " + myTriangle.getPerimeter() + ".");
            System.out.println("myTriangle's area is " + myTriangle.getArea() + ".");
            System.out.println("myTriangle's 1st side is " + myTriangle.getSide1() + " long.");
            System.out.println("myTriangle's 2nd side is " + myTriangle.getSide2() + " long.");
            System.out.println("myTriangle's 3rd side is " + myTriangle.getSide3() + " long.");
            System.out.println("myTriangle's filled status:\t" + myTriangle.isFilled());
            System.out.print("myTriangle's creation date is " + myTriangle.getDateCreated() + "\n");
            System.out.println("************************************************\n");

            //test toString
            System.out.print(myTriangle.toString() + "\n \n");
            System.out.print(yourTriangle.toString() + "\n");

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
