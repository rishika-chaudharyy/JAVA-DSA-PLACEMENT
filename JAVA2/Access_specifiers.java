//Write a program for types of access specifiers
public class Access_specifiers {
    public static void main(String args[]){
        Bankaccount myacc=new Bankaccount();
        //myacc.password="hj";This will give error as it is private
        myacc.username="Rishika";
        System.out.println(myacc.username);
        myacc.pass("Hj");
        
     
    }
}
class Bankaccount {
    public String username;
    private String password;
    public void pass(String pwd){
        pwd=password;
    }


}