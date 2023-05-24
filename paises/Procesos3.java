package paises;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos3 {

	
	HashMap<String, ArrayList<String>> pais;
	ArrayList<String> ciudad, listaCiud;
	
	
	public Procesos3() {
		
		pais = new HashMap<String, ArrayList<String>>();
		listaCiud = new ArrayList<>();
		
	}
	
	
	public void iniciar() {
		
		String menu = "Bienvenido \n"
				+ "1 -registrar territorio \n"
				+ "2 -mostrar registros \n"
				+ "3 -buscar territorio  \n"
				+ "4 -salir \n"
				+ "ingrese una opcion";
		
		int  opc = 0;
		
		do {
			
			
			validarMenu(opc);
			
		opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
		}while(opc != 4);
		
	}

	private void validarMenu(int opc) {

		switch (opc) {
		
		case 1: 
			
			registrarTerritorio();
			
		break;	
		
		case 2:
			
			if(validarEst())
			mostrarRegistros();
				
			break;
			
		case 3:
			
			if(validarEst())
			buscarTerritorio();
			
			break;
			
		case 4:
			
			System.out.println("terminando sistema");
			
			break;
		
		default:
			
			System.out.println("ingrese una opcion valida");
			
			break;
		}
		
		
	}

	private void registrarTerritorio() {

		System.out.println("INGRESAR TERRITORIO");
		String val;
		
		ciudad = new ArrayList<>();
		
		String nombrePais = JOptionPane.showInputDialog("nombre del pais") , nombreCiudad;
	
		do {
			
			nombreCiudad = JOptionPane.showInputDialog("nombre de la ciudad ");
			
			ciudad.add(nombreCiudad);
			listaCiud.add(nombreCiudad);
			
			val = JOptionPane.showInputDialog("¿desea ingrear otro territorio?");
		}while(val.equalsIgnoreCase("SI"));
		
		pais.put(nombrePais, ciudad);
		
	}
	
	
	private void mostrarRegistros() {
		
		String menu = "Hola \n"
				+ "1 Paises \n"
				+ "2 ciudades \n"
				+ "3 salir";
		
		int opc = 0;
		
			opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch(opc) {
		
		case 1:
			
			for (String llave : pais.keySet()) {
				
				System.out.println("Pais " + llave);
				
			}
			
			break;
			
		case 2:
		
			mostrarCiud();
			
			break;
			
		case 3:
		
			break;
		
		} 
			
	}
	
	
	
	private void mostrarCiud() {
		
		for(int i = 0; i < listaCiud.size(); i++) {
			
			System.out.println("CIUDADES " + listaCiud.get(i));
			
		}
		
		
	}

	private void buscarTerritorio() {

		String menu = "Hola \n"
				+ "1 Paises \n"
				+ "2 ciudades \n"
				+ "3 salir";
		
		int opc = 0;
		
			opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch(opc) {
		
		case 1:
			
			String nombrePais = JOptionPane.showInputDialog("ingrese el nombre del pais que desea buscar");
			
			if(pais.containsKey(nombrePais))
		System.out.println("el pais " + nombrePais + " encuentra registrado");
			
			break;
			
		case 2:
		

			break;
			
		case 3:
		
			break;
		
		} 
				
	}
	

	public boolean validarEst() {
		
		if(pais.isEmpty()) {
			
			System.out.println("primero debe de registrar un territorio");
			return false;
			
		}else {
			
			return true;
			
		}
		
		
	}
	
	

	
	
	
}
