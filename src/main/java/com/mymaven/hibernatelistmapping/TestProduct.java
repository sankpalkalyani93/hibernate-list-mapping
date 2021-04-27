package com.mymaven.hibernatelistmapping;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TestProduct {
    
    public static void main(String [] args){
        String file = "hibernate.cfg.xml";
        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure(file).build();  
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        Session session=factory.openSession();      
        Transaction t=session.beginTransaction();     
        
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Smart-Watch");
        list1.add("Smart-TV");
        list1.add("HeadPhones");
          
        Product product1 = new Product();
        product1.setP_category("Smart-Devices");
        product1.setProduct_name(list1);
        
        session.persist(product1);    
        t.commit();    
        session.close();    
        System.out.println("successfully saved data");  
    }
}
/* sample data collection

        /*ArrayList<String> list1=new ArrayList<String>();    
        list1.add("Iphone");    
        list1.add("Samsung");    
        
        ArrayList<String> list2=new ArrayList<String>();    
        list2.add("xbox");    
        list2.add("ps4"); */

        
        /*Product product1=new Product(); 
        product1.setP_category("Mobiles");    
        product1.setProduct_name(list1);    
        
        Product product2=new Product();    
        product2.setP_category("Games");    
        product2.setProduct_name(list2);  */
       

 //session.persist(product1);    
       // session.persist(product2); 



/*ArrayList<String> list3=new ArrayList<String>(); 
        list3.add("EarPlugs");    
        list3.add("Chargers"); 

        Product product3=new Product(); 
        product3.setP_category("Accessories");    
        product3.setProduct_name(list3); 

*/