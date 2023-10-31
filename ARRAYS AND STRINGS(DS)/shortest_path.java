//Write a program to find the displacement from the directions
public class shortest_path {
    public static float getpath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            //south
            if(dir=='S'){
               y=y-1;
            }
            //north
            else if(dir=='N'){
                y=y+1;
            }
            //east
            else if(dir=='E'){
                x=x+1;
            }else{
                x=x-1;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String str="NS";
        float result=getpath(str);
        System.out.println("The shortest path is "+result);
    }
}
