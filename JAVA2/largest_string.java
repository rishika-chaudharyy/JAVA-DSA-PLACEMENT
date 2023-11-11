//Write a program to print the largest string
public class largest_string {
    public static void main(String args[]){
        String cars[]={"Buggati","Maserati","Porsche","BMW"};
        String largest=cars[0];
        for(int i=1;i<cars.length;i++){
            if(largest.compareToIgnoreCase(cars[i])<0){
                largest=cars[i];
            }
        }
        System.out.println(largest);
    }
}
