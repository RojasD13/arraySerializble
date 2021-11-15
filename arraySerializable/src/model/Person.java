package model;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Atributos de la clase
	private String firstName;
	private String lastName;
	private String phone;

	public Person(String firstName, String lastName, String phone) {		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "[\nfirstName=" + firstName + "\nlastName=" + lastName + "\nphone=" + phone + "]\n";
	}
	
}