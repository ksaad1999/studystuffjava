package app;

//Impl 68 "Eigene Exceptions"
public class TestException extends Exception {
    public TestException () {
        super ("Der Mindestbestell wert ist ein Kuchen!");
    }

    public TestException (String msg) {
        super (msg);
    }

}