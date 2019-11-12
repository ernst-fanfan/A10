import java.text.DecimalFormat;

public class Staff extends Employee {
    //states
    private String title = "";
    //constructor
    public Staff(String name, String address, String phone, double salary, String title){
        super.setName(name);
        super.setAddress(address);
        super.setPhoneNumber(phone);
        super.setSalary(salary);
        super.setDateHired();
        this.title = title;
    }
    //get
    public String getTitle() {
        return title;
    }
    //set
    public void setTitle(String title) {
        this.title = title;
    }
    //to string
    @Override
    public String toString() {
        DecimalFormat dollar = new DecimalFormat("$###,##0");
        return "\nStaff Object:\n\tName:\t \t"+getName()+"\n\tAddress:\t"+getAddress()+"\n\tPhone:\t \t"+getPhoneNumber()+"\n\tSalary:\t \t"+dollar.format(getSalary())+"\n\tDate Hired:\t"+getDateHired()+"\n\tTitle:\t \t"+title;
    }
}
