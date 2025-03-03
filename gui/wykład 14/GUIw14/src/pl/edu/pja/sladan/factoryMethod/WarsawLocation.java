package pl.edu.pja.sladan.factoryMethod;

public class WarsawLocation extends AbstractLocation {
    @Override
    public Report generateReport() {
        return new Report("Raport z Warszawy");
    }
}
