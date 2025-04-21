/*
    Inheritance
*/
class OOP4 {
    public static void main(String[] args) {
        B ob = new B();
        ob.m1();
        ob.m2();
    }
}

class A{
    public void m1(){
        System.out.println("m1() of class A");
    }
}

class B extends A {
    public void m2(){
        System.out.println("m2() of class B");
    }
}