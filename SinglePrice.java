
public class SinglePrice implements Price {
	int basePrice = 70;
	@Override
	public void roomPrice() {
		System.out.println("This room costs $" + basePrice + " per night.");
		
	}

}
