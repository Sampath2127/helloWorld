package com.lovecoding.arrays;

import java.util.Scanner;

public class Array {
int j;
	public int[] getIntegers(int[] array) {

		//printArray(array);
		return array;
	}
	//

	public void printArray(int[] array) {
		for (int elements : array) {
			System.out.print(elements + " ");
		}

	}
	
	public void sortedArray(int[] s){
		int current;
		for(int i=0; i<=s.length-1; i++){
			
			j=i-1;
			while(j>=0 && s[j]<s[i]){
				current = s[i];
				s[i]=s[j];
				s[j]=current;
				j=j-1;
				i=i-1;
			}
		//	s[j+1]=current;
		}
		printArray(s);
	}

	public static void main(String[] args) {
		Array arr = new Array();
		Scanner scr = new Scanner(System.in);
		int[] b = new int[5];
		for (int i = 0; i < b.length; i++) {
			b[i] = scr.nextInt();
		}
		scr.close();
		arr.getIntegers(b);
		arr.sortedArray(b);
	}

}
