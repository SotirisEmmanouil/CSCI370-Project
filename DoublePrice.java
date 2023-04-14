
public class DoublePrice implements Price {

	@Override
	public void roomPrice() {
		SinglePrice price = new SinglePrice();
		System.out.println("This room costs $" + price.basePrice *2 + " per night.");
	}

}
