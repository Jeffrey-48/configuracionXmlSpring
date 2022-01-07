package com.spring.beans;

import com.spring.interfaces.IEquipo;

public class Juventus implements IEquipo {

	@Override
	public String mostrar() {
		return "Juventus";
	}

}
