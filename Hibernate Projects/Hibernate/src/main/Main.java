package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Data.class)
                .buildSessionFactory();
        Scanner scan = new Scanner(System.in);
        Session session = factory.getCurrentSession();
        try {
//          //Create object of data class
//            Data data = new Data(1,"Aksh","Sergen");
//          //Start Transaction
//            session.beginTransaction();
//          //Perform Operation
//            session.save(data);
//          //Commit the Transaction
//            session.getTransaction().commit();
//            System.out.println("Row Added Successfully");

            session.beginTransaction();
            Data data1 = new Data();



            boolean quite = false;
            while (!quite){

                System.out.println("    *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*    \n");
                System.out.println("*-*-*-Welcome to Hospital Management System-*-*-*");
                System.out.println("Choose the bellow Option to perform operations");
                System.out.println("1. For adding new Doctor Details");
                System.out.println("2. For Delete Doctor Details");
                System.out.println("3. For Updating Doctor Details");
                System.out.println("4. To view specific Doctor Details by ID");
                System.out.println("5. Exit");
                int choice = scan.nextInt();


                switch (choice){
                    case 1: {

//                     1. For adding new Doctor Details
                       System.out.print("Enter the name of the Doctor : ");
                       String name = scan.next();
                       System.out.print("Enter the Department of the Doctor : ");
                       String department = scan.next();
                       data1 = new Data(name, department);
                       session.save(data1);
                       System.out.println("Doctor Details Added Successfully");
                       session.getTransaction().commit();
                       break;

                    }

                    case 2: {

//                     2. For Delete Doctor Details
                       System.out.print("Enter Doctor ID to Delete it's Details  : ");
                       int ids= scan.nextInt();
                       if(ids>0){
                           data1 = session.get(Data.class, ids);
                           session.delete(data1);
                           System.out.println("Doctor Details deleted successfully");
                       }
                       else{
                           System.out.println("Enter Valid ID Number or Doctor doesn't available for this ID Number");
                       }
                        session.getTransaction().commit();

                        break;

                    }
                    case 3:{

//                      3. For Updating Doctor Details
                        System.out.print("Enter Doctor ID to edit details :");
                        int idNumber = scan.nextInt();
                        if(idNumber>0){
                            data1 = session.get(Data.class, idNumber);
                            System.out.print("Current Data from Database: "+data1);
                            System.out.print("Do you want to change the Doctor Name Y/N : ");
                            String s = scan.next();
                            if(s.equals("Y") | s.equals("y")){
                                System.out.print("Enter the New Doctor Name: ");
                                String name = scan.next();
                                data1.setName(name);
                            }else if(s.equals("n") | s.equals("N")){
                                System.out.println("Doctor Name will be there as it is");
                            }else{
                                System.out.println("Input is Incorrect");
                            }

                            System.out.print("Do you want to change the Doctor Department Y/N : ");
                            String sc = scan.next();
                            if(sc.equals("Y") | sc.equals("y")){
                                System.out.print("Enter the New Department Name: ");
                                String dName = scan.next();
                                data1.setName(dName);
                            }else if(sc.equals("n") | sc.equals("N")){
                                System.out.println("Department will be there as it is");
                            }else{
                                System.out.println("Input is Incorrect");
                            }
                            System.out.println("Updated Data in Database: " + data1);

                        }
                        else{
                            System.out.println("Enter Valid ID Number or Doctor doesn't available for this ID Number");
                        }
                        session.getTransaction().commit();

                        break;

                    }
                    case 4:{

//                        4. To view specific Doctor Details by ID
                        System.out.print("Enter ID To view Details of That Doctor : ");
                        int id= scan.nextInt();
                        if(id>0){
                            data1 = session.get(Data.class, id);
                            System.out.println(data1);
                        }
                        else{
                            System.out.println("Enter Valid ID Number or Doctor doesn't available for this ID Number");
                        }
                        session.getTransaction().commit();

                        break;

                    }
                    case 5:{
                       quite = true;
                       break;
                    }
                    default:{
                        System.out.println("Enter valid number");
                    }
                }
            }









//            Data data1 = new Data();
//            session.beginTransaction();
//            data1 = session.get(Data.class, 2);
//
//            System.out.println(data1);
//
//            data1.setName("Jay");
//            System.out.println(data1);
//
//            session.delete(data1);
//            session.getTransaction().commit();

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
