/*
  this is meant to be a hashmap containing email templates, to be pulled as needed by the Candidate class.
*/

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

class Template
{
	/* int templateIndex;
	String templateName;
	String templateEmail;
	
	Construtor
	public Template(int index, String name, String email)
	{
		this.templateName = name;
		this.templateEmail = email;
		this.templateIndex = index;
	}
	*/
	
	Map <String,String> emails = new HashMap<String,String>();
	
	emails.put("before Interviews", "We've got your application and are in the process of reviewing it. We will reach out to you should we be interested in pursuing your application.");

	email.put("schedule phone screen", "We are impressed by your resume and would like to schedule a phone interview with one of our engineer. Could you provide me with your availabilities?");

	email.put("schedule onSite interview", "As we remain impressed by your skills and experiences, we would like to invite you for an onsite interview. When would you be available to come meet us?");

	email.put("schedule refeference check", "Thank you for coming to meet us. Everyone really enjoyed meeting you and we would like additional information at this time. Could you provide us with the contact information of three professional reference?");

	email.put("missed interview", "We would like to reschedule your interview. When would you be able to connect with our engineer to chat?");

	email.put("offer", "Congratulations! We have decided to offer you a role at our company. Please find attached your official offer letter.");

	email.put.("keep warm", "We are in the process of reviewing your candidacy and do not have an update at this time");
	

}
