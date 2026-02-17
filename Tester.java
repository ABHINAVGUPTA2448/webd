/* class Tester{
    public static void main(String[] args) {
        int []num = {2,3,4,6,7,9};
        int sum = 0;
        float count = 5;
        for(int a:num) 
            sum += a;
        float avg = sum/count;
        System.out.println("Average:"+avg);    
    }
} */
/* class Tester{
    public static void main(String[] args) {
        int []num = {2,3,4,6,7,9};
        int sum = 0;
        int count = 5;
        for(int i=0;i<=5;i++) {
            sum = sum + num[i];
            System.out.println("sum:"+sum);
        } 
           
        float avg = sum/count;
        System.out.println("Average:"+avg);    
    }
} */

import java.util.Scanner;
class Tester{
    public static void main(String[] args) {
        try{ 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total number:");
        int count = scan.nextInt();
        int []num = {2,3,4,6,7,9};
        int sum = 0;
        //int count = 5;
        for(int i=0;i<=5;i++) {
            sum = sum + num[i];
            System.out.println("sum:"+sum);
        } 
        float avg = sum/count;
        System.out.println("Average:"+avg);   
        } 
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}