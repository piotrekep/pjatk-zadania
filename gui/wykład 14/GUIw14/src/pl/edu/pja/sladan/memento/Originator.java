package pl.edu.pja.sladan.memento;

public class Originator {

    private StringBuilder text;

    public Originator(){
        text = new StringBuilder();
    }

    public void addText(String text){
        this.text.append(text);
    }

    public Memento save(){
        return new Memento(text);
    }

    public void restore(Memento memento){
        text = memento.getText();
    }

    @Override
    public String toString() {
        return text.toString();
    }
}
