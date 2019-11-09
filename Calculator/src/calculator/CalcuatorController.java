package calculator;

import java.awt.event.ActionEvent;


public class CalcuatorController {
	public int number1;
	public int number2;
	public String lastOperator;
	public boolean check;
	String num;
	
	CalcuatorController() {
		this.number1 = 0;
		this.number2 = 0;
		this.lastOperator = null;
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
				num = temp; // temp 媛�?�쓣 �꽔?��
				check = false; // false濡� 留뚮뱾�뼱以�?
				return num;
			} else {
				num += temp;
			}
			
			return num;
		} else {
			System.out.println("this is not number: " + temp);

			if (number1 == 0) {
				lastOperator = temp;
				number1 = Integer.parseInt(num);

				
				check = true;
				return num;
			} 
			
			if(temp.equals("=")) {
				System.out.println("if(temp.equals(\"=\")");
				isOperatorCalc(lastOperator, num);
				lastOperator = temp;
			} else {
				if(lastOperator == "=") {
					lastOperator = temp;
					check = true;
					return Integer.toString(number1);
				}
				isOperatorCalc(lastOperator, num);
				lastOperator = temp;
			}
			
			if(temp.equals("C")) {
				check = true;

				number1 = 0;
				number2 = 0;
				
				return "0";
			}
			
			//number2 = 0;

			check = true;
			System.out.println("number1: " + number1);
			return Integer.toString(number1);
		}
	}
}
