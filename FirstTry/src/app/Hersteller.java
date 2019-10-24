package app;

/**
 * Manufacturer Example
 * Impl. Abb Auto -> Hersteller "Der Standard-Konstruktur" Aufg 5
 * @author Karim Saad
 */
public class Hersteller {
    private String name = "";
    private String hsn = "";
    private String tsn = "";

    public Hersteller(){
        name = "Name missing";
    }

    /**
     * Sets the name property of this "car"
     * @param name String input name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the hsn prop. of this "car"
     * @param hsn String input hsn number
     */
    public void setHsn(String hsn){
        this.hsn = hsn;
    }

    /**
     * Sets the tsn prop of this "car"
     * @param tsn String input tsn
     */
    public void setTsn(String tsn){
        this.tsn = tsn;
    }

    /**
     * Gets the tsn
     * @return String tsn
     */
    public String getTsn(){
        return this.tsn;
    }

    /**
     * Gets the hsn
     * @return String hsn
     */
    public String getHsn(){
        return this.hsn;
    }

    /**
     * Gets the name
     * @return String name
     */
    public String getName(){
        return this.name;
    }
}