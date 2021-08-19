package com.elhewazy.app;

import com.elhewazy.controllers.EmplyeeContoller;
import com.elhewazy.controllers.FormContoller;
import com.elhewazy.controllers.LoginContoller;
import com.elhewazy.repositories.EmplyeeRepo;
import com.elhewazy.repositories.EmplyeeRepoimpl;
import com.elhewazy.repositories.FormRepo;
import com.elhewazy.repositories.FormRepoImpl;
import com.elhewazy.repositories.LoginRepo;
import com.elhewazy.repositories.LoginRepoimp;
import com.elhewazy.service.EmplyeeService;
import com.elhewazy.service.EmplyeeServicimpl;
import com.elhewazy.service.FormService;
import com.elhewazy.service.FormServicimpl;
import com.elhewazy.service.LoginService;
import com.elhewazy.service.LoginServiceImple;

import io.javalin.Javalin;

public class JavaLinApp {

	public static void main(String[] args) {

		Javalin app = Javalin.create(config -> {
			config.enableCorsForAllOrigins();

		});

		establishRoutes(app);
		app.start(7000);
	}

	private static void establishRoutes(Javalin app) {

		LoginRepo lr = new LoginRepoimp();
		LoginService ls = new LoginServiceImple(lr);
		LoginContoller lc = new LoginContoller(ls);

		EmplyeeRepo er = new EmplyeeRepoimpl();
		EmplyeeService es = new EmplyeeServicimpl(er);
		EmplyeeContoller ec = new EmplyeeContoller(es);

		FormRepo fr = new FormRepoImpl();
		FormService fs = new FormServicimpl(fr);
		FormContoller fc = new FormContoller(fs);

		fs.getForm(0);
		// es.getEmplyee(0);
		app.get("/ahmed", (ctx -> {
			ctx.result("hello");
		}));
		app.post("/checkLogin", lc.checkLoginById);
		app.post("/login", lc.addLogin);

		app.get("/forms", fc.getFormByid);
		app.get("/getAllForms", fc.getAllForms);
		app.post("/AddForm", fc.AddForm);
		app.delete("/deletForms/:id", fc.deletForms);
		app.post("/approvForms", fc.approvForms);

		app.post("/addEmplyee", ec.addEmplyeeO);
		app.put("/getEmplyeeByEmail", ec.getEmplyeeByEmail);
		app.put("/UpdateEmplyee", ec.UpdateEmplyeeb);

	}
}