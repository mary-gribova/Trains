package chapter1;

import java.util.HashMap;
import java.util.Set;

public class StringTool {

	public static boolean haveAllUniqueChars(String str) {
		boolean result = true;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			Integer value = map.get(ch);
			if (value == null) {
				map.put(ch, 1);
			} else {
				map.put(ch, value + 1);
			}
		}

		Set<Character> keySet = map.keySet();
		for (char ch : keySet) {
			if (map.get(ch) != null && map.get(ch) > 1) {
				result = false;
				break;
			}
		}

		return result;
	}

	public static boolean haveAllUniqueCharsWithoutAddStructures(String str) {
		char[] characters = new char[str.length()];
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (containsChar(str.charAt(i), characters)) {
				return false;
			} else {
				characters[count] = str.charAt(i);
				count++;
			}
		}

		return true;
	}

	private static boolean containsChar(char ch, char[] arr) {
		for (char c : arr) {
			if (c == ch) {
				return true;
			}
		}

		return false;
	}

//	1.4 Write a method to decide if two strings are anagrams or not.

//	1.5	 Write a method to replace all spaces in a string with ‘%20’.

//	1.6	 Given an image represented by an NxN matrix, where each pixel in the image is 4
//	bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

//	1.7	 Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
//	column is set to 0.

//	1.8	 Assume you have a method isSubstring which checks if one word is a substring of
//	another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
//	only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).

}

