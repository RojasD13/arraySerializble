package view;

public enum InitialMenu {
	ADD_PERSON("Agregar persona"),
	SHOW_PERSONS("Mostrar personas agregadas"),
	DELETE_PERSON("Borrar persona"),
	CLOSE_PROGRAM("Cerrar programa");
	
	private String label;

    InitialMenu(String label) {
	this.label = label;
    }

    public String toString() {
	return label;
    }
    
}