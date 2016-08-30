# Reverse3

import java.util.Scanner;
public class Reverse {
	private static Scanner a;
    public static void main(String[] args) {
		a = new Scanner(System.in);
		System.out.println("enter the string");
		String qq = a.nextLine();
		StringBuffer s= new StringBuffer("");
		String[] arr = qq.split(" ");
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
		sb.append( Character.isUpperCase(arr[i].charAt(j)) ? Character.toLowerCase(arr[i].charAt(j)) : (Character.toUpperCase(arr[i].charAt(j))));
        }      s.append(sb.reverse());
	    	   s.append(" ");
               sb= new StringBuffer("");
		}
		System.out.println(s);
	}
}
