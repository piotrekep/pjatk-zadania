package pl.pja.sladan;

public class MyClass implements Show {

//    @Override
//    public void showText(String text) {
//        System.out.println(text);
//    }

    @Override
    public void showHelloWithText(String text) {
        System.out.println("Hello " + text);
    }

}
