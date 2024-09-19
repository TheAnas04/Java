/*
    19/09/2024
*/

interface Wishing{
    public void wish();
}

class LambdaExp {
    public static void main(String args[]){
        Wishing obj = () -> System.out.println("Hello, Good Morning");
        obj.wish();
    }
}
