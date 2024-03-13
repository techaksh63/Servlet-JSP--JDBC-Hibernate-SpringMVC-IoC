package main;

import org.springframework.stereotype.Component;

//@Component("YearWithMonth")
public class YearWithMonth implements Validity{
    String s;

    public YearWithMonth() {
        this.s = "Your Validity will be of : ";
    }
    public YearWithMonth(String s) {
        this.s = s;
    }

    public String val(){
        return s+"05/2070";
    }
}

