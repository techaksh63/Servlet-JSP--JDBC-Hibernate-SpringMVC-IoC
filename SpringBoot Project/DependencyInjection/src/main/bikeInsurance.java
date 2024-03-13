package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("bikeInsurance")
public class bikeInsurance implements Insurance {
    @Autowired(required = false)
    @Qualifier("YearWithMonth")
    Validity validity;

//    public void setValidity(Validity validity) {
//        validity.validity = "2050";
//        this.validity = validity;
//    }

    @Override
    public String showStatus() {
        return "Your bike is Insured with validity : "+validity.val();
    }

}
