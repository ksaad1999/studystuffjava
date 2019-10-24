package app;

/**
 * Impl "Definieren eigener Exceptions" Aufg 3
 * Custom Exception
 * @author Karim Saad
 */
public class UngueltigesGeschlecht extends Exception {
	public UngueltigesGeschlecht(){
        super("Error weder m/w/d");
    }
}