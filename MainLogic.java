package com.mondee;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class MainLogic {

	public static void main(String[] args) {
	
		Session session = HibernateUtil.getSessionFactory().openSession();

	    Transaction t = session.beginTransaction();
	    
	    Payment p = new Payment();
	    p.setAmmount(80);
	    p.setPymentId(68);
	    session.save(p);
	    
	    CreditCardType ct = new CreditCardType();
	    ct.setCreditCardType("visa");
	    session.save(ct);
	    t.commit();  
		session.close();

	}

}
