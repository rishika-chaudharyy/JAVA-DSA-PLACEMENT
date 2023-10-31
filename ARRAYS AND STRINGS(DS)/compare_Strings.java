//Write a program to compare two strings
public class compare_Strings {
    public static void main(String args[]){
        String s1="Rishika";
        //String s2="Rishika";
        String s3=new String("Rishika");
        // if(s1==s2){
        //     System.out.println("Strings are equal"); //This is equal beacuse no new keyword is used so it considers the value same as the above value
        // }else{
        //     System.out.println("Strings are not equal");
        // }
        // if(s1==s3){
        //     System.out.println("Strings are equal");//This is not equal as new keyword is used and this does not uses the above value instead it creates a new value
        // }else{
        //     System.out.println("Strings are not equal");
        // }
        if(s1.equals(s3)){//only compares the values
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
