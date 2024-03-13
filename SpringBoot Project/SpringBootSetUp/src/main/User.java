package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");
        Insurance status = context.getBean("myInsurance",Insurance.class);
        System.out.println(status.showStatus());
        System.out.println(status);
    }
}
