package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class Query {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Data.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        Scanner scan = new Scanner(System.in);

        try {
            session.beginTransaction();

           List<Data> datas = session.createQuery("from Doctor").getResultList();
//             List<Data> datas = session.createQuery("from Doctor where name = 'Darshan'").getResultList();
//           session.createQuery("update Doctor set name='Vijay' where name= 'Ajay'").executeUpdate();
//           session.createQuery("Delete from Doctor where name= 'Parth'").executeUpdate();

           for (Data data : datas){
               System.out.println(data);
           }

            session.getTransaction().commit();

        }
        finally {
        session.close();
        factory.close();
    }
    }
}
