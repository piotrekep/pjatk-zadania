package pl.edu.pja.sladan.generics;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(10);
        Circle circle = new Circle(12);
        Triangle triangle = new Triangle(3, 5, 8);

        FigureBox<Square> squareFigureBox = new FigureBox<>(square);
        FigureBox<Circle> circleFigureBox = new FigureBox<>(circle);
        FigureBox<Triangle> triangleFigureBox = new FigureBox<>(triangle);

//        FigureBox<String> stringFigureBox = new FigureBox<>("Ala");

        System.out.println(squareFigureBox);
        System.out.println(circleFigureBox);
        System.out.println(triangleFigureBox);

        Inscribed<Square, Circle> inscribed = new Inscribed<>(square, circle);
        System.out.println(inscribed);

        Inscribed<FigureBox<Square>, FigureBox<Triangle>> inscribed1 =
                new Inscribed<>(squareFigureBox, triangleFigureBox);

        System.out.println(inscribed1);

        wildcardStandard(squareFigureBox);
        wildcardStandard(circleFigureBox);
        wildcardStandard(triangleFigureBox);

        wildcardUpperBound(squareFigureBox);
        wildcardUpperBound(circleFigureBox);
        wildcardUpperBound(triangleFigureBox);

//        wildcardLowerBound(squareFigureBox);
        wildcardLowerBound(circleFigureBox);
//        wildcardLowerBound(triangleFigureBox);

    }

    public static void wildcardStandard(FigureBox<?> figureBox){
        System.out.println(figureBox);
    }

    public static void wildcardUpperBound(FigureBox<? extends Figure> figureBox){
        System.out.println(figureBox);
    }

    public static void wildcardLowerBound(FigureBox<? super Circle> figureBox){
        System.out.println(figureBox);
    }

}
