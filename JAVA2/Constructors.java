//Write a program for the constructors
public class Constructors {
    public static void main(String args[]){
    Student s1=new Student();
    s1.name="Rishika";
    s1.roll=12;
    s1.password="abcd";
    s1.marks[0]=100;
    s1.marks[1]=99;
    s1.marks[2]=98;
    
    // Student s2=new Student("Rishika");
    // System.out.println(s2.name);
    // Student s3=new Student(100);
    // System.out.println(s3.marks);
    // Student s4=new Student("Rishika",100);
    // System.out.println(s4.name+" "+s4.marks);

    Student s2= new Student(s1);
    s1.marks[2]=100;
    s2.password="xyz";
for(int i=0;i<3;i++){
    System.out.println(s2.marks[i]);
}
    }
}
 class Student {
    String name;
    int roll;
    String password;
    int marks[];

    
    Student(){
        marks=new int[3];
        System.out.println("Constructor is called...");
    }
    //COPY CONSTRUCTOR
    //shallow
    // Student(Student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }
    //deep
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<3;i++){
     this.marks[i]=s1.marks[i];
        }
    }

    Student(String name){
        marks=new int[3];
    //System.out.println("CONSTUCTOR IS CALLED>>>>>");
    this.name=name;
    }
    Student(int roll){
        marks=new int[3];
    this.roll=roll;
    }
    Student(String name, int roll){
         marks=new int[3];
        this.name=name;
        this.roll=roll;
    }

 }