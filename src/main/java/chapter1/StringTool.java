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
	public static boolean isAnagrams(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		int len = str1.length();
		for (int i = 0, j = len - 1; i < len && j > 0; i++, j--) {
			if (str1.charAt(i) != str2.charAt(j)) {
				return false;
			}
		}

		return true;
	}

	//1.5	 Write a method to replace all spaces in a string with ‘%20’.
	public static String replaceSpaces(String str) {
		StringBuilder res = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (ch == ' ') {
				res.append("%20");
			} else {
				res.append(ch);
			}
		}

		return res.toString();
	}

	//
	//	1.8	 Assume you have a method isSubstring which checks if one word is a substring of
	//	another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
	//	only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
	public static boolean isRotation(String s1, String s2) {


		return true;
	}
}

