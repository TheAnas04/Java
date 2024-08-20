class OOP1 {
    public static void main(String[] args) {
        Say obj = new Say();
        obj.morning();
        obj.afternoon();
        obj.evening();
        obj.morning();
    }
}
class Say {
    public void morning(){
        System.out.println("Hello Good Morning");
    }

    public void afternoon(){
        System.out.println("Hello Good Afternoon");
    }

    public void evening(){
        System.out.println("Hello Good Evening");
    }
}