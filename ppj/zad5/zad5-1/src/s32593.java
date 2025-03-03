public class s32593 {
    public static void main(String[] args) throws Exception {
        int k=987654321;
        String s ="";
        while(k !=0){
            int cyfra = k % 10;
            s=s+cyfra;
            k=k/10;
        }
        System.out.println(s);
    }
}
