package cat.species;

import cat.BigCat;

public class Lynx extends BigCat {
	public static void main(String[] args) {
		BigCat cat = new BigCat();
		// Lynx cat = new Lynx(); // hasFur would have been accessible
		System.out.println(cat.name);
		System.out.println(cat.hasFur);
		System.out.println(cat.hasPaws);
		System.out.println(cat.id);
	}
}
