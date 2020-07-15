package ex08.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex01.SpringTest;
import ex02.construct.Chef;
import ex02.construct.Hotel;
import ex03.setter.DatabaseDev;
import ex03.setter.MemberDAO;

//이 클래스가 스프링 설정 파일이라는 것을 표기합니다. -xml을 대신할 수 있음

@Configuration
public class JavaConfig {
	//@Bean 이 붙은 메서드를 스프링컨테이너가 bean처럼 사용 가능
	
	//<bean id = "test" class = "ex01.SpringTest"/>
	@Bean
	public SpringTest test() {
		return new SpringTest();
	}
	
	//<bean id = "chef" class ="ex02.construct.Chef"/>
	@Bean
	public Chef chef() {
		return new Chef();
	}
	
	//<bean id = "hotel" class = "ex02.construct.Hotel">
	@Bean
	public Hotel hotel() {		
		return new Hotel(chef());
	}
	
	//세터주입
	//<bean id = "dbDev" class ="ex03.setter.DatabaseDev">
	@Bean
	public DatabaseDev dbDev() {
		DatabaseDev dev = new DatabaseDev();
		dev.setUrl("데이터베이스명");
		dev.setUid("아이디");
		dev.setUpw("비밀번호");
		
		return dev;
	}
	
	//<bean id = "memberDAO" class = "ex03.setter.MemberDAO">
	public MemberDAO memberDAO() {
		MemberDAO dao = new MemberDAO();
		dao.setDatasource(dbDev());
		return dao;
	}
	
}
