package app;

import java.util.EmptyStackException;
/***
 * Kunde class (Customer class) for UserManagement
 * Impl. Abb 17 study task
 * @author Karim saad
 */
public class Kunde {
    // Implementierung in nach Abb 17 (Aufg 9 unter "Methoden in Java ") Webreader
    private String name;
    private String vorname;
    private String geburtsdatum; // ich glaube das sollte eigentlich Date sein, aber egal
    private String geschlecht; //...
    private int kundenNr;

    // Erweiterung in OOP Abb 27 "Kontrollstrukturen"
    private boolean premiumkunde;

    //Erweiterung in OOP Abb 30 "Kontrollstrukturen"
    private boolean gutschein;

    /**
     * sets the lastname of the customer
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * returns the last name of the customer
     * @return
     */
    public String getName(){
       return this.name;
    }

    /**
     * Sets the first name of the customer
     * @param vorname
     */
    public void setVorname(String vorname){
        this.vorname = vorname;
    }

    /**
     * returns the First Name of the cUstomer
     * @return
     */
    public String getVorname(){
       return this.vorname;
    }

    /**
     * sets the birthday of this customer
     * @param geburtsdatum
     */
    public void setGeburtsdatum(String geburtsdatum){
        this.geburtsdatum = geburtsdatum;
    }

    /**
     * returns the birthdate of this customer
     * @return
     */
    public String getGeburtsdatum(){
       return this.geburtsdatum;
    }

    /**
     * Sets the gender of this customer
     * @param geschlecht
     */
    public void setGeschlecht(String geschlecht){
        this.geschlecht = geschlecht;
    }

    /**
     * Returns the gender of the customer (m/w/d)
     * @return
     * @throws UngueltigesGeschlecht
     */
    public String getGeschlecht() throws UngueltigesGeschlecht {
        if(this.geschlecht == null)throw new NullPointerException(); // Implementierung "Typische Szenarien bei der Ausnahmebehandlung" Aufg 3 && Impl Definition eigene Exceptions Aufg 3 
        if(this.geschlecht.isEmpty())throw new EmptyStackException(); // Implementierung "Typische Szenarien bei der Ausnahmebehandlung" Aufg 3 && Impl Definition eigene Exceptions Aufg 3
        if(this.geschlecht != "m" && this.geschlecht != "w" && this.geschlecht != "d")throw new UngueltigesGeschlecht(); // Implementierung "Typische Szenarien bei der Ausnahmebehandlung" Aufg 3 && Impl Definition eigene Exceptions Aufg 3
        return this.geschlecht;
    }

    // Implementierung Abb 27 "Kontrollstrukturen"
    /**
     * Check if the customer has premium access
     * @return
     */
    public boolean isPremiumkunde(){
        return this.premiumkunde;
    }

    /**
     * Sets the premium status of this customer
     * @param status
     */
    public void setPremiumKunde(boolean status){
        this.premiumkunde = status;
    }

    /**
     * checks if customer has coupon
     * Implementierung Abb 30 "Kontrollstrukturen"
     * @return
     */
    public boolean hasGutschein(){
        return this.gutschein;
    }

    /**
     * Sets the coupon code
     * @param gutschein
     */
    public void setGutschein(boolean gutschein){
        this.gutschein = gutschein;
    }


    /**
     * Checks the age due to law restrictions. For example german youth protection law
     * // Implementierung Abb 32 Jugendschutz (ist Person über 18)
     * @param alter
     * @return
     */
    public String pruefeAltersfreigabe(int alter){
        if(alter >= 18)return "Person ist volljährig";
        if(alter >= 16)return "Person ist nicht volljähirg aber min. 16 Jahre alt";
        return "Person ist nicht volljährig und jünger als 16 Jahre";
    }

    /**
     * Returns the customer ID / Kundennummer
     * @return
     */
    public int getKundenNr(){
        return this.kundenNr;
    }
    
}