//Write a progarm to count the lowercases in a string
public class count_lowercase {
    public static void main(String args[]){
        String str="Rishika Chaudhary";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;

            }
        }
        System.out.println("The number of vowels are : "+count);

    }
    
}
