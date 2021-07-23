package wordGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("subbu");
		al.add("cat");
		al.add("rat");
		al.add("bat");
		al.add("tiger");
		al.add("lion");
		al.add("sunny");
		al.add("rahul");
		al.add("bharadwaj");
		al.add("nani");
		al.add("bobby");
		al.add("tv");
		al.add("remote");
		al.add("mobile");
		al.add("ac");
		al.add("filter");
		al.add("sharat");
		al.add("java");
		al.add("c");
		al.add("ram");
		al.add("inheritance");
		al.add("python");
		al.add("oscar");
		al.add("bro");
		al.add("rsk");
		al.add("book");
		al.add("File");
		al.add("acc");
		al.add("pig");
		Collections.shuffle(al);
		System.out.println(al.get(0));
		String word = (String) al.get(0);
		word = word.toUpperCase();
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			sum += (int) word.charAt(i) - 64;
		}
		System.out.print("enter your answer:");
		Scanner scan = new Scanner(System.in);
		int answer = scan.nextInt();
		scan.close();
		if (answer == sum)
			System.out.println("u won");
		else
			System.out.println("u lose");
	}
}
