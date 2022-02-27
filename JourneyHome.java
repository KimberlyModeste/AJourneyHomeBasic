package edu.cuny.csi.csc330.project;

import java.util.Scanner;

public class JourneyHome {
	

	public static void charText(String sen, long time)
	{
		long pause = time*3;
		for (int i = 0; i <sen.length(); i++)
		{
			System.out.print(sen.charAt(i));
			if(sen.charAt(i) == '.' || sen.charAt(i) == ',' || sen.charAt(i) == '?' || sen.charAt(i) == '!')
			{
				try {
					Thread.sleep(pause);
				} catch (InterruptedException e){
					//Should not happen
				}
			}

			else{
				try {
					Thread.sleep(time);
				} catch (InterruptedException e){
					//Should not happen
				}
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		 Player user= Player.getInstance();
		 Monsters monster;
		 String userName, input;
		 Event event;
		 
		Scanner userInput = new Scanner(System.in);
		
		charText("You wake up to find yourself in an unfamiliar place. Where are you? WHO are you? \nWhat is your name?", 100);
		System.out.println("");
		userName = userInput.nextLine();
		
		user.setPlayerName(userName);
		System.out.println("");

		charText(user.getPlayerName()+". Your name is "+ user.getPlayerName()+". Remembering, you sigh a breath of relief, "
		+ "but you still don't\nknow where you are. Find your way home.", 100);
		System.out.print(" [Press Enter to Continue]");
		System.out.println("");
		
		 do {
			input = userInput.nextLine();
			if (input.isEmpty()) 
			{
				event = new Event();	
				if (event.isAmbushed())
				{
					monster = event.getMonster();
					event.setAmbushed(false);
					new Combat(monster);
				}
				
			}


			else 
			{
				if (input.charAt(0) == 'S' || input.charAt(0) == 's')
				{
						user.displayAllStats();
						System.out.println("");
						Thread.sleep(500);
				}
			}
			 
		 }while (true);
		
	
	}

}



