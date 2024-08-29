/*
    29/08/2024
    Use of abstract keyword
*/
class OOP6 {
    public static void main(String args[]){
        A obj = new B();
        obj.m1();
    }
}
abstract class A {
    abstract public void m1();
}

class B extends A {
    public void m1(){
        System.out.print("Abstract method is overriden to use");
    }
}