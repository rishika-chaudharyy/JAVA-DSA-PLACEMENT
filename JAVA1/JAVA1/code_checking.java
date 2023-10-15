//Code checking for type promotion

public class code_checking {
    public static void main(String args[]){
        byte b=4;
        char c='a';
        short s=8;
        int i=4;
        float f=4.23f;
        double d=34.56;
        double result=(f*b)+(i%c)-(d*s);
        System.out.println(result);
    }
}
