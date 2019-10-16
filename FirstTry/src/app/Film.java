package app;

public class Film extends Artikel {
    //Implementierung OOP Grundkurs 
    public String regisseur;

    public String getRegisseur(){
        return this.regisseur;
    }
    public void setRegisseur(String regisseur){
        this.regisseur = regisseur;
    }
}