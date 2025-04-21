class Str2 {
    public static void main(String[] args) {
        int i;
        String str = "Hello World", temp = "";

        for( i=str.length()-1 ; i>=0 ; i-- ) {
            temp += str.charAt(i) ;
        }
        System.out.print(temp);
    }
}
