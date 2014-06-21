package tariqul.java.exercise;

import java.util.Arrays;

public class Utilities {

	//---------------------------------------
	// reverse of a string
	//---------------------------------------
	/*
	 * Java String is immutable. So it is not possible to change/reverse the string without using extra variable/space
	 */
	// return reverse of a string ( using StringBuffer )
	public static String reverseString(String str){
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.reverse();
		return sb.toString();
	}
	// return reverse of a string ( using a char array and a temporary char variable )
	public static String reverseString2(String str){
		char[] arr = str.toCharArray();
		int mid = arr.length/2+1;
		char tmp;
		for(int i = arr.length-1; i>=mid; i--){
			tmp = arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[i];
			arr[i] = tmp;
		}
		return String.valueOf(arr);
	}
	//return reverse of a string ( using a char array and no temporary variable)
	// works only when all characters in the string is ASCII
	public static String reverseString3(String str){
		char[] arr = str.toCharArray(); 
		int begin = 0;
		int end = arr.length-1;
		while(begin<end){
			arr[begin] = (char)( arr[begin]^arr[end]);
			arr[end] = (char)( arr[begin]^arr[end]);
			arr[begin] = (char)( arr[end]^arr[begin]);
			begin++; end--;
		}
		return String.valueOf(arr);
	}
}
