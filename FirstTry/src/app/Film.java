package app;


/**
 * Film Class
 * @author Karim Saad
 */
public class Film extends Artikel {
    //Implementierung OOP Grundkurs 
    public String regisseur;

    /**
     * Gets the Regisseur as String
     * @return String regisseur
     */
    public String getRegisseur(){
        return this.regisseur;
    }

    /**
     * Sets the Regisseur
     * @param regisseur String regisseur
     */
    public void setRegisseur(String regisseur){
        this.regisseur = regisseur;
    }
}