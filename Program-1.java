 public static void calculate(double a, double b, String operation) 
	{
		switch (operation) {
		case "add":
			System.out.println(a+b);
			break;
		case "subtract":
			System.out.println(a-b);
			break;
		case "multiply":
			System.out.println(a*b);
			break;
		case "divide":
			if (b == 0) {
				System.out.println("Cannot divide by zero.");
			}
			System.out.println(a/b);
			break;
		default:
			System.out.println("Invalid operation. Supported operations: 'add', 'subtract', 'multiply', 'divide'.");
		}
	}
	public static void main(String[] args)
	{
		calculate(11,12,"add");
	}
      
