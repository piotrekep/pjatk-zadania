public class s32593 {
    public static void main(String[] args) throws Exception {
        double a =1;
        double x;
        if(a >= 0) x = 1.701;
        if(a < 0)x = 2D * 3.14f;
        System.out.println(x); //program się nie wykona bo nie ma jednoznacznej sciezki gdzie x jest inicjalizowany
    }
}
