package com.giaybac.traprange.entity;

public class bean {
	String DisabilityCatagory;
	String participants;
	String BallotsCompleted;
	String BallotsIncomplete;
	String Accuracy;
	String timeToComplete;
	public String getDisabilityCatagory() {
		return DisabilityCatagory;
	}
	public void setDisabilityCatagory(String disabilityCatagory) {
		DisabilityCatagory = disabilityCatagory;
	}
	public String getParticipants() {
		return participants;
	}
	public void setParticipants(String participants) {
		this.participants = participants;
	}
	public String getBallotsCompleted() {
		return BallotsCompleted;
	}
	public void setBallotsCompleted(String ballotsCompleted) {
		BallotsCompleted = ballotsCompleted;
	}
	public String getBallotsIncomplete() {
		return BallotsIncomplete;
	}
	public void setBallotsIncomplete(String ballotsIncomplete) {
		BallotsIncomplete = ballotsIncomplete;
	}
	public String getAccuracy() {
		return Accuracy;
	}
	public void setAccuracy(String accuracy) {
		Accuracy = accuracy;
	}
	public String getTimeToComplete() {
		return timeToComplete;
	}
	public void setTimeToComplete(String timeToComplete) {
		this.timeToComplete = timeToComplete;
	}
	@Override
	public String toString() {
		return "bean [DisabilityCatagory=" + DisabilityCatagory + ", participants=" + participants
				+ ", BallotsCompleted=" + BallotsCompleted + ", BallotsIncomplete=" + BallotsIncomplete + ", Accuracy="
				+ Accuracy + ", timeToComplete=" + timeToComplete + "]";
	}
	public bean(String disabilityCatagory, String participants, String ballotsCompleted, String ballotsIncomplete,
			String accuracy, String timeToComplete) {
		super();
		DisabilityCatagory = disabilityCatagory;
		this.participants = participants;
		BallotsCompleted = ballotsCompleted;
		BallotsIncomplete = ballotsIncomplete;
		Accuracy = accuracy;
		this.timeToComplete = timeToComplete;
	}
	public bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
