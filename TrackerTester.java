class Tracker
{
	public static void main (String[] args)
	{
		Search networkEngineer = new Search ("Eddie", "Network Engineer", 1);
		//networkEngineer.getStageList();
		
		Candidate johnSmith = new Candidate ("John", "Smith");
		System.out.println(johnSmith.getName());
		johnSmith.getCurrentStage();
		johnSmith.moveToNextStage();
		System.out.println(johnSmith.getStage());
		
		Candidate napoleon = new Candidate ("Napoleon", "Bonaparte");
		networkEngineer.addCandidate(johnSmith);
		networkEngineer.addCandidate(napoleon);
	
		networkEngineer.getTracker();
	
	}
}
