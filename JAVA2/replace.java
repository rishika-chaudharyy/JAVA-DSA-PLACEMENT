//Write a program for all the replace methods
public class replace {
    public static void main(String args[]){
        String str="Substrings are important in programming. Substrings can be used to extract specific information from a larger string. Repeated substrings, such as 'substring,' can be found throughout this text.";
        System.out.println(str.replace('s','a'));
        System.out.println(str.replaceFirst("substring","no"));
        System.out.println(str.replace("is","was"));
        System.out.println(str.replaceAll("substring", "a"));

    }
}
