package app;

/**
 * Book Class
 * @author Karim Saad
 */
public class Buch extends Artikel {
    //Implementierung OOP Grundkurs 
    private String autor;
    private String isbn;

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

    public void setISBN(String isbn){
        this.isbn = isbn;
    }

    /**
     * Returns the article no of this book
     * @return
     */
    public String setISBN(){
        return this.isbn;
    }
}