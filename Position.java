package project.learningcoding;

import java.util.Arrays;

public enum Position {

    MANAGER (1, "Manager")
            {
                @Override
                public void printString(){
                    System.out.println("MANAGER" );
                }
            }

    , PROGRAMMER(2, "PROGRAMMER")

            {
                @Override
                public void printString(){
                    System.out.println("PROGRMMAER" );
                }
            }
    , IT(3, "IT")
            {
                @Override
                public void printString(){
                    System.out.println("IT" );
                }
            }

    , HR(4, "HR")

            {
                @Override
                public void printString(){
                    System.out.println("HR" );
                }
            }, SECURITY(5, "SECURITY"){

        @Override
        public void printString(){
            System.out.println("SECURITY" );
        }
    }
    ;

    public int val;
    public String sval;
    private Position emposition;


    private Position(int value, String sv){

        this.val = value;
        this.sval = sv;

    }
    public abstract void printString();

    public Position getEmposition() {
        return emposition;
    }

    public void setEmposition(Position emposition) {
        this.emposition = emposition;
    }








//    public static  String forCode(int code){
//        return (code >= 0 && code < values().length) ? values()[code].name() : null;
//
//    }
//    public static boolean checkExcept(String el, Position... except) {
//        boolean results = false;
//
//        try {
//            results = !Arrays.asList(except ).contains(Position.valueOf(el));
//        }catch (Exception e){}
//        return results;
//    }



}
