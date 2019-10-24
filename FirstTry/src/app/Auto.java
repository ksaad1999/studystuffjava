package app;

/**
 * Implementierung Abb Auto -> Hersteller "Der Standard-Konstruktur" Aufg 5
 * @author Karim Saad
 **/
public class Auto {
    private Hersteller hersteller;
    private String modell = "";
    private float hubraum = 0f;
    private int anzahlRaeder = 0;
    private int extraTueren = 0;

    public Auto() {
        this.modell = "Ford GTX";
    }

    /**
     * Impl. Aufg 11  "Überladen von Konstruktoren"
     * Auto Constructor Optional
     * @param modell Modell modell (Modell Type)
     * @param hubraum float hubraum (size of Hubraum)
     */
    public Auto(String modell, float hubraum){
        this.modell = modell;
        this.hubraum = hubraum;
    }

    /**
     * Auto Constructor 2
     * Implementierung "Konstruktoren zur Erzeugung von Obj" Aufg 9 "Überladen von Konstruktoren"
     * @param hersteller Hersteller hersteller (Instance of Hersteller)
     * @param modell Modell modell (Istance of Modell)
     * @param hubraum float hubraum (sizeof Hubraum)
     */
    public Auto(Hersteller hersteller, String modell, float hubraum){
        this(modell, hubraum);
        this.hersteller = hersteller;
    }

    /**
     * Task 9 - Auto Constructor 3
     * Implementierung "Konstruktoren zur Erzeugung von Obj" Aufg 9 "Überladen von Konstruktoren"
     * @param modell Modell model (modelType)
     * @param hubraum float sizeof Hubraum
     * @param anzahlRaeder int Räder (Count of wheels)
     * @param extraTueren int extraTueren (extraDoors)
     */
    public Auto(String modell, float hubraum, int anzahlRaeder, int extraTueren) {
        this.modell = modell;
        this.hubraum = hubraum;
        this.anzahlRaeder = anzahlRaeder;
        this.extraTueren = extraTueren;
    }

    /**
     * Gets the Hersteller prop (returns the Manufcaturer)
     * Implementierung "Konstruktoren zur Erzeugung von Obj" Aufg 9 "Überladen von Konstruktoren"
     * @return Hersteller
     */
    public Hersteller getHersteller(){
        return this.hersteller;
    }
    /**
     * Sets the hersteller prop
     * @param hst
     */
    public void setHersteller(Hersteller hst){
        this.hersteller = hst;
    }

    //Ursprüngliche Impl

    /**
     * Gets the model
     * @return Modell m
     */
    public String getModell(){
        return this.modell;
    }

    /**
     * Gets the hubraum size
     * @return float Hubraum
     */
    public float getHubraum(){
        return this.hubraum;
    }

    /**
     * Count of wheels
     * @return int anzahlRaeder
     */
    public int getAnzahlRaeder(){
        return this.anzahlRaeder;
    }

    /**
     * Count of extra Doors
     * @return int extraTueren
     */
    public int getExtraTueren(){
        return this.extraTueren;
    }

    /**
     * Sets the model prop
     * @param modell ModellType
     * 
     */
    public void setModell(String modell) {
        this.modell = modell;
    }
    
    /**
     * Sets the Hubraum size
     * @param hubraum float hubraumSize
     */
    public void setHubraum(float hubraum) {
        this.hubraum = hubraum;
    }

    /**
     * Sets the count of wheels
     * @param anzahlRaeder int countWheels
     */
    public void setAnzahlRaeder(int anzahlRaeder){
        this.anzahlRaeder = anzahlRaeder;
    }

    /**
     * Sets the count of extra Doors
     * @param extraTueren int extraDoors
     */
    public void setExtraTueren(int extraTueren){
        this.extraTueren = extraTueren;
    }
}