package com.elhewazy.repositories;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.elhewazy.models.Emplyee;
import com.elhewazy.util.HibernateUtil;

public class EmplyeeRepoimpl implements EmplyeeRepo {

	@Override
	public Emplyee getEmplyee(String email) {
		Session sess = HibernateUtil.getSession();
		List results = null;
		Emplyee e = null;
		sess.beginTransaction();
		try {
			Criteria cr = sess.createCriteria(Emplyee.class);
			cr.add(Restrictions.eq("email", email));
			results = cr.list();
			System.out.println(results);
			e = (Emplyee) results.get(0);
		} catch (HibernateException n) {
			return null;

		} catch (IndexOutOfBoundsException b) {
			return null;
		} finally {
			sess.close();
		}

		return e;
	}

	@Override
	public Emplyee addEmplyee(Emplyee e) {
		Session sess = HibernateUtil.getSession();
		try {
			sess.beginTransaction();
			e.setId((int) sess.save(e));
			sess.getTransaction().commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			sess.getTransaction().rollback();
			e = null;
		} finally {
			sess.close();
		}

		return e;
	}

	@Override
	public Emplyee deletEmplyee(int id) {

		return null;

	}

	@Override
	public Emplyee UpdateEmplyee(Emplyee change) {

		Session sess = HibernateUtil.getSession();
		Transaction tx = null;

		try {
			tx = sess.beginTransaction();
			sess.update(change);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}

		return change;
	}

}
