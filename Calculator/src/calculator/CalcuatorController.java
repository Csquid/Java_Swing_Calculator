package calculator;

import java.awt.event.ActionEvent;


public class CalcuatorController {
	public int number1;
	public int number2;
	public String lastOperator;
	public boolean checkLastOperatorEquals;
	public boolean check;
	String num;
	
	CalcuatorController() {
		this.number1 = 0;
		this.number2 = 0;
		this.lastOperator = null;
		this.checkLastOperatorEquals = false;
		this.check = true;
	}
	
	public void isOperatorCalc(String temp, String num) {
		switch (temp) {
		case "+":
			number2 = Integer.parseInt(num);
			number1 += number2;
			break;
		case "-":
			number2 = Integer.parseInt(num);
			number1 -= number2;
			break;
		case "*":
			number2 = Integer.parseInt(num);
			number1 *= number2;
			break;
		case "/":
			number2 = Integer.parseInt(num);
			number1 /= number2;
			break;
		}
	}

	public String eventController(/*@Param(RequestEvent)*/ActionEvent event) {
		System.out.println("Event: " + event.getActionCommand());
		String temp = event.getActionCommand();
		
	
		if (temp.charAt(0) >= '0' && temp.charAt(0) <= '9') {
			if (temp.equals(num) && temp.equals("0")) {
				return "0";
			}

			if (check == true) {
				num = temp; // temp
				check = false; // false
				return num;
			} else {
				num += temp;
			}
			
			return num;
		} else {
			System.out.println("this is not number: " + temp);

			if(temp.equals("C")) {
				check = true;

				number1 = 0;
				number2 = 0;
				
				return "0";
			}
			
			if (number1 == 0) {
				lastOperator = temp;
				number1 = Integer.parseInt(num);
				
				
				check = true;
				return num;
			} 
			
			//backspace
			if(temp.equals("☜")) {
				int number1Length = Integer.toString(number1).length();
	
				
				//만약 number1의 숫자가 1자리 숫자일때.
				if(number1Length <= 1) {
					System.out.println("Test");
					number1 = 0;
				} else {
					number1 = Integer.parseInt(Integer.toString(number1).substring(0, number1Length - 1));
				}
				
				return Integer.toString(number1);
			}
			
			if(temp.equals("=")) {
				System.out.println("if(temp.equals(\"=\")");
				isOperatorCalc(lastOperator, num);
				checkLastOperatorEquals = true;
			} else {
				if(checkLastOperatorEquals) {
					lastOperator = temp;
					checkLastOperatorEquals = false;
					return Integer.toString(number1);
				}
				isOperatorCalc(lastOperator, num);
				lastOperator = temp;
			}
			
			//number2 = 0;

			check = true;
			return Integer.toString(number1);
		}
	}
}
