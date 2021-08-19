package com.elhewazy.controllers;

import java.util.Map;

import com.elhewazy.models.Login;
import com.elhewazy.repositories.LoginRepo;
import com.elhewazy.service.LoginService;
import com.google.gson.Gson;

import io.javalin.http.Handler;

public class LoginContoller {

	Gson gson = new Gson();
	LoginService l;
	LoginRepo lr;

	public LoginContoller(LoginService l) {
		this.l = l;
	}

	public LoginContoller(LoginRepo lr) {
		this.lr = lr;
	}

	public Handler checkLoginById = (ctx) -> {

		Map<String, Object> m = gson.fromJson(ctx.body(), Map.class);
//		String mL = (String) m.toString();
//		String[] nml = mL.split(",");
//		String name = nml[0];
//		String password = nml[1];
//		ctx.result(name);
//		l.checkLogin(name, password);
		String name = (String) m.get("userName");
		String password = (String) m.get("password");
		// l.checkLogin(name, password);

		ctx.result(gson.toJson(l.checkLogin(name, password)));

	};

	public Handler addLogin = (ctx) -> {
		Login lr = gson.fromJson(ctx.body(), Login.class);
//		l.addLogin(lr);
		lr = l.addLogin(lr);
		ctx.result((lr != null) ? gson.toJson(l) : "{}");
	};
}