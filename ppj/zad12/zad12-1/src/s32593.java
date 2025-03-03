public class s32593 {
    public void method(){
        
        Rakieta rakieta = new Rakieta("rakieta 1");
        rakieta.zatankuj();
        
        try {
            rakieta.start();
        } catch (Exception e) {
            System.out.println(e);
        }
       


    }
    
}

class Rakieta{

    public String nazwa;
    public int wagaPaliwa;

    public Rakieta(String nazwa){
        wagaPaliwa=0;
        this.nazwa=nazwa;
    }

    public void zatankuj(){
        wagaPaliwa=(int)(Math.random()*2000);
    }

    public void start()throws Exception
    {
        if(wagaPaliwa<1000){
                throw new MojWyjatek("Start anulowany - za mało paliwa!");
        }
    }

}

class MojWyjatek extends Exception {
    public MojWyjatek(String message) {
        super(message);
    }
}