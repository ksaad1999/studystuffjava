package app;

public class App {
    public static void main(String[] args) throws Exception {
        Kunde k = new Kunde();
        
        k.setName("hi");
        System.out.println(k.getName());
        System.out.println("Hello Java");
    }
}