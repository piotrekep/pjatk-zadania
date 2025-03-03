public class s32593 {
    public static void main(String[] args) throws Exception {
        char[][] chars = new char['z'-'a']['z'-'a'];
        for(int i=0; i<chars.length; i++){
            char c ='a';
            for(int j=0; j<chars.length; j++,c+=1){
                chars[i][j] = c;
            }
        }

        for(
            int i=0, step=1;
            i<chars.length;
            step = (step<<1)%chars[i].length, i++
        )
        
        System.out.println(chars[i][step]);
    }
}
