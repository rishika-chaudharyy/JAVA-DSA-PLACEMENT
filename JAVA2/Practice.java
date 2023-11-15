// public class Practice {
//     public static void main(String arhs[]){
//     Pen p1=new Pen();
//     p1.color="black";
//     p1.tip=7;
//     p1.changecolor("Yellow");
//     System.out.println(p1.color);
//     p1.changetip(5);
//     System.out.println(p1.tip);
//     }
// }
// class Pen{
//     String color;
//     int tip;

//     void changecolor(String newcolor){
//         color=newcolor;
//     }
//     void changetip(int newtip){
//         tip=newtip;
//     }
// }


// public class Practice{
//     public static void main(String args[]){
//     Bankaccount acc=new Bankaccount();
//     acc.username="rishika";
//     acc.setpass("abcd");
    

//     }
// }
// class Bankaccount{
//     public String username;
//     private String password;

//     public void setpass(String pass){
//         password=pass;
//     }
// }

// public class Practice{
//     public static void main(String args[]){ 
//     Animal a=new Animal();
//     a.setskin("brown");
//     a.setbreed("labrador");
//     System.out.println(a.getcolor());
//     System.out.println(a.getbreed());
//     }
// }
// class Animal{
//     private String skincolor;
//     private String breed;

//     //setters
//     public void setskin(String skincolor){
//         this.skincolor=skincolor;
//     }
//     public void setbreed(String breed){
//         this.breed=breed;
//     }

//     //getters
//     public String getcolor(){
//         return this.skincolor;
//     }
//     public String getbreed(){
//         return this.breed;
//     }
// }

// public class Practice{
//     public static void main(String args[]){
//     Student s1=new Student("rishika");
//     System.out.println(s1.name);
//     Student s= new Student();
//     Student s2=new Student(123);
//     Student s3=new Student("rishika",123);
//     }
// }
// class Student{
//     String name;
//     int roll;
//     Student(){
//         System.out.println("Constructor is called");
//     }
//     Student(String name){
//         this.name=name;
//         System.out.println("Constructor is called");
//     }
//     Student(int roll){
//         this.roll=roll;
//     }
//     Student(String name,int roll){
//         this.name=name;
//         this.roll=roll;
//     }
    
// }

public class Practice {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Eishi";
        s1.roll = 123;
        s1.marks = new int[]{100, 99, 100}; // Initialize marks directly
        
        Student s2 = new Student(s1);
        s2.pass = "Rishi";
        
        s1.marks[2] = 95; // Modifying s1 marks
        
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]); // Output s2 marks
        }
    }
}

class Student {
    String name;
    int roll;
    String pass;
    int marks[];

    Student() {
        System.out.println("Constructor is called");
    }

    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.pass = s1.pass;
        // Create a new array and copy values from s1.marks to this.marks
        this.marks = new int[s1.marks.length];
        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
