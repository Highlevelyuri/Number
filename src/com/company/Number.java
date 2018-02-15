package com.company;

public class Number {
    int x ;
    public void num(){
        if (x>0) System.out.println( " Число " + x +"  положительное");
        else if (x<0) System.out.println( " Число " + x+ " отрецательное");

    }

    public   void prost () {
        if (x == 1) System.out.println(" Число " + x + "  не простое не сложное");
        else {

            int counter = 0;
            for (int i = 1; i < 100; i++) {

                if (x % i == 0) {
                    counter++;
                }


            }
            if (counter == 2) System.out.println(" Число " + x + "  простое");
            else System.out.println(" Число " + x + "  не простое");

        }
    }


    public  void del(){
        if( x%2==0 & x%3==0 & x%5==0 & x%6==0 & x%9==0) {
            System.out.println( " Число " + x +" делятся на 2,3,5,6,9 без остатка ");
        }

    }
}
