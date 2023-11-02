//Write a program for string builder
public class stringBuilder {
    public static void main(String args[]){
    StringBuilder sb=new StringBuilder("");
    for(char ch='a';ch<='z';ch++){
     sb.append(ch);
    }
    System.out.print(sb.length());
    }
}
