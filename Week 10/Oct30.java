public class Oct30 {
	public static void main(String[] args) {
		weatherMethod(80);
		System.out.println(weatherMethod2(95));
	}

	// void method
	public static void weatherMethod(int temp) {
		String response = "";
		if(temp > 90)  {
			response = "It's a hot day!";
		}
		else if(temp <= 89 && temp >= 72) {
			response = "It's a pleasant day.";
		}
		else if(temp < 72) {
			response = "I gues it's winter in Hawaii!";
		}
		System.out.println(response);
	}

	// return method
	public static String weatherMethod2(int temp) {
		String response = "";
		if(temp > 90)  {
			response = "It's a hot day!";
		}
		else if(temp <= 89 && temp >= 72) {
			response = "It's a pleasant day.";
		}
		else if(temp < 72) {
			response = "I gues it's winter in Hawaii!";
		}
		return response;
	}
}