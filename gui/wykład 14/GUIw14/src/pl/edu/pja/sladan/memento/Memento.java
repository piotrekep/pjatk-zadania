package pl.edu.pja.sladan.memento;

public class Memento {

    private StringBuilder text;

    public Memento(StringBuilder text){
        this.text = new StringBuilder(text);
    }

    public StringBuilder getText(){
        return text;
    }

}
