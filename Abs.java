/*
    30/08/2024
    Use of Interfaces.
*/
class Abs {
    public static void main(String args[]){
        RBI boi = new BOI();
        boi.interestRate();

        RBI ktk = new Kotak();
        ktk.interestRate();
    }
}
interface RBI {
    public void interestRate();
}

class BOI implements RBI{
    public void interestRate(){
        System.out.println("Interest rate of BOI is 1.6%");
    }
}

class Kotak implements RBI{
    public void interestRate(){
        System.out.println("Interest rate of Kotak is 2.2%");
    }
}