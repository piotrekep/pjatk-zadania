public class s32593 {
    public static void main(String[] args) throws Exception {
        int[] tab = new int[10];
        int licznik=0;

        for (int i : tab) {
            i=(int) Math.round(Math.random());
            if(i!=0)licznik++;
        }
        System.out.println(licznik+" jedynek"+" i "+ (10-licznik) +" zer");
    }
}
