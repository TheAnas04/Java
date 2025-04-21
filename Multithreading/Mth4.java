/*
    27/09/2024
    Synchronization case 2
*/

class Mth4 {
    public static void main(String[] args) {
        Work work = new Work();
        Student s1 = new Student(work);
        Teacher t1 = new Teacher(work);

        s1.start();
        t1.start();
    }
}

class Student extends Thread{
    Work work;

    public void run(){
        work.study();
    }

    public Student(Work work){
        this.work = work;
    }
}

class Teacher extends Thread{
    Work work;

    public void run(){
        work.teach();
    }

    public Teacher(Work work){
        this.work = work;
    }
}

class Work{
    synchronized public void study(){
        try{
            for( int i=1 ; i<=5 ; i++ ){
                System.out.println("Student is studing");
                Thread.sleep(800);
            }
        }
        catch( Exception e ){
            System.out.println(e);
        }
    }
    synchronized public void teach(){
        try{
            for( int i=1 ; i<=5 ; i++ ){
                System.out.println("Teacher is Teaching");
                Thread.sleep(800);
            }
        }
        catch( Exception e ){
            System.out.println(e);
        }
    }
}