package classes.labs;

public class CookieJar {

	private int capacity, current;

	public CookieJar(int capacity) {
		this.capacity = capacity;
	}

	public void go() {
		System.out.println(isFull());
		addStuff(500);

		System.out.println(isFull());
		System.out.println(addStuff(2000));

		System.out.println(spaceLeft());
		System.out.println(isFull());

		System.out.println(addStuff(2000));

		System.out.println(spaceLeft());
		System.out.println(isFull());
	}

	public int addStuff(int items) {
		boolean surplus = items + current > capacity;

		if (surplus) {
			int surplusAmount = Math.abs(capacity - (items + current));
			current = capacity;

			return surplusAmount;
		} else {
			current += items;

			return 0;
		}
	}

	public boolean isFull() {
		return current >= capacity;
	}

	public int spaceLeft() {
		return capacity - current;
	}

}
