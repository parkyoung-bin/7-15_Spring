package ex01;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		SpringTest test = new SpringTest();
		test.test(); 
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml");
		
		SpringTest s = ctx.getBean(SpringTest.class);
		s.test();
		SpringTest s2 = ctx.getBean(SpringTest.class);
		s2.test();
		
		
		//스프링IOC컨테이는 기본적으로 bean을 싱글톤 형식으로 생성합니더.
		//만약 bean을 사용할때 마다 새로운 객체 형태로 쓰고 싶다면 scope="prototype" 기술하면 됩니다.
		
		System.out.println(s);
		System.out.println(s2);
		
		
		
	}
}
