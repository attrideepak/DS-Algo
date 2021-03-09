package com.mylearnings.java.collections;

public class RemoveWhiteSpacesString {
	public static void main(String[] args) {
		//withReplaceAll("sadfsdsg hhg jg jhkuugh  jhbv jh");
		withoutReplaceAll("hjfhfhgfhgfh hgvhgv : hgvh hg hg");
	}
	static void withReplaceAll(String str) {
		String newStr = str.replaceAll("\\s", "");
		System.out.println(newStr);
	}
	static void withoutReplaceAll(String str) {
		String[] s = str.split(" ");
		String newString="";
		for(String split:s){
			newString +=split;
			}
			System.out.println(newString);
			}
	}


