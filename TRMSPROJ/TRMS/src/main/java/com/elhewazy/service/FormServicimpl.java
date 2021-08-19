package com.elhewazy.service;

import java.util.List;

import com.elhewazy.models.Forms;
import com.elhewazy.repositories.FormRepo;

public class FormServicimpl implements FormService {

	FormRepo fr;

	public FormServicimpl(FormRepo fr) {
		this.fr = fr;
	}

	@Override
	public Forms addForms(Forms f) {

		return fr.addForms(f);
	}

	@Override
	public List<Forms> getAllForms() {

		return fr.getAllForms();
	}

	@Override
	public Forms getForm(int id) {

		return fr.getForm(id);
	}

	@Override
	public Forms approvForms(Forms change) {

		return fr.approvForms(change);
	}

	@Override
	public Forms transfarForms() {

		return null;
	}

	@Override
	public Forms denayForms() {

		return null;
	}

	@Override
	public Forms deletForms(int id) {

		return fr.deletForms(id);
	}

}
