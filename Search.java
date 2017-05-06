/*
This class manages searches and list of candidates active within those searches
*/

import java.util.ArrayList;
import java.util.List;

class Search
{
	//instance variable for Search Objects
	String searchName = "";
	String hiringManager ="";
	int urgency =0;
	ArrayList<Candidate> candidateList;

  //Search Object Constructor
	public Search (String hiringManager, String searchName, int urgency)
	{
		this.hiringManager = hiringManager;
		this.searchName = searchName;
		this.urgency= urgency;
		this.candidateList = new ArrayList<Candidate>();

	}

  //add candidates to the search
	public void addCandidate(Candidate person)
	{	
		candidateList.add(person);
	}
	
  //remove candidates from the search
	public void removeCandidate(Candidate person)
	{
		candidateList.remove(person);
	}
	
  //print candidate tracker for this search
	public void getTracker()
	{
		System.out.println("Here are the candidates for the " + searchName + " search:");
		for(int i = 0; i < candidateList.size(); i++)
		{
			System.out.println("- " + candidateList.get(i).getName() + ", " + candidateList.get(i).getStage());
		}
	}
	
}
