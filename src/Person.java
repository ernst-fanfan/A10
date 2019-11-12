public class Person {
    private String name;
    private String address;
    private String phoneNumber;

    //constructor non-arg
    public Person(){}
    //constructor
    public Person(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    //get
    //returns name
    public String getName() {
        return name;
    }
    //returns address
    public String getAddress() {
        return address;
    }
    //returns phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }
    //set
    //sets name
    public void setName(String name) {
        this.name = name;
    }
    //sets address
    public void setAddress(String address) {
        this.address = address;
    }
    //sets phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //to string

    @Override
    public String toString() {
        return ("\nPerson Object:\n\tName:\t \t"+name+"\n\tAddress:\t"+address+"\n\tPhone:\t \t"+phoneNumber);
    }
}
