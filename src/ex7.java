import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int Chocolat, avr, SoldChocolat, monyThatyouspoil, mtugot;
        System.out.println("Enter how many pakage of chokolat did you bay ");
        Chocolat=input.nextInt();
        monyThatyouspoil=Chocolat*5;
        System.out.println("Enter how many pakage of chokolat did you sale");
        SoldChocolat=input.nextInt();
        mtugot=SoldChocolat*10;
        avr=mtugot-monyThatyouspoil;
        if(mtugot<=monyThatyouspoil)
            System.out.println("It was a bad deal :(");
        else
        if (mtugot>monyThatyouspoil)
            System.out. println("it was a great deal ;)) Mony that you borowed: "+avr+" NIS");
    }
}