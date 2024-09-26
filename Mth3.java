/*
    26/09/2024
    SYNCHRONIZATION 
*/
class Sync1 {
    public static void main(String args[]){
        Task task = new Task();
        One t1 = new One(task);
        One t2 = new One(task);

        t1.start();
        t2.start();
    }
}


class One extends Thread{
    Task task;
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is in the Run");
        task.m1();
    }
    public One(Task task){
        this.task = task;
    }
}


class Task {
    public synchronized void m1(){
        try {
            for( int i=1 ; i<=5 ; i++ ){
                System.out.println(i+"  "+Thread.currentThread().getName());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}