package com.example.demo;

public class TEsting {
	public static void main(String [] args) {
	
		String str1 = "SW";
		String str2 = "NxWxSxEx";
		System.out.println(nSEW(str1));
		System.out.println(nSEW(str2));
		
	}
	
	public static int nSEW(String input) {
		int distance = 0;
		int nCount=0;
		int sCount = 0;
		int eCount =0;
		int wCount =0;
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
	           switch (c) {
			case 'N':
				nCount++;
				break;
			case 'S':
				sCount++;
				break;
			case 'E':
				eCount++;
				break;
			case 'W':
				wCount++;
				break;
			default:
				break;
			}
				
	        }
		}
		if(nCount==sCount && eCount == wCount) {
				distance = 0;
		}else if(nCount==sCount && eCount != wCount) {
			distance = 1;
		}else if(nCount!=sCount && eCount == wCount) {
			distance = 1;
		}
		if(nCount!=sCount && eCount != wCount) {
			distance = 2;
		}
			
		
		return distance;
		
	}

}
