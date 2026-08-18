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

""";

		System.out.println(mainMenu);
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

""";
		System.out.println(phonebookMenu);
			int phonebookMenuChoice = inputCollector.nextInt();

					
					switch(phonebookMenuChoice){
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
							default: System.out.println("Input Number between 1 - 2"); break;

							case 9 : System.out.println("Speed dials"); break;
							case 10 : System.out.println("Voice tag"); break;
														
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

""";

		System.out.println(messagesMenu);
			int messagesMenuChoice = inputCollector.nextInt();

					
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

""";
					System.out.println(messagessettingsMenu);	
		
							int messagessettingsMenuChoice = inputCollector.nextInt();

										switch(messagessettingsMenuChoice) {
											case 1: System.out.println("Set");
											String setMenuChoice = """
Press 1 for Message centre number
Press 2 for Message sent as 
Press 3 for Message validity

""";
										
											System.out.println(setMenuChoice);break;
											
											case 2: System.out.println("Common");
											String commonMenuChoice = """
Press 1 for Delivery Report
Press 2 for Reply via same centre
Press 3 for Character support

""";

											System.out.println(commonMenuChoice);break;												
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

""";
		System.out.println(callregisterMenu);
			int callregisterMenuChoice = inputCollector.nextInt();

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

""";

				System.out.println(tonesMenu);
				
break;
	

		case 6 : System.out.println("Settings");
			 String settingsMenu = """

Press 1 for Call settings
Press 2 for Phone settings
Press 3 for Security settings
Press 4 for Restore factory settings 

""";	
				System.out.println(settingsMenu);
					int settingsMenuChoice = inputCollector.nextInt();

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

							System.out.println(securitysettingsMenu);
						
						case 4 : System.out.println("Restore factory settings"); break;
						default: System.out.println("Input Number between 1 - 4");
}

break;


		case 11 : System.out.println("Clock");
		
			  String clockMenu = """

Press 1 for Alarm clock
Press 2 for Clock settings
Press 3 for Date settings 
Press 4 for Stopwatch
press 5 for Countdown timer
Press 6 Auto update of date and time

""";

				System.out.println(clockMenu); 

		default: System.out.println("Input Number between 1 - 13"); break;


}

}

}