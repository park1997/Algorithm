package MyLab9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Double postCalc(String expr) {
        String[] arr = expr.split("");
        double[] stack = new double[arr.length];
        int head = 0;
        double result = 0.0;
        for(String unit : arr) {
            if (unit.equals("+") || unit.equals("-") || unit.equals("*") || unit.equals("/")) {
                if (unit.equals("+")) {
                    result = stack[head - 1] + stack[head - 2];
                    head -= 1;
                    stack[head] = 0.0;
                    stack[head-1] = result;
                } else if (unit.equals("-")) {
                    result = stack[head - 1] - stack[head - 2];
                    head -= 1;
                    stack[head] = 0.0;
                    stack[head-1] = result;
                } else if (unit.equals("*")) {
                    result = stack[head - 1] * stack[head - 2];
                    head -= 1;
                    stack[head] = 0.0;
                    stack[head-1] = result;
                } else if (unit.equals("/")) {
                    result = stack[head - 1] / stack[head - 2];
                    head -= 1;
                    stack[head] = 0.0;
                    stack[head-1] = result;
                }
                if (head == 0) {
                    break;
                }
            }else{
                stack[head] = Double.parseDouble(unit);
                head += 1;
            }
        }
        return stack[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.next();
        System.out.println(expr + "="+postCalc(expr));




    }
}
