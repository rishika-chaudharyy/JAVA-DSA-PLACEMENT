//Write a program for break and continue keywords

public class break_continue {
    public static void main(String args[]){
        for(int i=1;i<=10;i++){
            if(i==3||i==9){
                //break;
                continue;
            }
        System.out.println(i);
        }
        System.out.println("I am out of the loop");
    }
}
