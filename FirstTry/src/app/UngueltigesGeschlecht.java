package app;

//Impl "Definieren eigener Exceptions" Aufg 3
public class UngueltigesGeschlecht extends Exception {
    public UngueltigesGeschlecht(){
        super("Error weder m/w/d");
    }
}