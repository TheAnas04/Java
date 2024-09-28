/*
    28/09/2024
    Synchronization case 3
*/

class Mth5 {
    public static void main(String args[]){
        Work work = new Work();
        Player p = new Player(work);
        Coach c = new Coach(work);

        p.start();
        c.start();
    }
}

class Player extends Thread{
    Work work;
    public void run(){

        work.play();
        work.meet();
    }
    public Player(Work work){
        this.work = work;
    }
}

class Coach extends Thread{
    Work work;
    public void run(){
        work.coaching();
        work.meet();
    }
    public Coach(Work work){
        this.work = work;
    }
}

class Work{
    synchronized public void coaching(){
        try{
            for( int i=0 ; i<5 ; i++ ){
                System.out.println("Coaches coaching players");
                Thread.sleep(500);
            }
        }
        catch( Exception e ){
            e.printStackTrace();
        }
    }

    synchronized public void play(){
        try{
            for( int i=0 ; i<5 ; i++ ){
                System.out.println("Players are playing");
                Thread.sleep(500);

            }
        }
        catch( Exception e ){
            e.printStackTrace();
        }
    }

    public void meet(){
        try{
            for( int i=0 ; i<5 ; i++ ){
                System.out.println("Meeting is going on called by "+Thread.currentThread().getName());
                Thread.sleep(500);
            }
        }
        catch( Exception e ){
            e.printStackTrace();
        }
    }
}