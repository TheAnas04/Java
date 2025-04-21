/*
    20/09/2024
    Multi-Threading
*/

class Table extends Thread {
    public void run(){
        try {
            for( int i=1 ; i<=5 ; i++ ){
                System.out.println(i+" "+getName());
                Thread.sleep(500);
            }
        }
        catch( Exception e ){
            e.getMessage();
        }
    }
}

class Mth1 {
    public static void main(String[] args) {
        Table t1 = new Table();
        Table t2 = new Table();
        t1.start();
        t2.start();
    }
}
