package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Person;

public class ConsolView {
//Menú del programa
	public InitialMenu showMenu() {
		return (InitialMenu) JOptionPane.showInputDialog(null, 
				"Elija una opción", "", JOptionPane.QUESTION_MESSAGE,
				null, InitialMenu.values(), InitialMenu.values()[0]);
	}
//Métodos relacionados con entradas y salidas de datos 	
	public String readString(String message) {
		String input = JOptionPane.showInputDialog(null, message);
		return input;
	}
	
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public String listToString(ArrayList<Person> lPersons) {
		String temporalList = null;
			for (int i = 0; i < lPersons.size(); i++) {
				temporalList += lPersons.get(i).toString();
		}
		return temporalList;
	}

}