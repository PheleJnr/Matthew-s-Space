import java.util.Scanner; 
public class Nokia3310 {   

	 public static void main(String... args){

		Scanner inputCollector = new Scanner(System.in);

		String mainMenu = """
Welcome to Nokia 

Press 1 for Phone book
Press 2 for Messages
Press 3 for chat
Press 4 for Call register
Press 5 for Tones
Press 6 for Settings
Press 7 for Call divert
Press 8 for Games
Press 9 for Calculator
Press 10 for Reminders
Press 11 for Clock
Press 12 for Profiles
Press 13 for SIM services
Press 14 for Exit


""";
		while(true) {
		System.out.println(mainMenu);

			System.out.print("Enter number between 1 to 13 or 14 to Exit: ");
			int mainMenuChoice = inputCollector.nextInt();

		switch(mainMenuChoice){
		case 1 : System.out.println("Phone book");
			String phonebookMenu = """

Press 1 for Search
Press 2 for Service Nos
Press 3 for Add Name
Press 4 for Erase
Press 5 for Edit
Press 6 for Assign tone
Press 7 for Send b'card
Press 8 for Options
Press 9 for Speed dials
Press 10 for Voice tags
Press 0 for Back to mainMenu

""";
		while(true) {
		System.out.println(phonebookMenu);

			System.out.print("Enter number between 1 to 10 or 0 to go back: ");
			int phonebookMenuChoice = inputCollector.nextInt();
			
		if (phonebookMenuChoice == 0){
break;
}
					
					switch(phonebookMenuChoice) {
							case 1 : System.out.println("Search"); break;
							case 2 : System.out.println("Service Nos"); break;
							case 3 : System.out.println("Add Name"); break;
							case 4 : System.out.println("Erase"); break;
							case 5 : System.out.println("Edit"); break;
							case 6 : System.out.println("Assign tone"); break;
							case 7 : System.out.println("Send b'card"); break;

							case 8 : System.out.println("options");
								 String optionsMenu = """

press 1 for Type of view
press 2 for Memory Status

""";

							System.out.println(optionsMenu);break;

							case 9 : System.out.println("Speed dials"); break;
							case 10 : System.out.println("Voice tag"); break;
							default : System.out.println("Invalid choice");


}
													
}
break;
							


		case 2 : System.out.println("Messages");
			 String messagesMenu = """

press 1 for Write messages
press 2 for Inbox
press 3 for Outbox
press 4 for Picture messages
press 5 for Templates
press 6 for Smileys
press 7 for Message settings
press 8 for Info settings
press 9 for Voice mailbox number
press 10 for Service command editor
Press 0 for Back to MainMenu

""";
		while (true) {
		System.out.println(messagesMenu);

			System.out.print("Enter Number from 1 to 10 or 0 to go back: ");
			int messagesMenuChoice = inputCollector.nextInt();
		
			if (messagesMenuChoice == 0)break;


					
					switch(messagesMenuChoice) {
						case 1 : System.out.println("Write Message"); break;		
						case 2 : System.out.println("Inbox"); break;
						case 3 : System.out.println("Outbox"); break;
						case 4 : System.out.println("Picture messages"); break;
						case 5 : System.out.println("Templates"); break;
						case 6 : System.out.println("Smileys"); break;

						case 7 : System.out.println("Messages settings");
								 String messagessettingsMenu = """
press 1 for Set
press 2 for Common
Press 0 for Back to messageMenu

""";

					while (true) {
					System.out.println(messagessettingsMenu);	
		
							System.out.print("Enter Number from 1 to 2 or 0 to go back: ");
							int messagessettingsMenuChoice = inputCollector.nextInt();

							if(messagessettingsMenuChoice == 0)break;

										switch(messagessettingsMenuChoice) {
											case 1: System.out.println("Set");
											String setMenu = """
Press 1 for Message centre number
Press 2 for Message sent as 
Press 3 for Message validity
Press 0 for Back to messagessettingsMenu

""";
											while (true) {
											System.out.println(setMenu);
											
											System.out.print("Enter Number from 1 to 3 or 0 to go back: ");
											int setMenuChoice = inputCollector.nextInt();	

											if (setMenuChoice == 0)break;

													switch(setMenuChoice) {
													case 1 : System.out.println("Message centre number");break;
													case 2 : System.out.println("Message sent as");break;
													case 3 : System.out.println("Message validity");break;
											}
											}
break;
																			
											
											case 2: System.out.println("Common");
											String commonMenu = """
Press 1 for Delivery report
Press 2 for Reply via same centre
Press 3 for Character support
Press 0 for Back to messagessettingsMenu

""";
											while (true) {
											System.out.println(commonMenu);

											System.out.print("Enter Number from 1 to 3 or 0 to go back: ");
											int commonMenuChoice = inputCollector.nextInt();
											
											if (commonMenuChoice == 0)break;


													switch(commonMenuChoice){
													case 1 : System.out.println("Delivery report");break;
													case 2 : System.out.println("Reply via same centre");break;
													case 3 : System.out.println("Character support");break;
											

												}
												}
break;
}
}
											
																					
						case 8 : System.out.println("Info services"); break;
						case 9 : System.out.println("Voice mailbox number"); break;
						case 10 : System.out.println("Service command editor"); break;

						

}		

}
break;	

		case 3 : System.out.println("Chat"); break;

		case 4 : System.out.println("Call register");
			 String callregisterMenu = """

Press 1 for Missed calls 
Press 2 for Recieved calls
Press 3 for Dialled calls
Press 4 for Erase recent calls 
Press 5 for Show call duration
Press 6 for Show call costs
Press 7 for Call cost settings
Press 8 for Prepaid credit
Press 0 for Back to mainMenu

""";

		while (true) {
		System.out.println(callregisterMenu);

			System.out.print("Enter Number from 1 to 8 or Press 0 to go back: ");
			int callregisterMenuChoice = inputCollector.nextInt();

			if (callregisterMenuChoice == 0)break;
	

					switch(callregisterMenuChoice) {
						case 1 : System.out.println("Missed calls"); break;
						case 2 : System.out.println("Recieved calls"); break;
						case 3 : System.out.println("Dialled numbers"); break;
						case 4 : System.out.println("Erase recent call list"); break;

						case 5 : System.out.println("Show call duration"); 
								String showcalldurationMenu = """
Press 1 for Last call duration
Press 2 for All calls' duration 
Press 3 for Recieved calls' duration
Press 4 for Dialled calls' duration
Press 5 for Clear counters

""";				
				
				System.out.println(showcalldurationMenu);break;

						case 6 : System.out.println("Show call costs"); 
								String showcallcostsMenu = """
Press 1 for Last call cost
Press 2 for All calls' cost
Press 1 Clear counters

""";	

							System.out.println(showcallcostsMenu);break;

						case 7 : System.out.println("Call cost settings"); 
								String callcostsettingsMenu = """

press 1 for Call cost limit
press 2 for Show cost in

""";

							System.out.println(callcostsettingsMenu);break;

						case 8 : System.out.println("Prepaid credit"); break;
						
}
}

break;

		case 5 : System.out.println("Tones");
			 String tonesMenu = """

Press 1 for Ringing tone
Press 2 for Ringing volume
Press 3 for Incoming call alert
Press 4 for Composer
Press 5 for Messages alert tone
Press 6 for Keypad tones
Press 7 for Warning and games tones
Press 8 for Vibrating alert
Press 9 for Screen saver
Press 0 for Back to mainMenu

""";
		while (true) {
		System.out.println(tonesMenu);
		
			System.out.print("Enter Number from 1 to 9 or 0 to go back: ");
			int tonesMenuChoice = inputCollector.nextInt();
			
			if(tonesMenuChoice == 0)break;

					switch(tonesMenuChoice) {
						case 1 : System.out.println("Ringing tone");break;
						case 2 : System.out.println("Ringing Volume");break;
						case 3 : System.out.println("Incoming call alert");break;
						case 4 : System.out.println("Composer");break;
						case 5 : System.out.println("Messages alert tone");break;
						case 6 : System.out.println("Keypad tones");break;
						case 7 : System.out.println("Warning and games tones");break;
						case 8 : System.out.println("Vibrating alert");break;
						case 9 : System.out.println("Screen saver");break;
}
					
}		
break;
	

		case 6 : System.out.println("Settings");
			 String settingsMenu = """

Press 1 for Call settings
Press 2 for Phone settings
Press 3 for Security settings
Press 4 for Restore factory settings 
Press 0 for Back to mainMenu

""";
		while (true) {
		System.out.println(settingsMenu);

					System.out.print("Enter Number from 1 to 4 or 0 to go back: ");
					int settingsMenuChoice = inputCollector.nextInt();

					if (settingsMenuChoice == 0)break;

					switch(settingsMenuChoice) {
						case 1 : System.out.println("Call settings");
								String callsettingsMenu = """

Press 1 for Automatic redial
Press 2 for Speed dialing	
Press 3 for Call waiting options	
Press 4 for Own number sending	
Press 5 for Phone line in use 	
Press 6 for Automatic answer	

""";	
										
							System.out.println(callsettingsMenu); break;


						case 2 : System.out.println("Phone settings");
								String phonesettingsMenu = """

Press 1 for Language
Press 2 for Cell info display
Press 3 for Welcome note
Press 4 for Network selection
Press 5 for Lights
Press 6 for Confirm SIM service actions

""";

							System.out.println(phonesettingsMenu); break;

						case 3 : System.out.println("Security settings");
								String securitysettingsMenu = """

Press 1 for PIN code request		
Press 2 for Call barring service
Press 3 for Fixed dialling
Press 4 for Closed user group
Press 5 for Phone security
Press 6 for Change access codes 

""";

							System.out.println(securitysettingsMenu); break;
						
						case 4 : System.out.println("Restore factory settings"); break;


}

}						
break;

		case 7 : System.out.println("Call divert"); break;
		case 8 : System.out.println("Games"); break;
		case 9 : System.out.println("Calculator"); break;
		case 10 : System.out.println("Reminders"); break;
		
		case 11 : System.out.println("Clock");
		
			  String clockMenu = """

Press 1 for Alarm clock
Press 2 for Clock settings
Press 3 for Date settings 
Press 4 for Stopwatch
press 5 for Countdown timer
Press 6 Auto update of date and time

""";
		
		System.out.println(clockMenu); break;
		
		
		

			
		case 12 : System.out.println("Profiles"); break;
		case 13 : System.out.println("SIM services"); break;
		case 14 : System.out.println("Exit"); 
		return;
		default : System.out.println("Invalid choice");
}

}

}

}