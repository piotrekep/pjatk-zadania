package pl.edu.pja.sladan.generics;

public class Inscribed<T, K> {

    private T figure1;
    private K figure2;

    public Inscribed(T figure1, K figure2){
        this.figure1 = figure1;
        this.figure2 = figure2;
    }

    public T getFigure1() {
        return figure1;
    }

    public K getFigure2() {
        return figure2;
    }

    @Override
    public String toString() {
        return figure1 + " inscribed in " + figure2;
    }
}
