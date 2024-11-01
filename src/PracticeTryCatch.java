public class PracticeTryCatch {

	public static void main(String[] args) {
		String a = "12";
		String b = "x9";
		// TODO: 捕获异常并处理
		try {
			int c = stringToInt(a);
			int d = stringToInt(b);
			System.out.println(c * d);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	static int stringToInt(String x) {
		return Integer.parseInt(x);
	}
}