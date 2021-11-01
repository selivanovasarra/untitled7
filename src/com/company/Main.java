package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int ppl, bouts, coust;
        System.out.println("Enter how many people are traveling ");
        ppl=input.nextInt();
        bouts=(ppl/8);
        if(ppl%8==0)
            System.out.println("the travelers shal order "+bouts+" bouts"+"\n coust is"+bouts*30 );
        else
            System.out.println("the travelers shal order "+(bouts+1)+" bouts"+"\n the coust is"+(bouts+1)*30);
    }
}
