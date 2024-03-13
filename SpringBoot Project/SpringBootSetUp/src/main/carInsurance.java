package main;

public class carInsurance implements Insurance {
private final int customerID;
private final String name;
private  int validity;

    public carInsurance(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }
    public carInsurance() {
        this.customerID = 45465;
        this.name = "Parth";
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    @Override
    public String showStatus() {
        return "Hello "+name+" Your Car is Insured and your customer Id is "+ customerID ;
    }

    @Override
    public String toString() {
        return "carInsurance{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", Validity=" + validity +
                '}';
    }
}
