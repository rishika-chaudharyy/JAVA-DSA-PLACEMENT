//Write a program for static keyword
public class Static {
    public static void main(String args[]){
    // Student s1=new Student();
    //  s1.school="JMV";
    //  Student s2=new Student();
    //  System.out.println(s2.school);
    // Student s3=new Student();
    // s3.school="DPS";
    //  System.out.println(s1.school);
    //  System.out.println(s2.school);
    //  System.out.println(s3.school);

     }
}

class Student{
    int roll ;
    String name;
    static String school;

    void setname(String name){
        this.name=name;
    }
    String getname(){
return this.name;
    }
}