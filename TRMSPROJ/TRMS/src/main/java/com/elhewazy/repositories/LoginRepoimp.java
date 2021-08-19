package com.elhewazy.repositories;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.elhewazy.models.Login;
import com.elhewazy.util.HibernateUtil;
import com.google.gson.Gson;

public class LoginRepoimp implements LoginRepo {
	Gson h = new Gson();

	Login ss = new Login();

	public LoginRepoimp() {

	}

	@Override
	public Login checkLogin(String userN, String passW) {

		Session sess = HibernateUtil.getSession();
		List results = null;
		Login a = null;
		sess.beginTransaction();
		try {

			@SuppressWarnings("deprecation")
			Criteria cr = sess.createCriteria(Login.class);
			cr.add(Restrictions.eq("userName", userN));
			cr.add(Restrictions.eq("password", passW));
//			String id = sess.getTenantIdentifier();

			results = cr.list();
			a = (Login) results.get(0);
			// h.toJson(a);
//			Map<String, Object> m = h.fromJson(h.toJson(a), Map.class);
//
//			double sId = (double) m.get("userId");
//			int id = (int) sId;
//			Emplyee nn = new Emplyee();
//			nn.setId(id);
//
//			System.out.println(nn.getId());

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}

		return a;
	}

	@Override
	public Login addLogin(Login L) {
		Session sess = HibernateUtil.getSession();
		try {
			sess.beginTransaction();
			// save it will return the primary key (genrated idintifire )
			L.setUserId((int) sess.save(L));
			sess.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			sess.getTransaction().rollback();
			L = null;
		} finally {
			sess.close();
		}

		return L;

	}

}
