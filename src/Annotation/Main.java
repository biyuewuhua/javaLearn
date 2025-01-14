package Annotation;

import java.lang.reflect.*;

public class Main {

public static void main(String[] args) throws Exception {
	Person p1 = new Person("Bob", "Beijing", 20);
	Person p2 = new Person("ss", "Shanghai", 20);
	Person p3 = new Person("Alice", "Shanghai", 199);
	for (Person p : new Person[] { p1, p2, p3 }) {
		try {
			check(p);
			System.out.println("Person " + p + " checked ok.");
		} catch (IllegalArgumentException e) {
			System.out.println("Person " + p + " checked failed: " + e);
		}
	}
}

static void check(Person person) throws IllegalArgumentException, ReflectiveOperationException {
    for(Field field : person.getClass().getFields()){
    	Range range = field.getAnnotation(Range.class);
    	if(range != null){
    		Object value = field.get(person);
    		if(value instanceof String){
    			if(((String)value).length() < range.min() || ((String)value).length() > range.max()){
    				throw new IllegalArgumentException("Invalid Field:" + field.getName());
				}
			}else if(value instanceof Integer){
    			if((Integer)value < range.min() || (Integer)value > range.max()){
    				throw new IllegalArgumentException("Invalid Field" + field.getName());
				}
			}
		}
	}

}

}
