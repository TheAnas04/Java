public class Palindrome {
    public String longestPalindrome(String s) {
        String ans="",rev="",temp="";
        int i,j,p,max=0;
        for( p=0; p<s.length() ; p++ ){
            for( i=p, rev="" ; i<s.length() ; i++ ){
                rev = rev+s.charAt(i);
                if(rev.length()>max){
                    for( j=rev.length()-1,temp="" ; j>=0 ; j-- ){
                        temp = temp+rev.charAt(j);
                    }
                    if(rev.equals(temp) && (max < rev.length()) ){
                        ans = rev;
                        max = rev.length();            
                    }
                }
            }
        }
        return ans;
    }
}

class Str{
    public static void main(String args[]){
        String str = "abbc";
        Palindrome sol = new Palindrome();
        System.out.println("The Longest Palindrome : "+sol.longestPalindrome(str));
    }
}