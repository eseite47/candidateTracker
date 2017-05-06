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
	
	//public [] getTemplate()
	//{

	//}

	public void getStageList()
	{
		for (int i = 0; i<stageList.length; i++)
		{
			System.out.println(i + ": " + stageList[i]);
		}
	}

	public String getStage()
	{
		 return stageList[searchIndex];
	}
	
	public void moveToNextStage()
	{
		searchIndex++;
	}
	
	public void getCurrentStage()
	{
	  System.out.println(fullName + " is currently in stage " + searchIndex);
	}
		
	
}
