package app;

public class Kunde {
    // Implementierung in nach Abb 17 (Aufg 9 unter "Methoden in Java ") Webreader
    private String name;
    private String vorname;
    private String geburtsdatum; // ich glaube das sollte eigentlich Date sein, aber egal
    private String geschlecht; //...

    // Erweiterung in OOP Abb 27 "Kontrollstrukturen"
    private boolean premiumkunde;

    //Erweiterung in OOP Abb 30 "Kontrollstrukturen"
    private boolean gutschein;

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

    // Implementierung Abb 27 "Kontrollstrukturen"
    public boolean isPremiumkunde(){
        return this.premiumkunde;
    }
    public void setPremiumKunde(boolean status){
        this.premiumkunde = status;
    }

    // Implementierung Abb 30 "Kontrollstrukturen"
    public boolean hasGutschein(){
        return this.gutschein;
    }
    public void setGutschein(boolean gutschein){
        this.gutschein = gutschein;
    }
}