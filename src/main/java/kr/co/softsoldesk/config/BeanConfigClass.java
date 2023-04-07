package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;
import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;


@Configuration
public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	@Bean
	public DataBean1 data_bean1() {
		return new DataBean1();
	}

	@Bean
	public DataBean2 obj4() {
		return new DataBean2();
	}

	@Bean
	public DataBean2 obj5() {
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 obj6() {
		return new DataBean2();
	}
	
	/*
	// default 생성자를 통해서 주입되므로 자동주입은 안됨
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
	*/
}
