/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * date 30/20
 */
public class ArithmeticBase 
        
        
{

    double calculate(double x, double y) 
        {
       
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("");
            System.out.println("Enter the two numbers to perform operations ");
            System.out.print("Enter the first number : ");
            int a = s.nextInt();
            System.out.print("Enter the second number : ");
            int b = s.nextInt();
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 1 for ADDITION");
            System.out.println("Choose 2 for SUBTRACTION");
            System.out.println("Choose 3 for MULTIPLICATION");
            System.out.println("Choose 4 for DIVISION");
            
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                int add;
                add = a + b;
                System.out.println("Result : "+add);
                break;
 
                case 2:
                int sub;
                sub = a - b;
                System.out.println("Result : "+sub);
                break;
 
                case 3:
                int mul;
                mul = a * b;
                System.out.println("Result : "+mul);
                break;
 
                case 4:
                float div;
                div = (float) a / b;
                System.out.print("Result : "+div);
                break;
                
                default:
                System.out.print("Error! operator is not correct");
                
                //System.exit(0);
            }
        }
        }}

        
        
    