/*
    30/09/2024
        SYNCHRONIZATION CASE 4
*/
class Mth6 {
    public static void main(String args[]){
        Task task1 = new Task();
        Task task2 = new Task();
        Four t1 = new Four(task1);
        Four t2 = new Four(task2);
        t1.start();
        t2.start();
    }
}

class Four extends Thread{
    Task task;
    public void run(){
        task.m1();
    }
    public Four(Task task){
        this.task = task;
    }
}

class Task{
    public synchronized void m1(){
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