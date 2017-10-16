
public class VirtualPet {

	private String name;
	private String description;
	private int hunger;
	private int thirst;
	private int boredom;

	// Constructors
	public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
	}

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;

	}

	// Setters
	public void setName(String nameChoice) {
		name = nameChoice;
	}

	public void setDescription(String descriptionChoice) {
		description = descriptionChoice;
	}

	// Getters
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	// Instance variable threshold checks
	public boolean checkHungry() {
		if (hunger >= 5) {
			return true;

		} else {
			return false;
		}
	}

	public boolean checkThirsty() {
		if (thirst >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkBored() {
		if (boredom >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkDead() {
		if (hunger > 20 || thirst > 20 || boredom > 20) {
			return true;
		} else {
			return false;
		}
	}

	// Activity Methods (effect instance variables)
	public void feed() {
		if (hunger >= 5) {
			hunger -= 5;
		} else {
			hunger = 0;
		}

	}

	public void giveWater() {
		if (thirst >= 5) {
			thirst -= 5;
		} else {
			thirst = 0;
		}
	}

	public void play() {
		if (boredom >= 5) {
			boredom -= 5;
		} else {
			boredom = 0;
		}
	}

	// Tick method
	public void tick() {
		hunger += 2;
		thirst += 2;
		boredom += 2;
	}

}
