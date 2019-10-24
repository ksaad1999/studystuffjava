package app;

/**
 * Easy class
 * Task 7 unter "primitive Datentypen" webreader
 * @author Karim Saad
 */
public class EinfacheKlasse {
    private char c = 'c';
    private String str = "Hi";

    /**
     * Gets the char
     * @return char c
     */
    public char getChar() {
        return this.c;
    }
    /**
     * gets the example str
     * @return String str
     */
    public String getString() {
        return this.str;
    }

    /**
     * Sets the str
     * @param str
     */
    public void setStr(String str){
        this.str = str;
    }

    /**
     * Sets the char prop
     * @param c char
     */
    public void setChar(char c){
        this.c = c;
    }
}