package project.learningcoding;

import java.awt.*;
import java.util.Scanner;

public class A {

    public static void main(String[] args){
        int result = divide();
        System.out.println(result );
    }

    private static int divide(){
        int x = getInt();
        int y = getInt();
        System.out.println("x is " + x + "y is " + y);
        return x /y;
    }

    private static int getInt(){
        Scanner s = new Scanner (System.in);
        System.out.println(" please enter integer" );
        return s.nextInt();
    }
//    public int x;
//    public static int y= 10;
////
////
////    public static void Example(){
////
////
////        System.out.println("Welcome" );
////
////
////    }
//
//
//    public static int Add(int a, int b){
//        return a + b;
//    }
//    public static int Sub(int a, int b){
//        return a - b;
//    }
//    public static int Mul(int a, int b){
//        return a * b;
//    }
//    public static int Div(int a, int b){
//        if(b == 0)
//            return 0;
//        return a / b;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public static int getY() {
//        return A.y;
//    }
//
//    public static void setY(int a) {
//        A.y = a;
//    }
}
