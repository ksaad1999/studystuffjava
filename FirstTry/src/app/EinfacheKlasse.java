package app;

// Aufgabe 7 unter "primitive Datentypen" webreader
public class EinfacheKlasse {
    private char c = 'c';
    private String str = "Hi";

    public char getChar() {
        return this.c;
    }
    public String getString() {
        return this.str;
    }

    public void setStr(String str){
        this.str = str;
    }

    public void setChar(char c){
        this.c = c;
    }
}