import java.util.Date;

public class Visitor extends Person {
    //states
    String visitPurpose = "";
    Date visitDate;
    //constructor
    public Visitor(){//non-Args
        visitDate = new Date();
    }
    public Visitor(String name, String address, String phone, String purpose){//with Args
            super.setName(name);
            super.setAddress(address);
            super.setPhoneNumber(phone);
            this.visitPurpose = purpose;
            visitDate = new Date();
    }
    //get
    public String getVisitPurpose() {
        return visitPurpose;
    }
    public Date getVisitDate() {
        return visitDate;
    }
    //set
    public void setVisitPurpose(String visitPurpose) {
        this.visitPurpose = visitPurpose;
    }
    //to string
    @Override
    public String toString() {
        return "\nVisitor Object:\n\tName:\t \t"+getName()+"\n\tAddress:\t"+getAddress()+"\n\tPhone:\t \t"+getPhoneNumber()+"\n\tPurpose:\t"+visitPurpose+"\n\tDate:\t \t"+visitDate;
    }
}
