public static void generateNumberSeries(int x) 
	{
        if (x <= 0) {
            System.out.println("Invalid input. Please enter a positive integer greater than 0.");
            return;
        }

        for (int i = 1; i <= x; i++) {
            System.out.print(2 * i - 1);

            if (i != x) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
	public static void main(String[] args) 
	{
		generateNumberSeries(4);
	}
