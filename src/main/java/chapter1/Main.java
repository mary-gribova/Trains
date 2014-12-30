package chapter1;

//	DONE
//	1.4 Write a method to decide if two strings are anagrams or not.

//	DONE
//	1.5	 Write a method to replace all spaces in a string with ‘%20’.

//	NOT DONE YET ((( ASK KIRUSHA
//	1.8	 Assume you have a method isSubstring which checks if one word is a substring of
//	another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
//	only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).

public class Main {
	public static void main(String[] args) {
//		checkUniqueChars();
//		checkUniqueCharsWithoutAdditionalStructure();
//		checkIsAnagrams();
		checkReplaceSpaces();
	}


	private static void checkReplaceSpaces() {
		System.out.println(StringTool.replaceSpaces("a a ffff v   ppp"));
		System.out.println(StringTool.replaceSpaces("     a   ppp"));
	}

	private static void checkIsAnagrams() {
		System.out.println("abcd and dcba: " + StringTool.isAnagrams("abcd", "dcba"));
		System.out.println("abvg and eklm: " + StringTool.isAnagrams("abvg", "eklm"));
		System.out.println("kkk and kkk: " + StringTool.isAnagrams("kkk", "kkk"));
		System.out.println("rosa and asor: " + StringTool.isAnagrams("rosa", "asor"));
		System.out.println("abcd1 and dcba1: " + StringTool.isAnagrams("abcd1", "dcba1"));
	}


	private static void checkUniqueChars() {
		System.out.println("somestring:  " + StringTool.haveAllUniqueChars("somestring"));
		System.out.println("blabla:  " + StringTool.haveAllUniqueChars("blabla"));
		System.out.println("abcd:  " + StringTool.haveAllUniqueChars("abcd"));
		System.out.println("maru:  " + StringTool.haveAllUniqueChars("maru"));
	}

	private static void checkUniqueCharsWithoutAdditionalStructure() {
		System.out.println("somestring:  " + StringTool.haveAllUniqueCharsWithoutAddStructures("somestring"));
		System.out.println("blabla:  " + StringTool.haveAllUniqueCharsWithoutAddStructures("blabla"));
		System.out.println("abcd:  " + StringTool.haveAllUniqueCharsWithoutAddStructures("abcd"));
		System.out.println("maru:  " + StringTool.haveAllUniqueCharsWithoutAddStructures("maru"));
	}
}
