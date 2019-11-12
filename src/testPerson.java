public class testPerson {
    public static void main (String[] Args){
        Person one = new Person("jen", "95 Hobs Street" , "123-456-7848");
        System.out.println(one);
        one.setName("John Smith");
        System.out.println(one);

        Student two = new Student("Paul", "5 Bush Drive", "159-753-7845");
        System.out.println(two);

        Employee three = new Employee("Pete", "4 Sesame St", "789-456-1234", 150000.00);
        System.out.println(three);

    }
}
