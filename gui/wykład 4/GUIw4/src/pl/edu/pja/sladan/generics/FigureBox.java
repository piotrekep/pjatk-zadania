package pl.edu.pja.sladan.generics;

public class FigureBox <T extends Figure> {

    private T figure;

    public FigureBox(T figure){
        this.figure = figure;
    }

    public T getFigure() {
        return figure;
    }

    public void setFigure(T figure) {
        this.figure = figure;
    }

    @Override
    public String toString() {
        return "Box " + figure.toString() + figure.getPerimeter();
    }
}
