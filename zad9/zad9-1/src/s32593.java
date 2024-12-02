public class s32593 {
    public static void main(String[] args) throws Exception {
       methodCarrier carrier = new methodCarrier();

       carrier.setVal(34);
       carrier.setVal(34.0f);
       carrier.setVal((char)34);
       carrier.setVal((byte)34);
       //kompilator wybiera metode w której argumentach mieszczą się literały
       // ciekawe jest, że argument typu long setVal(34l); jest obsługiwany przez overload typu float
    }
}

