package com.elhewazy.service;

import com.elhewazy.models.Emplyee;
import com.elhewazy.repositories.EmplyeeRepo;

public class EmplyeeServicimpl implements EmplyeeService {

	EmplyeeRepo er;

	public EmplyeeServicimpl(EmplyeeRepo er) {
		this.er = er;
	}

	@Override
	public Emplyee getEmplyee(String email) {

		return er.getEmplyee(email);
	}

	@Override
	public Emplyee addEmplyee(Emplyee e) {

		return er.addEmplyee(e);
	}

	@Override
	public Emplyee deletEmplyee(int id) {

		return er.deletEmplyee(id);
	}

	@Override
	public Emplyee UpdateEmplyee(Emplyee change) {

		return er.UpdateEmplyee(change);
	}

}
