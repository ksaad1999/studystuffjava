package app;

public class Kunde {
    // Implementierung in nach Abb 17 (Aufg 9 unter "Methoden in Java ") Webreader
    private String name;
    private String vorname;
    private String geburtsdatum; // ich glaube das sollte eigentlich Date sein, aber egal
    private String geschlecht; //...

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
       return this.name;
    }

    public void setVorname(String vorname){
        this.vorname = vorname;
    }
    public String getVorname(){
       return this.vorname;
    }

    public void setGeburtsdatum(String geburtsdatum){
        this.geburtsdatum = geburtsdatum;
    }
    public String getGeburtsdatum(){
       return this.geburtsdatum;
    }

    public void setGeschlecht(String geschlecht){
        this.geschlecht = geschlecht;
    }
    public String getGeschlecht(){
       return this.geschlecht;
    }
}