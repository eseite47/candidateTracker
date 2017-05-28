/*
This class manages candidates and their properties
*/

import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;

class Candidate
{
	//initalize variables
	String firstName;
	String lastName;
	String fullName;
	int searchIndex;
	LocalDate created;
	LocalDate lastActive;
	LocalDate nextInterview;
	LocalTime interviewTime;


  	// creating the stages within the search the candidates can be at
	String[] stageList = {"Resume Review", "Hiring Manager review", "Phone Screen", "OnSite Interview", "Refeference Check", "Offer"};

	//create new candidate
	public Candidate(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
		searchIndex = 0;
		lastActive = localDate.now();
		nextInterview = null;
		interviewTime = null;
	}

	public String getName()
	{
		return fullName;
	}
	
// ------------ Managing Candidate Stages
	
	public void getStageList()
	{
		for (int i = 0; i<stageList.length; i++)
		{
			System.out.println(i + ": " + stageList[i]);
		}
	}
	
	public void moveToNextStage()
	{
		searchIndex++;
		System.out.println(fullName + " is currently in stage " + stageList[searchIndex]);
		lastActive = localDate.now();
	}
	
	public void moveToPreviousStage()
	{
		searchIndex--;
		System.out.println(fullName + " is currently in stage " + stageList[searchIndex]);
		lastActive = localDate.now();
	}
	
	//return status as a string, to be used for other methods
	public String getStage()
	{
		 return stageList[searchIndex];
	}
	
	//prints out the the current stage as a sentence
	public void getCurrentStage()
	{
	  	System.out.println(fullName + " is currently in stage " + stageList[searchIndex]);
	}

	public void reject(Search search)
	{
		System.out.println("hi " + firstName +",");
		System.out.println("After much consideration, we have decided there was not a strong match between your skills and our needs at this time. Let's stay in touch!");
		lastActive = localDate.now();
		search.archiveCandidate(this);
	}
	
//------------------------------ Shedule and Manage Interviews
	
	public void scheduleInterview(int year, int month, int day, int hour, int minute)
	{
		nextInterview = LocalDate.of(year, month, day);
		interviewTime = LocalTime.of(hour, minute);
		System.out.print(fullname + "'s " +stageList[searchIndex] + " interview is scheduled for"+ nextInterview +" at " + interviewTime);
	}

	public void getSchedule()
	{
		System.out.print(fullname + "'s " +stageList[searchIndex] + " interview is scheduled for"+ nextInterview +" at " + interviewTime);
	}
}
	
// ------------------------------ Email Prediction
	
	public String email(String command)
	{
		lastActive = localDate.now();
		String key="";

		if (command.equals "schedule")
		{
			key = "schedule " + stageList[searchIndex];
			key.toLowerCase();
		}
		else 
		{
			key = command.toLowerCase();
		}
		
		return Template.email.get(key);

	}	
}
