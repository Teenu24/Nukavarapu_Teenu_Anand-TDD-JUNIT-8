package com.epam.app;

public class Remove_A {
	public static String remove(String string) {
		// TODO Auto-generated method stub
		if(string.length()>0) {
			String str = string;
			String st = "";
			if(str.charAt(0)=='A') {
				st = str.replaceFirst("A","");
				if(st.charAt(0)=='A') {
					 st = st.replaceFirst("A","");
				}
			}
			else if(str.charAt(1)=='A') {
				st = str.replaceFirst("A","");
			}
			if(st.length()>0) {
				return st;
			}
			return str;
		}
		else {
			return "";
		}
	}
}
