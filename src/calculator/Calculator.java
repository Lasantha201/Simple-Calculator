//Written by LK
package calculator;
import java.util.Scanner;

public class Calculator{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int output = 0;
        
        //while loop for iterate whole programme
        while(true){
            
            //input first number
            System.out.print("Enter the First Number: ");
            int num1 = input.nextInt();
            
            //input second number
            System.out.print("Enter the Second Number: ");
            int num2 = input.nextInt();
            
            //input operater
            System.out.print("Enter Your Operator(Press q or Q to exit): ");
            char oper = input.next().trim().charAt(0);
            
            //Check operaters and calculation
            if(oper == '+' || oper == '-' || oper == '*' || oper == '/' || oper == '%'){
                
                //Switch for selected operater calculation 
                switch(oper){
                    case '+':
                        output = num1 + num2; //addition
                        break;
                        
                    case '-':
                        output = num1 - num2; //substraction
                        break;
                        
                    case '*':
                        output = num1 * num2; // multiplication
                        break;
                        
                    case '/':
                        //check large number 
                        if(num2 != 0){
                            output = num1 /num2;
                            break;
                            
                        }
                        else{
                            System.out.println("Division by zero not allowed!");
                            break;
                        }
                    
                    case '%':
                        if(num2 !=0){
                            output = num1 % num2; // Modules
                            break;
                        }
                        else{
                            System.out.println("Module by zero not allowed!");
                            return;
                        }
                        
                    default:
                            System.out.println("Invalit operator!");
                            return;
                        
                }
                
            }
            
            //if click q or Q quiet the programme
            else if(oper == 'q' || oper == 'Q'){
                System.out.println("Quiting ....");
                break;
            }
            else{
                System.out.println("Invalid Operation!!");
            }
            //output
            System.out.println("Calculation: " + output);
            System.out.println();
        }
    }
}