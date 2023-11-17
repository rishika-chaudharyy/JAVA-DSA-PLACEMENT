//Write a program to remove duplicates from a string
public class Removeduplicates {
    public static void remove(String str,StringBuilder newstr, int idx , boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
char curr=str.charAt(idx);
if(map[curr-'a']==true){
    remove(str , newstr , idx+1,map);
}else{
    map[curr-'a']=true;
    remove(str,newstr.append(curr),idx+1,map);
}
    }
    public static void main(String args[]){
String str="apppnnnaaacollege";
remove(str,new StringBuilder(""),0,new boolean[26]);
    }
}
