package com.elhewazy.repositories;

import com.elhewazy.models.Emplyee;

public interface EmplyeeRepo {

	public Emplyee getEmplyee(String email);

	public Emplyee addEmplyee(Emplyee e);

	public Emplyee deletEmplyee(int id);

	public Emplyee UpdateEmplyee(Emplyee change);

}
