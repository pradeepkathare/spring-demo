/**
 * 
 */
package com.code.springdemo;

/**
 * @author Pradeep.kathare
 * 
 */
public class CricketCoach implements Coach {

	FortuneService myCricketFortune;

	String email;
	String team;

	CricketCoach() {
		System.out.println("CricketCoach : inside the no-arg-criccket construtor ");
	}

	// This is sample for setter injection
	public void setMyCricketFortune(FortuneService myCricketFortune) {
		System.out.println("CricketCoach : inside the setter method : myCricketFortune ");
		this.myCricketFortune = myCricketFortune;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach : inside the setter method : email ");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside the setter method : team ");
		this.team = team;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.code.springdemo.Coach#getWorkOut()
	 */
	@Override
	public String getWorkOut() {
		// TODO Auto-generated method stub
		return "i will workout cricket daily";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.code.springdemo.Coach#getDailyFortuneService()
	 */
	@Override
	public String getDailyFortuneService() {
		// TODO Auto-generated method stub
		return "Cricket coach : " + myCricketFortune.getDailyFortuneService();
	}

}
