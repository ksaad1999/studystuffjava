package app;

/**
 * Game Class 
 * @author Karim Saad
 */
public class Spiel extends Artikel {
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
}