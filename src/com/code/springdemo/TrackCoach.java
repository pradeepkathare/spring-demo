package com.code.springdemo;

public class TrackCoach implements Coach {

	public FortuneService fortuneService;
	
	//creating non-arg constructor because to create normal object
	public TrackCoach() {
		System.out.println("TrackCoach no-arg constructor");
		
	}
	// this is constructor injection
	public TrackCoach(com.code.springdemo.FortuneService fortuneService) {	
		System.out.println("TrackCoach argumented constructor");
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getWorkOut() {
		return "It is TrackCoach";
	}

	@Override
	public String getDailyFortuneService() {
		// TODO Auto-generated method stub
		return "track Coach : "+fortuneService.getDailyFortuneService();
	}

	public void init() {
		System.out.println("Im init method before startup");
	}
	
	public void destroy() {
		System.out.println("Im destroy method");
	}
	
}
