/*
    27/08/2024
    Use of static keyword with method and variable
*/
class Static1 {
    public static void main(String args[]){
        Student.studentClass=9;
        Student.showClass();
    }
}
class Student {
    private String name ; 
    static int studentClass ;
    public static void showClass(){
        System.out.println("Class of students : "+studentClass);
    }
}