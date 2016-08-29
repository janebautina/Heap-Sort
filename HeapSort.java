package HeapSort;

import java.util.Scanner;

public class HeapSort {

	public HeapSort() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of elements in the array: ");
		int n = sc.nextInt();
		Heap<Character> hp = new Heap<Character>(n);
		for (int i = 0; i < n ; i++) {
			System.out.println("Please enter " + i + " character: ");
			Character cha = sc.next().charAt(0);
			hp.insert(cha);
		}
		sc.close();
		System.out.println("Heap: ");
		for (int i = 1; i < n + 1; i++) {
			System.out.println(hp.getArray()[i]);
		}
		System.out.println("Result after sorting: ");
		Character[] result = new Character[n];
		for (int i = 0; i < n; i++) {
			result[i] = hp.deleteMax();
			System.out.println("Element " + i + " = " + result[i]);
		}
	}

	static public void main(String[] args) {
		new HeapSort();
	}
}
