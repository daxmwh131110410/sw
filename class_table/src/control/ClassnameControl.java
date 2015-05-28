package control;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import model.Classname;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.ClassnameDAO;
import factory.HibernateSessionFactory;

@Entity
public class ClassnameControl {
	
	@OneToOne(mappedBy = "control")
	private static ClassnameControl control = null;
	public static ClassnameControl getControl(){
		if(control == null)
		{
			control = new ClassnameControl();
		}
		return control;
	}

	@ManyToOne
	private ClassnameDAO classDAO = null;
	private Session session = null;
	
	public ClassnameControl(){
		classDAO = new ClassnameDAO();
		session = HibernateSessionFactory.getSession();
	}

public Boolean saveClassname(Classname classname){
	try{
	    Transaction tr = session.beginTransaction();
	    classDAO.save(classname);
	    tr.commit();
	    session.flush();
		return true;
	}catch(Exception e){
		return false;
	}
	
}
//public List getClasstimeAll(){
//	
//	return ClassnameDAO.findAll();
//	
//}
public Classname findByOrder(int classOrder)
{
	Classname classname = classDAO.findById(classOrder);
	return classname;
}

public boolean delete(Classname classname){
	try{
		Transaction tr = session.beginTransaction();
		classDAO.delete(classname);
		tr.commit();
		session.flush();
		return true;
	}catch (Exception e) {
		return false;
	}
}

public boolean update(Classname classname){
	try{
		Transaction tr = session.beginTransaction();
		classDAO.merge(classname);
		tr.commit();
		session.flush();
		return true;
	}catch(Exception e){
		return false;
	}

}
}






