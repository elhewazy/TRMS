package com.elhewazy.controllers;

import java.util.List;

import com.elhewazy.models.Forms;
import com.elhewazy.service.FormService;
import com.google.gson.Gson;

import io.javalin.http.Handler;

public class FormContoller {
	Gson gson = new Gson();

	FormService fs;

	public FormContoller(FormService fs) {
		this.fs = fs;
	}

	public Handler getAllForms = (ctx) -> {
		List<Forms> allForms = fs.getAllForms();
		ctx.result(gson.toJson(allForms));

	};

	public Handler AddForm = (ctx) -> {
		Forms f = gson.fromJson(ctx.body(), Forms.class);

		f = fs.addForms(f);
		ctx.result((f != null) ? gson.toJson(f) : "{}");
	};

	public Handler getFormByid = (ctx) -> {

		ctx.result("from forms");
	};
	public Handler approvForms = (ctx) -> {
		Forms change = gson.fromJson(ctx.body(), Forms.class);

		fs.approvForms(change);
		ctx.result(gson.toJson(change.toString()));

	};

	public Handler deletForms = (ctx) -> {
		String input = ctx.pathParam("id");
		int id;
		try {
			id = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			id = -1;
		}

		Forms m = fs.deletForms(id);

		ctx.result((m != null) ? gson.toJson(m) : "{}");
	};

}
