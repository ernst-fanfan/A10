//Class: CS 5000
//Term: Fall 2019
//Name: Ernst Fanfan
//Instructor: Dr. Haddad
//Assignment: 10
//IDE Name: IntelliJ

public class Triangle extends GeometricObject{
    private double side1 = 1.00;
    private double side2 = 1.00;
    private double side3 = 1.00;
    private String name ="";

    public Triangle(){
        name = "myTriangle";
    }

    public Triangle(String name, double side1, double side2, double side3){
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }



    @Override
    public double getArea() {
        double s = 0.00;
        double area = 0.00;
        s = (side1 + side2 + side3)/2;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 0.00;
        perimeter = (side1 + side2 + side3);
        return perimeter;
    }

    @Override
    public String toString(){
        return "Triangle:\t \t"+name+
                "\nSide 1:\t \t \t"+side1+
                "\nSide 2:\t \t \t"+side2+
                "\nSide 3:\t \t \t"+side3+
                "\nArea:\t \t \t"+getArea()+
                "\nPerimeter:\t \t"+getPerimeter()+
                "\nColor:\t \t \t"+getColor()+
                "\nIs Filled:\t \t"+isFilled();
    }
}
