//Write a program for getters and setters
public class Getters_setters {
    public static void main(String args[]){
    Pens p1=new Pens();
    
    p1.setcolor("RED");
    p1.settip(5);
    System.out.println(p1.getcolor());
    System.out.println(p1.gettip());


    }
}
class Pens {
    private String color;
    private int tip;

    String getcolor(){ //getters
        return this.color;
    }
    int gettip(){
        return this.tip;
    }

    void setcolor(String newcolor){//setters
        this.color=newcolor;
    }
    void settip(int newtip){
        this.tip=newtip;
    }
}