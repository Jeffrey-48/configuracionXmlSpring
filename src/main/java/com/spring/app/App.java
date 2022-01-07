package com.spring.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Barcelona;
import com.spring.beans.Jugador;
import com.spring.beans.Juventus;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija un equipo 1-Barcelona 2-Juventus");
		int respuesta = sc.nextInt();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		Jugador jugador = (Jugador) appContext.getBean("jugador1");
		switch (respuesta) {
		case 1:
			jugador.setEquipo(new Barcelona());
			break;
		case 2:
			jugador.setEquipo(new Juventus());
			break;

		default:
			break;
		}
		
		System.out.println(jugador.toString());
		((ConfigurableApplicationContext) appContext).close();
	}
}
