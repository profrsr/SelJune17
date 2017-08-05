package reflections;

import java.lang.reflect.Method;

public class MyMethods {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<?> wrappers = Class.forName("reflections.WrapperMethods");		
		Method[] methods = wrappers.getDeclaredMethods();		
		for (Method method : methods) {
			System.out.println(method.getName());
		}		
	}
}











