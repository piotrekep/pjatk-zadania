public class s32593 {
    public static void main(String[] args) throws Exception {
        Prostokat pr = new Prostokat(6, 6);
        pr.show();

        Trojkat tr = new Trojkat(6);
        tr.show();

        Prostopadloscian prs = new Prostopadloscian(6,6,6 );
        prs.show();

        Prostopadloscian_upr prs_upr = new Prostopadloscian_upr(6,6,6 );
        prs_upr.show();

        Ostroslup os = new Ostroslup(6,6);
        os.show();

        Ostroslup_upr os_upr = new Ostroslup_upr(6,6);
        os_upr.show();

        Graniastoslup gr = new Graniastoslup(6,6);
        gr.show();

        Graniastoslup gr_upr = new Graniastoslup(6,6);
        gr_upr.show();


    }
}
