package chapter1;

public class Main {
	public static void main(String[] args) {
//		System.out.println("somestring:  " + UniqueCharTool.haveAllUniqueChars("somestring"));
//		System.out.println("blabla:  " + UniqueCharTool.haveAllUniqueChars("blabla"));
//		System.out.println("abcd:  " + UniqueCharTool.haveAllUniqueChars("abcd"));
//		System.out.println("maru:  " + UniqueCharTool.haveAllUniqueChars("maru"));

		System.out.println("somestring:  " + StringTool.haveAllUniqueCharsWithoutAddStructures("somestring"));
		System.out.println("blabla:  " + StringTool.haveAllUniqueCharsWithoutAddStructures("blabla"));
		System.out.println("abcd:  " + StringTool.haveAllUniqueCharsWithoutAddStructures("abcd"));
		System.out.println("maru:  " + StringTool.haveAllUniqueCharsWithoutAddStructures("maru"));
	}
}
