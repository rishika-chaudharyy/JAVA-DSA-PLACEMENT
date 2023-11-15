//Write a basic program for classes and objects
public class Class_object{
    public static void main(String args[]){
        Pen p1=new Pen();//object of class Pen
        p1.changecolor("Yellow");
        System.out.println(p1.color);
        p1.changetip(5);
        System.out.println(p1.tip);
        p1.color="Red";
         System.out.println(p1.color);
    }
}
class Pen {
    String color;
    int tip;

    void changecolor(String newcolor){
        color=newcolor;
    }
    void changetip(int newtip){
        tip=newtip;
    }
}