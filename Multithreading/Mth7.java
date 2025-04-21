/*
    01/10/2024
        SYNCHRONIZATION CASE 5
*/
class Mth7 {
    public static void main(String args[]){
        Task task1 = new Task();
        Task task2 = new Task();
        Five t1 = new Five(task1);
        Five t2 = new Five(task2);
        t1.start();
        t2.start();
    }
}

class Five extends Thread{
    Task task;
    public void run(){
        task.m1();
    }
    public Five(Task task){
        this.task = task;
    }
}

class Task{
    public static synchronized void m1(){
        try {
            for( int i=1 ; i<=5 ; i++ ){
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(900);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}