package com.elhewazy.repositories;

import com.elhewazy.models.Login;

public interface LoginRepo {

	public Login checkLogin(String userN, String passW);

	public Login addLogin(Login L);

}
