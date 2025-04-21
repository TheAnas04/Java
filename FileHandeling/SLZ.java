/*
    16/09/2024
    Serialization and Deserialization
*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private String name;
    private int id;

    Student(String name,int id){
        this.name = name;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}

class SLZ {
    public static void main(String args[]){
        Student s1 = new Student("Alex",1);
        try {
            FileOutputStream fout = new FileOutputStream("SlzFile.txt");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(s1);
            System.out.println("Object Serialized");
        }
        catch( IOException e ){
            e.printStackTrace();
        }

        try {
            FileInputStream fin = new FileInputStream("SlzFile.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);
            Student temp = (Student) oin.readObject();
            System.out.println("Object Deserialized");
            System.out.println(temp.getName());
            System.out.println(temp.getId());
        }
        catch( ClassNotFoundException e ){
            e.printStackTrace();
        }
        catch( IOException e ){
            e.printStackTrace();
        }
    }
}
