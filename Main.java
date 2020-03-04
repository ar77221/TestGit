package project.learningcoding;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;



public class Main {


    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int x = getIntLBYL();
        System.out.println("x is " + x);



//       int x = 98;
//       int y= 0;
//        System.out.println(divideLBYL(x, y) );
//        System.out.println(divideLBYL(x, y) );
//        System.out.println(divide(x, y) );

//        System.out.println("Enter number Employee details " );
//        int count = input.nextInt();
//        input.nextLine();
//
//        int[] returnedEmployee = readIntegers(count);
//        int returnedMin = findMin(returnedEmployee);
//
//        System.out.println("min = " + returnedMin );
//
//
//
//        int [] employee = {1,5,3,7,11,9,15};
//        System.out.println("Employee = " + Arrays.toString(employee));
//
//        reverse(employee);
//        System.out.println("Reversed employee" + Arrays.toString(employee));
////
int empSalary = 0;
boolean isSalary = false;
        int checkS = 0;

        System.out.println("Enter Salary");
        empSalary = input.nextInt( );

        System.out.println("Enter Salary" );
        int emSalary = input.nextInt();

//








//        int [] employees = getNumberEmployees(10);
//        for(int i = 0; i<employees.length; i++){
//            System.out.println("Employee " + (i+1) + "Employee are " + employees[i]);
//        }





//        System.out.println(Position.Manager.name());
//        String ss = "HR";
//
//
//        try{
//            Position.valueOf(ss);
//            System.out.println("valid" );
//        }catch (IllegalArgumentException e) {
//            System.out.println("invalid" );
//        }
//
//
//        String sse = "HR";
//        if(Position.checkExcept(sse, Position.Manager,Position.Programmer, Position.IT)){
//            System.out.println("valid" );
//        }else {
//            System.out.println("invalid" );
//        }
//        TheCount a = new TheCount();
//        TheCount b = new TheCount();
//        TheCount c = new TheCount();
//        TheCount z = new TheCount();


//        System.out.println(" The Objects count:  " + TheCount.getCount());

//        int result = A.Add(10, 2);
//        System.out.println(result );
//
//         result = A.Sub(10, 2);
//        System.out.println(result );
//
//         result = A.Mul(10, 2);
//        System.out.println(result );
//
//         result = A.Div(10, 2);
//        System.out.println(result );
//
//        A.setY(90);
//        System.out.println(A.getY() );
//        A z = new A();
//        A r = new A();
//
//        z.x = 10;
//        r.x = 7;


        //A z = new A();
        //    A.Example();
//        A.y= 500;
//        System.out.println(A.y );

        //System.out.println(A.y);
        //   System.out.println(A.y);
        // Employee emp = new Employee();

        //SimpleCalc calc = new SimpleCalc(2,5);
//        AnotherCalc calc =new AnotherCalc(4, 2);
//
//     int result = calc.Add();
//
//        System.out.println(result );
//
//        calc.setX(3);
//
//        calc.setY(5);
//        result = calc.Add();
//        System.out.println(result );
//
//        result= calc.Mul();
//        System.out.println(result );
//
//        result= calc.Div();
//        System.out.println(result );
//        System.out.println(calc.getX() );
//        System.out.println(calc.getY() );
//


    }
//    public static int[] getNumberEmployees(int numberOfEmployees ){
//        System.out.println("Enter Employee number " );
//
//        int[] employees = new int [numberOfEmployees];
//        for(int i= 0; i<employees.length; i++){
//            employees[i]= input.nextInt();
//        }
//        return employees;
//    }
//    public static int[]sortIntegrs (int [] array){
//        int[] sortedArray = new int[array.length];
//        for(int i= 0; i <array.length; i++){
//            sortedArray[i]= array[i];
//
//        }
//        boolean flag = true;
//        int temp;
//        while (flag){
//            flag=false;
//            for(int i= 0; i<sortedArray.length-1; i++){
//                if(sortedArray[i] <sortedArray[i+1]){
//                    temp= sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] =temp;
//                    flag=true;
//


          //    int salary = isBetween()
//            }
//        }
//        return sortedArray;
//    }
public static boolean isBetween(int salary) {
        Scanner in = new Scanner(System.in);
    if (salary < 0) {
        System.out.println("The Salary is less than 0");
        return false;
    } else if (salary > 50000) {
        System.out.println("The salary is greater than 50000");
        return false;
    } else {
        return true;
    }
}

       private static int [] readIntegers (int count){
        int []employee = new int[count];
        for(int i=0; i< employee.length; i++){
            System.out.println("Enter a number of employee" );
            int numberEmployee= input.nextInt();
            input.nextLine();
            employee[i]=numberEmployee;


        }
        return employee;
       }
       private static int findMin(int[]employee){
        int min= Integer.MAX_VALUE;
        for(int i=0; i<employee.length; i++){
            int value = employee[i];

            if (value <min){
                min=value;
            }
        }
        return min;
       }
       private static void reverse(int[] employee){

        int maxIndex = employee.length -1;
        int halfLength = employee.length /2;
        for(int i= 0; i<halfLength; i++){
            int temp= employee[i];
            employee[i]= employee[maxIndex -i];
            employee[maxIndex -i]= temp;
        }
       }
       private static int divideLBYL(int x, int y){
        if(y!=0){
            return x /y;

       }else {
            return 0;
        }

   }
   private static int divideEAP(int x, int y){
        try{
            return x/y;
        }catch (ArithmeticException e){
            return 0;
        }
    }
    private static int divide(int x, int y){
        return x/y;
    }
    private static int getInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private static int getIntLBYL(){
        Scanner input = new Scanner(System.in);
        boolean isValid =true;
        System.out.println("Please enter Integer" );
        String id = input.next();
        for(int i=0; i <id.length(); i++){
            if(!Character.isDigit(id.charAt(i))){
                isValid = false;
                break;
            }
        }
        if(isValid){
            return Integer.parseInt(id);
        }
        return 0;
    }

}



