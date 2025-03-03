package pl.pja.sladan;

public enum Kolor {

    CZERWONY(true),
    ZIELONY,
    NIEBIESKI,
    BLEKITNY,
    CZARNY,
    BIALY{
        @Override
        public String toString() {
            return "Kolor biały";
        }
    };

    private boolean czySkladowa;

    Kolor(){
        this.czySkladowa = false;
    }

    Kolor(boolean czySkladowa){
        this.czySkladowa = czySkladowa;
    }

    public void czySkladowa(){
        System.out.println(czySkladowa);
    }

}
