import static org.junit.Assert.*;

import org.junit.Test;

public class VirtualPetShelterTests {
	
	@Test
	public void assertThatGetSizeMethodReturnsOneAfterPetAdded(){
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet testPet = new VirtualPet("bob", "dog");
		underTest.takePetIn(testPet);
		int check = underTest.getSize();
		assertEquals(1, check);
	}
	@Test
	public void assertThatGetSizeMethodReturnsOneAfterPetAdopted(){
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet testPet1 = new VirtualPet("bob", "dog");
		VirtualPet testPet2 = new VirtualPet("bill", "dog");
		underTest.takePetIn(testPet1);
		underTest.takePetIn(testPet2);
		underTest.adoptPetOut("bob");
		int check = underTest.getSize();
		assertEquals(1, check);
	}
	@Test
	public void assertThatPetBoredomReturnsZeroAfterPlay(){
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet testPet1 = new VirtualPet("bob", "dog", 5, 5, 5);
		underTest.takePetIn(testPet1);
		underTest.playWithPet("bob");
		int check = testPet1.getBoredom();
		assertEquals(0, check);
	}
	@Test
	public void assertThatPetsHungerReturnsZeroAfterFeeding(){
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet testPet1 = new VirtualPet("bob", "dog", 5, 5, 5);
		VirtualPet testPet2 = new VirtualPet("bill", "dog", 5, 5, 5);
		underTest.takePetIn(testPet1);
		underTest.takePetIn(testPet2);
		underTest.feedPets();
		int check1 = testPet1.getHunger();
		int check2 = testPet2.getHunger();
		assertEquals(0, check1);
		assertEquals(0, check2);
	}
	@Test
	public void assertThatPetsThirstReturnsZeroAfterFeeding(){
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet testPet1 = new VirtualPet("bob", "dog", 5, 5, 5);
		VirtualPet testPet2 = new VirtualPet("bill", "dog", 5, 5, 5);
		underTest.takePetIn(testPet1);
		underTest.takePetIn(testPet2);
		underTest.giveWaterToPets();
		int check1 = testPet1.getThirst();
		int check2 = testPet2.getThirst();
		assertEquals(0, check1);
		assertEquals(0, check2);
	}
	@Test
	public void assertThatAllPetsThirstHungerAndBoredomReturnTwoAfterTick(){
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet testPet1 = new VirtualPet("bob", "dog");
		VirtualPet testPet2 = new VirtualPet("bill", "dog");
		underTest.takePetIn(testPet1);
		underTest.takePetIn(testPet2);
		underTest.groupTick();
		int check1 = testPet1.getThirst();
		int check2 = testPet2.getThirst();
		int check3 = testPet1.getHunger();
		int check4 = testPet2.getHunger();
		int check5 = testPet1.getBoredom();
		int check6 = testPet2.getBoredom();
		assertEquals(2, check1);
		assertEquals(2, check2);
		assertEquals(2, check3);
		assertEquals(2, check4);
		assertEquals(2, check5);
		assertEquals(2, check6);
	}
}
