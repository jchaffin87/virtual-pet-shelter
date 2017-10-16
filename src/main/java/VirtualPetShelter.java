import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> shelter = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> pets() {
		return shelter.values();
	}

	// Individual Interactions
	public VirtualPet getPet(String name) {
		return shelter.get(name);
	}

	public void takePetIn(VirtualPet pet) {
		shelter.put(pet.getName(), pet);
	}

	public void adoptPetOut(String name) {
		shelter.remove(name);
	}

	public void playWithPet(String name) {
		VirtualPet selectedPet = shelter.get(name);
		selectedPet.play();
	}

	// Group interactions
	public void feedPets() {
		for (VirtualPet pet : pets()) {
			pet.feed();
		}
	}

	public void giveWaterToPets() {
		for (VirtualPet pet : pets()) {
			pet.giveWater();
		}
	}

	// Tick Method
	public void groupTick() {
		for (VirtualPet pet : pets()) {
			pet.tick();
		}
	}

	// Size Getter for testing purposes
	public int getSize() {
		return shelter.size();
	}

}
