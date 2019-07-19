package myProject;
import java.util.*;

public class SpecialNumber {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		if(checkSpecialNumber(N)){
			System.out.println(N);
		}
		else{
			convertToSpecialNumber(N);
		}
	}
	
	public static boolean checkSpecialNumber(int N){
		
		String num = Integer.toString(N);
		
		for(int i=1; i<num.length(); i++){
			int d1 = (int)num.charAt(i-1);
			int d2 = (int)num.charAt(i);
			if(d2<d1){
				return false;
			}
		}
		return true;
	}
	
	public static void convertToSpecialNumber(int N){
		String num = Integer.toString(N);
		int k=1;
		for(int i=1 ;i<num.length(); i++,k++){
			int d1 = (int)num.charAt(i-1);
			int d2 = (int)num.charAt(i);
			if(d2<d1){
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int j=0; j<k ;j++){
			sb.append(num.charAt(j));
		}
		
		for(int j=k; j<num.length() ;j++){
			sb.append("0");
		}
		
			
			
		N = Integer.parseInt(sb.toString());	
		N--;
		if(checkSpecialNumber(N)){
			System.out.println(N);
		}
		else{
			convertToSpecialNumber(N);
		}
	}
}
