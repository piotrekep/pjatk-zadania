public class s32593 {
    public static void main(String[] args) throws Exception {
        methodCarrier carrier = new methodCarrier();
        Number number = new Number();
        
        number.setValue(4);

        carrier.setValue(number); //klasa jest obsługiwana poprzez jej odniesienie, czyli zostanie zmodyfikowana oryginalna, a nie jej kopia jak w przypadku zmiennej
        carrier.setValue(345);
        carrier.setValue(3.14f);

    }
}
