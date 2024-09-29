
import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        String str=input.next();

        System.out.println("Enter your subject marks: ");
        int m1= input.nextInt();
        int m2= input.nextInt();
        int m3= input.nextInt();
        int m4= input.nextInt();
        int m5= input.nextInt();

        int total=m1+m2+m3+m4+m5;
        float avgperc= (float) total /5;
        System.out.println("Total marks: "+total);
        System.out.println("Average Percentage: "+avgperc);

       if(avgperc>=90){
           System.out.println("Grade A ");
       } else if (avgperc>=80) {
           System.out.println("Grade B ");
       }
       else if(avgperc>=70){
           System.out.println("Grade C ");

       } else if (avgperc>=60) {
           System.out.println("Grade D ");
       } else if (avgperc>=50) {
           System.out.println("Grade E ");
       } else  {
           System.out.println("Grade F ");
       }



    }
}
