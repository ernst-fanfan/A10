public class testPerson {
    public static void main (String[] Args){
        Person one = new Person("jen", "95 Hobs Street" , "123-456-7848");
        System.out.println(one);
        one.setName("John Smith");
        System.out.println(one);

        Student two = new Student();
        System.out.println(two);

    }
}
