package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Mathfunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Available operators are [+,-,*,/,%,sin,cos,tan,cot]");
        System.out.println("Enter your operator");
        String op = sc.next();
        String[] cal = {"+", "-", "*", "/", "%"};
        String[] tri = {"sin", "cos", "tan", "cot"};
        Mathfunctions mf = new Mathfunctions();
        if (Arrays.asList(cal).contains(op)) {
            System.out.println("Enter your first number");
            int fn = sc.nextInt();
            System.out.println("Enter your second number");
            int sn = sc.nextInt();
            switch (op) {
                case "+":
                    Add a = new Add();
                    a.add(fn, sn);
                    break;
                case "-":
                    Sub s = new Sub();
                    s.sub(fn, sn);
                    break;
                case "*":
                    Mult m = new Mult();
                    m.mult(fn, sn);
                    break;
                case "/":
                    Div d = new Div();
                    d.div(fn, sn);
                    break;
                case "%":
                    Mod mo = new Mod();
                    mo.mod(fn, sn);
                    break;
                default:
                    System.out.println("Sorry man");
                    break;
            }
        } else if (Arrays.asList(tri).contains(op)) {
            System.out.println("Enter your degree");
            int n = sc.nextInt();
            switch (op) {
                case "sin":
                    Sin sin = new Sin();
                    sin.sin(n);
                    break;
                case "cos":
                    Cos cos = new Cos();
                    cos.cos(n);
                    break;
                case "tan":
                    Tan tan = new Tan();
                    tan.tan(n);
                    break;
                case "cot":
                    Cot cot = new Cot();
                    cot.cot(n);
                    break;
                default:
                    System.out.println("Sorry man");
                    break;
            }
        } else {
            System.out.println("Invalid operator");
        }

    }

}

