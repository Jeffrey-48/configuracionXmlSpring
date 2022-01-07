package com.spring.beans;

import org.springframework.stereotype.Component;
import com.spring.interfaces.IEquipo;

@Component
public class Barcelona implements IEquipo{

	@Override
	public String mostrar() {
		return "Barcelona FC";
	}

}
