package app;

//Implementierung Abb Auto -> Hersteller "Der Standard-Konstruktur" Aufg 5
public class Hersteller {
    private String name = "";
    private String hsn = "";
    private String tsn = "";
    public Hersteller(){
        name = "Name missing";
    }

    public void setName(String name){
        this.name = name;
    }
    public void setHsn(String hsn){
        this.hsn = hsn;
    }

    public void setTsn(String tsn){
        this.tsn = tsn;
    }

    public String getTsn(){
        return this.tsn;
    }

    public String getHsn(){
        return this.hsn;
    }

    public String getName(){
        return this.name;
    }
}