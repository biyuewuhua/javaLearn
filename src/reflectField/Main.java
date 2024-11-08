package reflectField;

import java.lang.reflect.Field;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws Exception{
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射给name和age字段赋值:
		Class cls = p.getClass();
		Field fn = cls.getDeclaredField("name");
		Field fa = cls.getDeclaredField("age");
		fn.setAccessible(true);
		fa.setAccessible(true);
		fn.set(p, name);
		fa.set(p, age);
		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}
