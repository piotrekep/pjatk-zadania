package pl.edu.pja.sladan.factoryMethod;

public class CracowLocation extends AbstractLocation{
    @Override
    public Report generateReport() {
        return new Report("Raport z Krakowa");
    }
}
