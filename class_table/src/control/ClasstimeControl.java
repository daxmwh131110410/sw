package control;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.swing.JOptionPane;

import model.Classtime;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.ClasstimeDAO;
import factory.HibernateSessionFactory;

@Entity
public class ClasstimeControl {
	
	@OneToOne(mappedBy = "control")
	private static ClasstimeControl control = null;
	public static ClasstimeControl getControl(){
		if(control == null)
		{
			control = new ClasstimeControl();
		}
		return control;
	}

	@ManyToOne
	private ClasstimeDAO classtimeDAO = null;
	private Session session = null;
	
	public ClasstimeControl(){
		classtimeDAO = new ClasstimeDAO();
		session = HibernateSessionFactory.getSession();
	}

public Boolean saveClasstime(Classtime classtime){
	try{
		Transaction transaction = session.beginTransaction();
	    classtimeDAO.save(classtime);
	    //session.beginTransaction().commit();
	    transaction.commit();
	    JOptionPane.showMessageDialog(null,"1");
	    session.flush();
		return true;
	}catch(Exception e){
		return false;
	}
	
}
//public List getClasstimeAll()
public Classtime findByOrder(int order)
{
	Classtime classtime = new Classtime();
	classtime = classtimeDAO.findById(order);
	return classtime;
}

public boolean delete(Classtime classtime){
	try{
		Transaction tr = session.beginTransaction();
		classtimeDAO.delete(classtime);
		tr.commit();
		session.flush();
		return true;
	}catch (Exception e) {
		return false;
	}
}

public boolean update(Classtime classtime){
	try{
		Transaction tr = session.beginTransaction();
		classtimeDAO.merge(classtime);
		tr.commit();
		session.flush();
		return true;
	}catch(Exception e){
		return false;
	}
}



}
