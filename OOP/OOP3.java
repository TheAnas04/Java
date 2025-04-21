/*
    24/08/2024
    Method overloading 
*/
class OOP3 {
    public static void main(String[] args) {
        Add obj = new Add();
        int sum = obj.add(2,4);
        System.out.println("Sum of two numbers : "+sum);
        System.out.println("Sum of three numbers : "+obj.add(12, 13,14));
    }
}
class Add {
    public int add(int a,int b){
        System.out.println("Adding two numbers....");
        return a+b;
    }
    public int add(int a,int b,int c){
        System.out.println("Adding three numbers....");
        return a+b+c;
    }
}