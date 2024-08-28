/*
    28/08/2024
    Use of super keyword
*/
class Super {
    public static void main(String[] args) {
        A obj = new A();
        A obj1 = new B();
    }
}
class A {
    public A() {
        System.out.println("Default Constructor of class A");
    }
    public A(int a){
        System.out.println("Parameterized Constructor of class A");
    }
}
class B extends A {
    public B(){
        super(5);
        System.out.println("Constructor of class B");
    }
}