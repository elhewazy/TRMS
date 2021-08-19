package com.elhewazy.repositories;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.elhewazy.models.Forms;
import com.elhewazy.util.HibernateUtil;

public class FormRepoImpl implements FormRepo {

	@Override
	public Forms addForms(Forms f) {
		Session sess = HibernateUtil.getSession();
		try {
			sess.beginTransaction();
			// save it will return the primary key (genrated idintifire )
			f.setFormId((int) sess.save(f));
			sess.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			sess.getTransaction().rollback();
			f = null;
		} finally {
			sess.close();
		}

		return f;
	}

	@Override
	public List<Forms> getAllForms() {
		Session sess = HibernateUtil.getSession();
		List<Forms> forms = null;
		try {
			forms = sess.createQuery("FROM Forms").list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}

		return forms;
	}

	@Override
	public Forms getForm(int id) {
		Session sess = HibernateUtil.getSession();
		Forms l = null;
		sess.beginTransaction();
		try {
			l = sess.get(Forms.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return l;
	}

	@Override
	public Forms approvForms(Forms change) {
		Session sess = HibernateUtil.getSession();
		System.out.println(change);

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

	@Override
	public Forms transfarForms() {
		Session sess = HibernateUtil.getSession();

		return null;
	}

	@Override
	public Forms denayForms() {
		Session sess = HibernateUtil.getSession();

		return null;
	}

	@Override
	public Forms deletForms(int id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;
		Forms m = sess.get(Forms.class, id);

		try {
			tx = sess.beginTransaction();
			sess.delete(m);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}
		return m;
	}

}
