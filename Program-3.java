public static Map<Integer, Integer> countMultiples(List<Integer> inputList) 
	{
		Map<Integer, Integer> countMap = new HashMap<>();

		for (int i = 1; i <= 9; i++) {
			int count = 0;
			for (int num : inputList) {
				if (num % i == 0) {
					count++;
				}
			}
			countMap.put(i, count);
		}

		return countMap;
	}
	public static void main(String[] args) 
	{
		List<Integer> inputList = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);

		Map<Integer, Integer> result = countMultiples(inputList);

		System.out.println(result);
	}
