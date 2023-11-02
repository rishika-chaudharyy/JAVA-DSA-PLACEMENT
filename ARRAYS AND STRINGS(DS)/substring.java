//Write a program to print the substring according to the given index excluding the end
public class substring {
    public static String print(String str,int si,int ei){
        String substr=" ";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str="HelloWorld";
        System.out.print(print(str,0,5));
        String str1="RishikaChaudhary";
        System.out.print(str1.substring(0,7));
    }
    
}
