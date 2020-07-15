package ex07.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Computer {
	
	@Autowired
	@Qualifier("mouse")
	private Mouse mouse;
	
	
	private Keyboard kb;

	
	private Monitor monitor;
	
	
	public void computerInfo() {
		System.out.println("***컴퓨터 정보***");
		mouse.info();
		kb.info();
		monitor.info();
	}
	
	
	
	
	
	
	
	
}
