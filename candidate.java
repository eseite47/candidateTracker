/*
This class manages candidates and their properties
*/

class Candidate
{
	//initalize variables
	String firstName;
	String lastName;
	String fullName;
	int searchIndex;

  // creating the stages within the search the candidates can be at
	String[] stageList = {"Resume Review", "Hiring Manager review", "Phone Screen", "OnSite Interview", "Refeference Check", "Offer"};

	//create new candidate
	public Candidate(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
		searchIndex = 0;	
	}

	public String getName()
	{
		return fullName;
	}
	
// ------------------------------  Managing Candidate Stages
	
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
	}
	
	public void moveToPreviousStage()
	{
		searchIndex--;
		System.out.println(fullName + " is currently in stage " + stageList[searchIndex]);
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
		search.archiveCandidate(this);
	}
	
// ------------------------------ Email Prediction
	
	// provide email template to send out to candidate based on current stage
	public void scheduleInterview()
	{
		System.out.println("hi " + firstName +",");
		switch(searchIndex){
		case 0:
			System.out.println("We've got your application and are in the process of reviewing it. We will reach out to you should we be interested in pursuing your application.");
			break;
		case 1:
			System.out.println("We've got your application and are in the process of reviewing it. We will reach out to you should we be interested in pursuing your application.");
			break;
		case 2:
			System.out.println("We are impressed by your resume and would like to schedule a phone interview with one of our engineer. Could you provide me with your availabilities?");
			break;
		case 3:
			System.out.println("As we remain impressed by your skills and experiences, we would like to invite you for an onsite interview. When would you be available to come meet us?");
			break;
		case 4:
			System.out.println("Thank you for coming to meet us. Everyone really enjoyed meeting you and we would like additional information at this time. Could you provide us with the contact information of three professional reference?");
			break;
		default:
			System.out.println("Error: No interviews to schedule.");
			break;
		}
	}
	
	public void missedInterview()
	{
		System.out.println("hi " + firstName +",");
		System.out.println("We would like to reschedule your interview. When would you be able to connect with our engineer to chat?");
	}
	
	public void sendOffer()
	{
		System.out.println("hi " + firstName +",");
		System.out.println("Congratulations! We have decided to offer you a role at our company. Please find attached your official offer letter.");

	}

	public void keepWarm()
	{
		System.out.println("hi " + firstName +",");
		System.out.println("We are in the process of reviewing your candidacy and do not have an update at this time");
	}
}
