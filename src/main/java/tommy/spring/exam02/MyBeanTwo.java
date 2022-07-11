package tommy.spring.exam02;

public class MyBeanTwo implements MyBean {
	@Override
	public void sayHello(String name) {
		System.out.println("Hello, " + name + "!!!");
	}
}
