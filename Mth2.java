/*
    21/09/2024
    Multithreading with Runnable
*/

class Faculty implements Runnable{
    public void run(){
        for( int i=1 ; i<=5 ; i++ ){
            System.out.println(i+"  ");
            try{
                Thread.sleep(500);
            }
            catch( Exception e ){
                System.out.println(e.getMessage());
            }
        }
    }
}

class Mth2 {
    public static void main(String[] args) {
        Faculty f1 = new Faculty();
        Thread t1 = new Thread(f1);
        t1.start();
        
        Faculty f2 = new Faculty();
        Thread t2 = new Thread(f2);
        t2.start();
    }
}
