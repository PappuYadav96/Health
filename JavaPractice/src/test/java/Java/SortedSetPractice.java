package Java;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		SortedSet<String> Set = new TreeSet<>();
		Set.add("infosys");
		Set.add("IBM");
		Set.add("wipro");
		Set.add("google");
		Set.add("microsoft");
		Set.add("Cognizent");
		System.out.println(Set);
		for(String str : Set) {
		System.out.println(str);
		}
		System.out.println();
		System.out.println(Set.first());
		System.out.println(Set.last());
		System.out.println(Set.headSet("infosys"));
		System.out.println(Set.tailSet("google"));
	}

}