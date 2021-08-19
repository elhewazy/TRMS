package com.elhewazy.service;

import com.elhewazy.models.Login;

public interface LoginService {

	public Login checkLogin(String userN, String passW);

	public Login addLogin(Login l);

}
