package com.elhewazy.controllers;

import java.util.Map;

import com.elhewazy.models.Emplyee;
import com.elhewazy.repositories.LoginRepoimp;
import com.elhewazy.service.EmplyeeService;
import com.google.gson.Gson;

import io.javalin.http.Handler;

public class EmplyeeContoller extends Emplyee {

	Gson gson = new Gson();
	Emplyee ee;

	EmplyeeService es;
	LoginRepoimp ff;

	public EmplyeeContoller() {
		super();
	}

	public EmplyeeContoller(EmplyeeService es) {
		this.es = es;
	}

	public Handler addEmplyeeO = (ctx) -> {

		Emplyee e = gson.fromJson(ctx.body(), Emplyee.class);

		e = es.addEmplyee(e);

		ctx.result((e != null) ? gson.toJson(e) : "{}");
	};

	public Handler getEmplyeeByEmail = (ctx) -> {
		Map<String, Object> m = gson.fromJson(ctx.body(), Map.class);
//		
		String email = (String) m.get("email");
//		

		ctx.result(gson.toJson(es.getEmplyee(email)));
	};

	public Handler UpdateEmplyeeb = (ctx) -> {
		Emplyee ee = gson.fromJson(ctx.body(), Emplyee.class);

		ee = es.UpdateEmplyee(ee);
		ctx.result((ee != null) ? gson.toJson(ee) : "{}");
	};

}
