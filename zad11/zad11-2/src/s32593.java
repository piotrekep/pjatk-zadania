public class s32593 {
    public void method(){
        Owoc skrzynka[] = new Owoc[100];
        Drzewo drzewo = new Drzewo();
        double masa=0;

        for(int i=0; i<skrzynka.length;i++)
        {
            skrzynka[i]=drzewo.zerwijOwoc();
            masa+=skrzynka[i].getMass();
            if(masa>=5000) break;
        }

        int iloscJablek=0;
        int iloscPomaranczy=0;
        int iloscGruszek=0;

        for (Owoc owoc : skrzynka) {
            if(owoc!=null){
                switch (owoc.getNazwa()) {
                    case "Jabłko" -> iloscJablek++;
                    case "Gruszka" -> iloscGruszek++;
                    case "Pomarańcza" -> iloscPomaranczy++;
                }
            }
            else break;
        }

        System.out.println("Jabłka: " + iloscJablek);
        System.out.println("Gruszki: " + iloscGruszek);
        System.out.println("Pomarańcze: " + iloscPomaranczy);
        
        System.out.println("masa: " + (int)masa + "gr");
    }
}

class Owoc{
    private String nazwa;
    private double masa;
    
    Owoc(String nazwa){
        this.nazwa=nazwa;
    }
    
   public void setMass(double masa) {
    this.masa=masa;
   }

   public double getMass() {
    return this.masa;
   }

   public String getNazwa() {
    return this.nazwa;
   }
}

class Jablko extends Owoc{
    Jablko(){
        super("Jabłko");
        super.setMass(Math.random()*150+100);
    }
}

class Gruszka extends Owoc{
    Gruszka(){
        super("Gruszka");
        super.setMass(Math.random()*150+100);
    }
}

class Pomarańcza extends Owoc{
    Pomarańcza(){
        super("Pomarańcza");
        super.setMass(Math.random()*150+100);
    }
}

class Drzewo{
    public Owoc zerwijOwoc(){
        int zerwanyOwoc = (int)Math.round(Math.random()*2);
        Owoc owoc;

        switch (zerwanyOwoc) {
            case 0:
                 return new Jablko();
                
            case 1:
                 return new Gruszka();
               
            case 2:
                 return new Pomarańcza();
            default:
                 return null;
        }

    }
}