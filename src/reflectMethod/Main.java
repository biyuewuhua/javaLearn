package reflectMethod;

import java.lang.reflect.Method;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws Exception {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射调用setName和setAge方法:
		Class cls = p.getClass();
		Method setName = cls.getMethod("setName", String.class);
		Method setAge = cls.getMethod("setAge", int.class);
		setName.invoke(p, name);
		setAge.invoke(p, age);
		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}
