package app;

/**
 * Book Class
 * @author Karim Saad
 */
public class Buch extends Artikel {
    //Implementierung OOP Grundkurs 
    private String autor;

    /**
     * Gets the author
     * @return String author
     */
    public String getAutor(){
        return this.autor;
    }

    /**
     * Sets the author
     * @param autor String
     */
    public void setAutor(String autor){
        this.autor = autor;
    }

    /**
     * Gets the Description of this article (Book)
     * @return String description
     */
    public String getBeschreibung(){
        return super.getBeschreibung() + "; " + autor;
    }
}