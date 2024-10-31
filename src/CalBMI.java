import java.util.Scanner;

public class CalBMI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入您的体重(kg):");
		double weight = scanner.nextDouble();
		System.out.print("请输入您的身高(m):");
		double height = scanner.nextDouble();
		double BMI = weight / (height * height);
		if (BMI < 18.5) {
			System.out.println("过轻");
		} else if (BMI < 25) {
			System.out.println("正常");
		} else if (BMI < 28) {
			System.out.println("过重");
		} else if (BMI < 32) {
			System.out.println("肥胖");
		} else {
			System.out.println("非常肥胖");
		}
		scanner.close();
	}
}