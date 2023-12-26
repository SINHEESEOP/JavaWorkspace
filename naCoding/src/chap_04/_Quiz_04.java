package chap_04;

import java.util.Scanner;

public class _Quiz_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int billingCharges = sc.nextInt() * 4000;
        boolean withDisabled = true;
        boolean lightCar = false;


        if (billingCharges > 30000) billingCharges = 30000;
        if (withDisabled || lightCar) billingCharges /= 2;

        System.out.println(billingCharges);
    }
}
