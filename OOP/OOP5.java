/*
    26/08/2024
    Method overriding 
*/
class OOP5 {
    public static void main(String[] args) {

        A ob = new A();  // object of class A ans Refrence of class A 
        ob.m1();

        A obj = new B(); // object of class B ans Refrence of class A 
        obj.m1();
    }
}
class A {
    public void m1(){
        System.out.println("m1() of class of A");
    }
}
class B extends A {
    public void m1(){
        System.out.println("m1() of class of A is overriden in class B");
    }
}