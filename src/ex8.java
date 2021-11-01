import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int January, February, March, avr;
        System.out.println("Enter how many mm of rain fell in March ");
        March=input.nextInt();
        System.out.println("Enter how many mm of rain fell in February");
        February=input.nextInt();
        System.out.println("Enter how many mm of rain fell in January");
        January=input.nextInt();
        avr=January+February+March;
        if(avr>100)
            System.out.println("Bro, it were a reiny mounth");
    }
}
