package pl.edu.pja.sladan.factoryMethod;

public class Report {

    private String text;

    public Report(String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
