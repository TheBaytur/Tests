package com.company;

import static java.lang.StrictMath.pow;

public class Armstrong {
    public static void main(String[] args){
        int n  , po = 0, count = 0;
        double arm;
        int[] elems = {0,0,0,0};
        for(int i = 100; i < 9999; i++){
            for( n = i;n >= 1; count++){
                elems[count] = n%10;
                n /= 10;
                po++;
            }
            arm = pow(elems[0],po)+pow(elems[1],po)+pow(elems[2],po)+pow(elems[3],po);
            if(arm == i ){
                System.out.println(i);
            }
            po = 0;
            count = 0;
        }
    }
}
