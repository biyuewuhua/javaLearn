

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class PracticeThrowException {

	public static void main(String[] args) {
		System.out.println(tax(2000, 0.1));
		System.out.println(tax(-200, 0.1));
		System.out.println(tax(2000, -0.1));
	}

	static double tax(int salary, double rate) {
		// TODO: 如果传入的参数为负，则抛出IllegalArgumentException
		try {
			if (salary>=0 && rate>=0) {
				return salary * rate;
			} else {
				var e = new IllegalArgumentException();
				throw e;
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			throw e;
		}
	}
}