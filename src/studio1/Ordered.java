package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
boolean compxya = (x < y);
boolean compyza = (z > y);
boolean ascend = compxya && compyza; 
boolean compxyd = (x > y);
boolean compyzd = (z < y);
boolean descend = compxyd && compyzd;
boolean isOrdered = ascend || descend;
System.out.print(isOrdered);

	}

}
