package org.springframework.context.autowirebean;


public class DemoB {

	private String name;

	private DemoA demoA;



	public DemoB(DemoA demoA) {
		this.demoA = demoA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DemoA getDemoA() {
		return demoA;
	}

	public void setDemoA(DemoA demoA) {
		this.demoA = demoA;
	}
}
