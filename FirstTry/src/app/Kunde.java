package app;

import java.util.EmptyStackException;

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
    public String getGeschlecht() throws UngueltigesGeschlecht {
        if(this.geschlecht == null)throw new NullPointerException(); // Implementierung "Typische Szenarien bei der Ausnahmebehandlung" Aufg 3 && Impl Definition eigene Exceptions Aufg 3 
        if(this.geschlecht.isEmpty())throw new EmptyStackException(); // Implementierung "Typische Szenarien bei der Ausnahmebehandlung" Aufg 3 && Impl Definition eigene Exceptions Aufg 3
        if(this.geschlecht != "m" && this.geschlecht != "w" && this.geschlecht != "d")throw new UngueltigesGeschlecht(); // Implementierung "Typische Szenarien bei der Ausnahmebehandlung" Aufg 3 && Impl Definition eigene Exceptions Aufg 3
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

    // Implementierung Abb 32 Jugendschutz (ist Person über 18)
    public String pruefeAltersfreigabe(int alter){
        if(alter >= 18)return "Person ist volljährig";
        if(alter >= 16)return "Person ist nicht volljähirg aber min. 16 Jahre alt";
        return "Person ist nicht volljährig und jünger als 16 Jahre";
    }
    
}