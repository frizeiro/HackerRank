import java.io.*;
import java.util.*;


public class Solution {

	// Write your code here.

	private ArrayList<Character> str2pop = new ArrayList<>();
	private ArrayList<Character> str2dequeue = new ArrayList<>();

	private void pushCharacter(char s) {
		str2pop.add(s);
	}

	private void enqueueCharacter(char s) {
		str2dequeue.add(s);
	}

	private Character popCharacter() {
		char pop = str2pop.get(0);
		str2pop.remove(0);
		return pop;
	}

	private Character dequeueCharacter() {
		char pop = str2dequeue.get(str2dequeue.size() - 1);
		str2dequeue.remove(str2dequeue.size() - 1);
		return pop;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Solution p = new Solution();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		//Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is "
				+ ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}

}