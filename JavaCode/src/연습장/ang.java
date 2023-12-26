package 연습장;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

abstract class ang {

    private int a = 10;
    private int b;
    public String str = new String("안녕하세요");

    public ArrayList arr = new ArrayList();
    public ang() {
    }

    public ang(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void hello() {
        System.out.println("안녕하세요");
    }

//    @Override
//    public String toString() {
//        return "ang{" +
//                "a=" + a +
//                ", b=" + b +
//                '}';
//    }

//    Arrays<String> arr = new ArrayList<>();

    abstract void ang22 ();

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        String str = new String("안녕하세요");
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
