/*
    03/10/2024
        SYNCHRONIZATION CASE 6
*/
class Mth8 {
    public static void main(String args[]){
        Task task = new Task();
        Six1 t1 = new Six1(task);
        Six2 t2 = new Six2(task);
        Six3 t3 = new Six3(task);
        Six4 t4 = new Six4(task);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Six1 extends Thread{
    Task task;
    public Six1 (Task task){
        this.task = task;
    }
    public void run(){
        task.m1();
    }
}

class Six2 extends Thread{
    Task task;
    public Six2 (Task task){
        this.task = task;
    }
    public void run(){
        task.m2();
    }
}

class Six3 extends Thread{
    Task task;
    public Six3 (Task task){
        this.task = task;
    }
    public void run(){
        task.m3();
    }
}

class Six4 extends Thread{
    Task task;
    public Six4 (Task task){
        this.task = task;
    }
    public void run(){
        task.m4();
    }
}

class Task {
    public synchronized void m1(){
        try {
            System.out.println("m1() Started");
            for( int i=1 ; i<=5 ; i++ ){
                System.out.println(Thread.currentThread().getName()+"-m1");
                Thread.sleep(1000);
                }
                System.out.println("m1() Ended");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    public synchronized void m2(){
        try {
            System.out.println("m2() Started");
            for( int i=1 ; i<=5 ; i++ ){
                System.out.println(Thread.currentThread().getName()+"-m2");
                Thread.sleep(1000);
            }
                System.out.println("m2() Ended");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static synchronized void m3(){
        try {
            System.out.println("m3() Started");
            for( int i=1 ; i<=5 ; i++ ){
                System.out.println(Thread.currentThread().getName()+"-m3");
                Thread.sleep(1000);
            }
            System.out.println("m3() Ended");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static synchronized void m4(){
        try {
            System.out.println("m4() Started");
            for( int i=1 ; i<=5 ; i++ ){
                System.out.println(Thread.currentThread().getName()+"-m4");
                Thread.sleep(1000);
            }
            System.out.println("m4() Ended");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}