package main;

import org.springframework.stereotype.Component;

//@Component("YearOnly")
public class YearOnly implements Validity{
    public String val(){
        return "2080";
    }
}
