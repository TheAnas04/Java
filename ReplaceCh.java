class ReplaceCh {
    public static void main(String[] args) {
        int i,j;
        char add='f', remove='d',ch='a';
        String str = "fox jums over the lazy dog";
        String strnew = "";
        for( i=0 ; i<str.length() ; i++ ){
            ch = str.charAt(i);
            if(ch==remove){
                strnew = strnew + add;
            }
            else {
                strnew = strnew + ch;
            }
        }
        System.out.println(strnew);
    }
}