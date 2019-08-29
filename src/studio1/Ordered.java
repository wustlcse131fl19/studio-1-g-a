package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		boolean isOrdered;

		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");

		isOrdered=(x<y&&y<z)||(x>y&&y>z);
		System.out.println(isOrdered);
	}

}
