package com.softserve.yki;

/**
 * Created by Yulianna Korol on 10.11.2016.
 */
public class SquareEquationSolver {

    private  int a;
    private int b;
    private int c;

    public SquareEquationSolver(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void SolveSquareEquation(){

        int D = b*b-4*a*c;
        if(D>0){

            double x1 = (-b+Math.sqrt(D))/2*a;
            double x2= (-b - Math.sqrt(D))/2*a;
            System.out.println(x1);
            System.out.println(x2);
        }
        else if(D==0){

            int x = -b/2*a;
            System.out.println(x);
        }
        else if(D<0){
         System.out.println("There is no roots in this square equation");
        }
        System.out.println("Param-param-pam");
    }
}
