package tests;

import org.apache.juneau.annotation.Beanc;

public class pojodata1 {
	
	private String name;
	private String job;
	
	
	
	
	
	
	@Beanc(properties = "name,job")
	public pojodata1(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	
	

}
