import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		VirtualPetShelter myShelter = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Freddy", "cat", 5, 5, 5);
		VirtualPet pet2 = new VirtualPet("Jason", "gerbil", 5, 5, 5);
		VirtualPet pet3 = new VirtualPet("Michael", "velociraptor", 5, 5, 5);
		
		myShelter.takePetIn(pet1);
		myShelter.takePetIn(pet2);
		myShelter.takePetIn(pet3);

		Boolean introFinished = false;
		Boolean gameActive = false;

		//Intro
		System.out.println("-Hello, new remote employee! Welcome to your first day working for WeCanShelterIt!");
		System.out.println(
				"-We house pets of all sorts here at WeCanShelterIt and one would think that would make your new job with us quite difficult, no?");
		System.out.println(
				"-Luckily for you, the cornucopia-esque nature of our little managerie here will be mostly irrelevant to you in the performance of your duties.");
		System.out.println("-You see, all the 'grunt work' of the job is done by our little army of on-site bots.");
		System.out.println(
				"-And don't worry, the bots are quite capable of executing their tasks with (virtual) skill and efficiency.");
		System.out.println(
				"-The bots, however, happen not to be the best decision makers, and that's where you come in.");
		System.out.println(
				"-You need simply to follow the propmts that follow and choose the correct options to send the bots about their tasks.");
		System.out.println("-Pretty easy, huh? Kind of makes us wonder why we're paying you so much...");
		System.out.println(
				"-But, that's besides the point. When you're ready to get to work, just press 'Y' and you can get about doing"
						+ "\nyour work, which definitely won't soon be taken over by an AI leading to your inevitable lay-off just months before you would be eligable for retirement. ");//All of our eventual fates.
		System.out.println("-Ready? Press 'Y'.");
		
		String playerIntroChoice = input.next();
		
		//Game Start loop
		while (introFinished = false) {
			if (playerIntroChoice.toUpperCase().equals("Y")) {
				System.out.println("And away we go!");//Jackie Gleason reference.
				gameActive = true;
				input.next();
			} else {
				System.out
						.println("No, press 'Y'. It's right there between the 'T' and the 'U'. Above the 'H'. Got it?");//Management
				playerIntroChoice = input.next();
			}
			introFinished = true;

		}
		
		System.out.println("We currently shelter " + myShelter.getSize() + " pets in this facility");
		while(gameActive){
			
			
			
		}
	}
	

}


