//Write a program to print the letters of the string using charAt
public class print_letters {
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        String str="Rishika Chaudhary";
        printletters(str);
    }
}
