package control;

import java.io.IOException;

import model.ListPersons;
import model.Person;
import view.ConsolView;
import view.InitialMenu;

public class Controller {
	private ListPersons lPersons;
	private PersonFile pFile;
	private ConsolView cView;

	public Controller() {
		lPersons = new ListPersons();
		pFile = new PersonFile();
		cView = new ConsolView();
		initProgram();
	}

	private void initProgram() {
		InitialMenu optionMenu = cView.showMenu();
		switch (optionMenu) {
		case ADD_PERSON:
			lPersons.addPerson(new Person(
					cView.readString(Constans.NAME_LABEL),
					cView.readString(Constans.LAST_NAME),
					cView.readString(Constans.PHONE_NUMBER)));
			try {
				pFile.save(lPersons.getlPersons());
			} catch (IOException e) {
				cView.showMessage(Constans.ERROR_MESSAGE);
			}
			
			break;
		case CLOSE_PROGRAM:
			cView.showMessage(Constans.EXIT_MESSAGE);
			System.exit(0);
			break;
		case DELETE_PERSON:
			lPersons.deletePerson(cView.readString(Constans.PHONE_NUMBER));
			break;
		case SHOW_PERSONS:
				cView.showMessage(cView.listToString(lPersons.getlPersons()));
			break;
		default:
			break;		
		}
		initProgram();
	}

}