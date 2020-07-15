package ex04.quiz;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//Car, Airplane 빈을 생성하고, 의존성 주입
		//각 객체안에 있는 배터리를 자바클래스에서 출력
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml");
		Toy t1 = ctx.getBean(Toy.class);
		t1.getBattey().energy();
		
		AirPlane a1 = ctx.getBean(AirPlane.class);
		
		a1.getBattey().energy();
		
			
	}

}
