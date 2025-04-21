class IntToRoman {
    public static void main(String args[]){
        int n=3367;
        String str = "";
        while( n>0 ){
            if( n>=900 ){
                if( n>=1000) { str += "M" ; n -= 1000 ; }
                else { str += "CM" ; n -= 900 ; }
            }

            else if( n>=400 ){
                if( n>=500) { str += "D" ; n -= 400 ; }
                else { str += "CD" ; n -= 500 ; }
            }

            else if( n>=90 ){
                if( n>=100) { str += "C" ; n -= 100 ; }
                else { str += "XC" ; n -= 90 ; }
            }
            else if( n>=40 ){
                if( n>=50) { str += "L" ; n -= 50 ; }
                else { str += "XL" ; n -= 40 ; }
            }
            else if( n>=9 ){
                if( n>=10) { str += "X" ; n -= 10 ; }
                else { str += "IX" ; n -= 9 ; }
            }
            else if( n>=4 ){
                if( n>=5) { str += "V" ; n -= 5 ; }
                else { str += "IV" ; n -= 4 ; }
            }
            else if( n>=1 ) { str += "I" ; n -= 1; }
        }
        System.out.print(str+"  ");
    }
}
