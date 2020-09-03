package com.XandO;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	
    	double a,b,result;
    	boolean condition = true;
    	char [] symbol = {'+','-','/','*','y','n'};
    	char equation ;
    	char yesOrNO;
    	
    	
    	do {
    		System.out.print("Enter first number: \n");
        	a = scanner.nextDouble();
        	System.out.print("Enter second number: \n");
        	b = scanner.nextDouble();
        	System.out.print("Enter equation: \n");
        	equation = scanner.next().charAt(0);
        	for (int i = 0; i < symbol.length; i++) {
				if (equation != symbol[i]) {
					System.out.println("Please introduce  + , - , / * ");
					break;
				}
			}
        	if (equation == symbol[0]) {
        		result = a + b;
        		System.out.println("Result is = " + result );
				
			}else if (equation == symbol[1]) {
				result = a - b ;
				System.out.println("Result is = " + result);
				
			}
        	else if (equation == symbol[2]) {
        		try {
            		result = a / b;
            		if (b <= 0 ) {
						System.out.println("Infinity");
					}
            		else {
						System.out.println("Result is = " + result);
					}
				} catch (ArithmeticException e) {
					System.out.println("Te rog introdu un numar mai mare de cat 0");	
				}
        		
				
			}else  if (equation == symbol[3]) {
				result = a * b;
        		System.out.println("Result is = " + result);

			}
        	System.out.println("Do you want to do more operations Yes (y) or No (n)");
        	yesOrNO = scanner.next().charAt(0);
        	if (Character.toLowerCase(yesOrNO) == 'y') {
			condition = true;
			}
        	else {
				condition = false;
				System.out.println("Thank you !");
			}
		} while (condition);
    	
    }
}
