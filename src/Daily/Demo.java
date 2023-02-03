package Daily;

public class Demo {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.setNum1(14);
		calculator.setNum2(4);
		System.out.println(calculator.add());;
		System.out.println(calculator.subtract());;
		System.out.println(calculator.multiply());;
		System.out.println(calculator.divide());;
	}

}
