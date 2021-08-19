package com.elhewazy.service;

import java.util.List;

import com.elhewazy.models.Forms;

public interface FormService {
	public Forms addForms(Forms f);

	public List<Forms> getAllForms();

	public Forms getForm(int id);

	public Forms approvForms(Forms change);

	public Forms transfarForms();

	public Forms denayForms();

	public Forms deletForms(int id);

}
