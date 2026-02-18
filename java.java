import java.util.Scanner;

public class java{
    public static void main{
        Scanner bot = new Scanner(System.in);
        int highway = bot.nextInt;
         int hundreds = highway/100;
                int final = highway-(hundreds*100);
        if(highway%2=0){
            if(highway>100){
                if(final!=highway){
               
                System.out.print("The"+highway+"is auxillary, serving the "+final+" going east/west")}
            }else{
                if(highway>0&&final!=highway){
                System.out.print("The"+highway+"is primary, going east/west")
                }
            }
        }else{
            if(highway>100){
                 if(final!=highway){
           
                System.out.print("The"+highway+"is auxillary, serving the "+final+" going north/south")
                 }
            }else{
                if(highway>0&&final!=highway){
                System.out.print("The"+highway+"is primary, going north/south")
                
            }

        }

    }
}}