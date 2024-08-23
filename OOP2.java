/*
    Use of Constructor
*/
class OOP2 {
    public static void main(String[] args) {
        Sports play = new Sports();
        play.Football();
    }
}

class Sports {
    public Sports(){
        System.out.println("Selecting game.....");
    }
    public void Football(){
        System.out.println("Playing football");
    }
}