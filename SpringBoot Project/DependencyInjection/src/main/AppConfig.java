package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("main")
public class AppConfig {
    @Bean("bikeInsurance")
    public bikeInsurance bikeInsurance(){
        return new bikeInsurance();
    }
    @Bean("carInsurance")
    public carInsurance carInsurance(){
        return new carInsurance();
    }

    @Bean("YearOnly")
    public YearOnly yearOnly(){
        return new YearOnly();
    }
    @Bean("YearWithMonth")
    public YearWithMonth yearWithMonth(){
        return new YearWithMonth("Your validity is now with parameter constructor : ");
    }
}

