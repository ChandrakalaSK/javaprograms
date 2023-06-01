package in.ineuron.comp;

import java.util.Date;

//targeted class
public class WishMessagegenerator {
	
	//Dependent class
	private Date date;
	
	static
	{
		System.out.println("WishMessagegenerator is file is loading");
	}
	public WishMessagegenerator() {
		System.out.println("WishMessagegenerator object is instantiated");
		}
	
	
	public void setDate(Date date) {
		System.out.println("Setter method is called to perform setter injection");
		this.date = date;
	}
	//Business logic method
	public String generateMessage(String userName)
	{
		int hour = date.getHours();
		if(hour < 12)
		{
			return "Good Morning::" +userName;
		}
		else if(hour < 16)
		{
			return "Good Afternoon::" +userName;
		}
		else if (hour < 20)
		{
			return "Good Evening::" +userName;
		}
		else
		{
			return "Good Night::"+userName;
		}
	}


	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}

}
