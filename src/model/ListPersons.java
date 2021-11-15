package model;

import java.util.ArrayList;

/*
 * Clase encargada de almacenar personas en una lista.
 */
public class ListPersons {
	private ArrayList<Person> lPersons;

	public ArrayList<Person> getlPersons() {
		return lPersons;
	}

	public ListPersons() {
		this.lPersons = new ArrayList<Person>();
	}

	public void addPerson(Person person) {
		lPersons.add(person);
	}

	/**
	 * @param phone: String.
	 * @return objeto tipo Person.
	 * "searchPerson(String phone)" recibe un número telefónico para buscar
	 * una persona en la lista que tenga el mismo número
	 */
	public Person searchPerson(String phone) {
		for (int i = 0; i < lPersons.size(); i++) {
			if (phone.equalsIgnoreCase(lPersons.get(i).getPhone())) {
				return lPersons.get(i);				
			}
		}
		return null;
	}
	/**
	 * @param phone: String.
	 * "deletePerson(String phone)" recibe un número telefónico para eliminar
	 * una persona en la lista que tenga el mismo número.
	 */
	public void deletePerson(String phone) {
		for (int i = 0; i < lPersons.size(); i++) {
			if (phone.equalsIgnoreCase(lPersons.get(i).getPhone())) {
				lPersons.remove(i);
			}
		}
	}

}