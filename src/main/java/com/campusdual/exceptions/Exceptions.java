package com.campusdual.exceptions;

public class Exceptions {

    public static int divisionByNumber(int a, int b)throws ByZeroException{
        if(b==0){
            throw new ByZeroException("Cannot perform a division by zero");
        } else{
            return a/b;
        }


    }

    public static void main(String[] args) {
       // int dividend = 3, divisor = 1;
       // int res = Exceptions.divisionByNumber(dividend,divisor);
       // System.out.println(res);
       // String greetings = "Hello there!";
       // System.out.println(Integer.parseInt(greetings));

        int dividend = 3, divisor = 0;

        try {
            int res = Exceptions.divisionByNumber(dividend, divisor);
        }catch (ArithmeticException e){
            System.err.println("Program failed" +e.getMessage());
            e.printStackTrace();
        }

            System.out.println("Program finished");

    }
}
