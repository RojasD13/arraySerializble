package control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Person;


public class PersonFile {
	private final String path;
	
	public PersonFile() {
		path = "person.ser";
	}
	
	public void save (ArrayList<Person> persons) throws IOException {
		FileOutputStream file = new FileOutputStream(path);
		ObjectOutputStream output = new ObjectOutputStream(file);
		for (Person person : persons) {
			output.writeObject(person);
		}
		output.close();
		file.close();
	}
	
	public ArrayList<Person> read() throws IOException, ClassNotFoundException  {
		ArrayList<Person> tempPersons = new ArrayList<>();
		try {			
			FileInputStream file = new FileInputStream(path);
			ObjectInputStream input = new ObjectInputStream(file);
			while (input.available() > 0) {
				Person person = (Person) input.readObject();
				tempPersons.add(person);
			}
			input.close();
			file.close();
		} catch (Exception e) {
			// TODO: handle exception
	}	
	 
		return tempPersons;
	}
	
	
	
}