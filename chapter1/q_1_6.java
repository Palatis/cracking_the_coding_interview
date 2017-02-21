/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int repeated(String input, int offset) {
		char c = input.charAt(offset);
		int i = offset + 1;
		while (i < input.length() && c == input.charAt(i))
			++i;
		return i - offset;
	}

	static String rle(String input) {
		StringBuilder b = new StringBuilder();
		int offset = 0;
		while (offset < input.length()) {
			int repeats = repeated(input, offset);
			b.append(input.charAt(offset));
			b.append(repeats);
			offset += repeats;

			if (b.length() >= input.length())
				return input;
		}
		return b.toString();
	}

	static void test(String blah) {
		System.out.print(blah);
		System.out.print(": ");
		System.out.println(rle(blah));
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		test("aabcccccaaa");
		test("abcdefg");
		test("aabbccdd");
	}
}