package dao;

import java.util.List;

import model.Classname;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Classname entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see dao.Classname
 * @author MyEclipse Persistence Tools
 */
public class ClassnameDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ClassnameDAO.class);
	// property constants
	public static final String CLASS_NAME = "className";
	public static final String CLASS_ROOM = "classRoom";

	public void save(Classname transientInstance) {
		log.debug("saving Classname instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Classname persistentInstance) {
		log.debug("deleting Classname instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Classname findById(java.lang.Integer id) {
		log.debug("getting Classname instance with id: " + id);
		try {
			Classname instance = (Classname) getSession().get("model.Classname",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Classname instance) {
		log.debug("finding Classname instance by example");
		try {
			List results = getSession().createCriteria("model.Classname")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Classname instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Classname as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByClassName(Object className) {
		return findByProperty(CLASS_NAME, className);
	}

	public List findByClassRoom(Object classRoom) {
		return findByProperty(CLASS_ROOM, classRoom);
	}

	public List findAll() {
		log.debug("finding all Classname instances");
		try {
			String queryString = "from Classname";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Classname merge(Classname detachedInstance) {
		log.debug("merging Classname instance");
		try {
			Classname result = (Classname) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Classname instance) {
		log.debug("attaching dirty Classname instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Classname instance) {
		log.debug("attaching clean Classname instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}