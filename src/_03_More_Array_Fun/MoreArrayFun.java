package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	static MoreArrayFun t=new MoreArrayFun();
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		t.arrayString();
		t.arrayStringReverse();
		t.arrayStringSkip();
		t.arrayStringRandom();
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	public void arrayString() {
		String[] s = { "t", "o", "p" };
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
		System.out.println();
	}
	
	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public void arrayStringReverse() {
		String[] array= {"y", "p", "q"};
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i]);
		}
		System.out.println();
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public void arrayStringSkip() {
	
		String[] arr= {"q","e","t"};
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				System.out.print(arr[i]);
				
			}
		}
		System.out.println();
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public void arrayStringRandom() {
		String[] r= {"w","r","g"};
		Random ran=new Random();
		for (int i = 0; i < r.length; i++) {
			int n=ran.nextInt(3);
			System.out.print(r[n]);
		}
		System.out.println();
	}
	

}
