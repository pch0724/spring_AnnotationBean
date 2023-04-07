package kr.co.softsoldesk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Primary;

public class TestBean1 {

	private int data1;
	private DataBean1 data2;
	
	// 자동 주입을 변수에 설정(set) => .getter만 추가
	// 자동으로 setter 메서드가 추가되어 setter로 주입을 완료함
	// getter만 필요
	@Autowired
	private DataBean1 data3;
	// getter만 필요
	@Autowired
	@Qualifier("obj4") // data4, data5 => DataBean2 타입으로 Autowired => 같은 주로로 인식하여 에러 발생 
	private DataBean2 data4;
	// getter만 필요
	@Autowired
	@Qualifier("obj5")
	private DataBean2 data5;
	// getter만 필요
	@Autowired(required = false) // required = false : DataBean2라는 클래스가 없으면 무시하고 있으면 자동 주입
	@Qualifier("obj6")
	private DataBean2 data6;

	//=============================================================================================
	
	public int getData1() {
		return data1;
	}
	/*
	@Required는 5.0 이상에서는 지양하므로 생성자를 통해 필수 속성 주입 권장
	public TestBean1(int data1) {
		this.data1 = data1;
	}
	*/
	@Required // 반드시 주입해야하는 속성 Spring 5.0 이하에서만 가능
	public void setData1(int data1) {
		this.data1 = data1;
	}

	public DataBean1 getData2() {
		return data2;
	}

	// 자동주입(타입)
	@Autowired
	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}

	public DataBean1 getData3() {
		return data3;
	}

	public DataBean2 getData4() {
		return data4;
	}

	public DataBean2 getData5() {
		return data5;
	}

	public DataBean2 getData6() {
		return data6;
	}

}
