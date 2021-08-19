package com.elhewazy.service;

import com.elhewazy.models.Login;
import com.elhewazy.repositories.LoginRepo;

public class LoginServiceImple implements LoginService {
	LoginRepo lr;

	public LoginServiceImple(LoginRepo lr) {
		this.lr = lr;
	}

	@Override
	public Login checkLogin(String userN, String passW) {

		return lr.checkLogin(userN, passW);
	}

	@Override
	public Login addLogin(Login l) {
		// TODO Auto-generated method stub
		return lr.addLogin(l);
	}

}
