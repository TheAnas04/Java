
/*
    24/09/2024 
    Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.
    Create default and parameterized constructor.
    Method show(): to print all data member 
    Write main function in another class(Say XYZ) and store three TwoBHK flat’s.information and print information using show method. Also print total amount of all flats.
*/
import java.util.Scanner;

class OOPproblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the room area : ");
        int a = sc.nextInt();

        System.out.println("Enter the hall area : ");
        int b = sc.nextInt();

        System.out.println("Enter the Price : ");
        int c = sc.nextInt();

        System.out.println("Enter the room-2 area : ");
        int d = sc.nextInt();

        TwoBHK flat = new TwoBHK(a, b, c, d);
        flat.show();
        TwoBHK flat1 = new TwoBHK(50, 62, 5000, 51);
        flat1.show();
        TwoBHK flat2 = new TwoBHK(40, 50, 1000, 32);
        flat2.show();
        System.out.println("Total price of all flats : " + TwoBHK.totalPrice);

    }
}

class OneBHK {
    private int roomArea;
    private int hallArea;
    private int price;

    public OneBHK() {
        roomArea = hallArea = price = 0;
    }

    public OneBHK(int a, int b, int c) {
        roomArea = a;
        hallArea = b;
        price = c;
    }

    public void show() {
        System.out.println("Room area of the flat : " + roomArea);
        System.out.println("Hall area of the flat : " + hallArea);
        System.out.println("Price of the flat : " + price);
    }

    public int getRoomArea() {
        return roomArea;
    }

    public int getHallArea() {
        return hallArea;
    }

    public int getPrice() {
        return price;
    }
}

class TwoBHK extends OneBHK {
    private int room2Area;
    static int totalPrice = 0;

    public TwoBHK() {
        room2Area = 0;
    }

    public TwoBHK(int a, int b, int c, int d) {
        super(a, b, c);
        room2Area = d;
        totalPrice = totalPrice + c;
    }

    public void show() {
        System.out.println("Area of room : " + getRoomArea());
        System.out.println("Area of room : " + getHallArea());
        System.out.println("Area of room : " + getPrice());
        System.out.println("Area of Room 2 : " + room2Area);
    }
}