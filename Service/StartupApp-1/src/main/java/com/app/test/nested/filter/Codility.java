package com.app.test.nested.filter;

public class Codility {

	public static void main(String [] args) {
		int [] A = new int [4];
		Codility codility = new Codility();
		A[0] = -80;
		A[1] = -90;
		A[2] = 0;
		A[3] = 100;
		System.out.println(codility.solution(A));
	}

    public int solution(int[] A) {
        int result = 1;
        for(int a : A){
            if(a == 0){
                 return 0;   
            }
            result*= a;
             
            
        }
        
        if(result<0){
            return -1;
        }
        else if(result > 0){
            return 1;
        }else{
            return 0;
        }
        
        // write your code in Java SE 8
    }
}
