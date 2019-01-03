package com.code.springdemo;

public class BaseBallCoach implements Coach {

	//create Dependency injection object
	FortuneService theFortune ;
	
	
	
	public BaseBallCoach(FortuneService theFortune) {		
		this.theFortune = theFortune;
	}

	@Override
	public String getWorkOut() {

		return "I will play baseball daily for 30 min";
	}

	@Override
	public String getDailyFortuneService() {
		// TODO Auto-generated method stub
		return theFortune.getDailyFortuneService();
	}
}
