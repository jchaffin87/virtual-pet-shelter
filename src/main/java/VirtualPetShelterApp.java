import java.util.Scanner;

public class VirtualPetShelterApp {

	static Scanner input = new Scanner(System.in);
	static String playerResponse;

	public static void main(String[] args) {

		VirtualPetShelter myShelter = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Freddy", "cat", 5, 5, 5);
		VirtualPet pet2 = new VirtualPet("Jason", "gerbil", 5, 5, 5);
		VirtualPet pet3 = new VirtualPet("Michael", "velociraptor", 5, 5, 5);

		myShelter.takePetIn(pet1);
		myShelter.takePetIn(pet2);
		myShelter.takePetIn(pet3);

		Boolean gameActive = false;

		// Intro
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
		System.out.println(
				"-The bots will feed and water all the pets as a group, but you'll have to tell the bots which individual pet to play with if any of the pets get bored. (Yes, we have special play bots. No, you don't get to play with them.)");
		System.out.println(
				"-You'll also be expected to process new pets that the shelter brings in and adoptions when someone takes a pet out.");
		System.out.println("-Pretty easy, huh? Kind of makes us wonder why we're paying you so much...");
		System.out.println(
				"-But, that's besides the point. It's time to wrap this long-winded introduction up so you can get about doing"
						+ "\nyour work, which definitely won't soon be taken over by an AI leading to your inevitable lay-off just months before you would be eligable for retirement. ");// All
																																															// fates.
		gameActive = true;

		// Game loop
		while (gameActive) {

			System.out.println("We currently shelter " + myShelter.getSize() + " pets in this facility");
			System.out.println("Here are our currently sheltered pets: ");
			for (VirtualPet pet : myShelter.pets()) {
				System.out.println(pet.getName() + ": " + "\tDescription: " + pet.getDescription() + "\tHunger: "
						+ pet.getHunger() + "\tThirst: " + pet.getThirst() + "\tBoredom: " + pet.getBoredom());
			}

			for (VirtualPet pet : myShelter.pets()) {
				if (pet.checkHungry()) {
					System.out.println(pet.getName() + " is hungry.");
				}
				if (pet.checkThirsty()) {
					System.out.println(pet.getName() + " is thirsty.");
				}
				if (pet.checkBored()) {
					System.out.println(pet.getName() + " is bored.");
				}
			}

			System.out.println("Press 1 to have bots feed pets.");
			System.out.println("Press 2 to have bots give pets water.");
			System.out.println("Press 3 to have a bot play with a pet.");
			System.out.println("Press 4 to take a new pet in to the shelter.");
			System.out.println("Press 5 to adopt a pet out.");
			System.out.println("Press 6 to quit.");
			playerResponse = input.next();

			if (playerResponse.equals("1")) {
				for (VirtualPet pet : myShelter.pets()) {
					pet.feed();
				}
			} else if (playerResponse.equals("2")) {
				for (VirtualPet pet : myShelter.pets()) {
					pet.giveWater();
				}
			} else if (playerResponse.equals("3")) {
				System.out.println("Please enter the name of the pet you would like to play with.");
				String petToPlayWith = input.nextLine();
				System.out.println("You have selected " + petToPlayWith + ".");
				myShelter.playWithPet(petToPlayWith);
			} else if (playerResponse.equals("4")) {
				System.out.println("Please input new pet's name.");
				String newPetName = input.nextLine();
				System.out.println("Please input new pet's description.");
				String newPetDescription = input.nextLine();
				VirtualPet newPet = new VirtualPet(newPetName, newPetDescription);
				myShelter.takePetIn(newPet);
			} else if (playerResponse.equals("5")) {
				System.out.println("Please enter the name of the pet being adopted.");
				String petBeingAdopted = input.nextLine();
				myShelter.adoptPetOut(petBeingAdopted);
			} else if (playerResponse.equals("6")) {
				gameActive = false;
			} else {
				System.out.println("That is not a valid response.");
			}

			// Tick
			myShelter.groupTick();

		}
		input.close();
	}

}
