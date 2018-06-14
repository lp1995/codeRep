package liupeng.cn.Algorithm.codeforce;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforce {
	public static void main(String ...arg){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt()-1;
		int b =in.nextInt()-1;
		int c=in.nextInt()-1;
		int d = in.nextInt()-1;
		int m=36;
		int n = 50;
		char s[][] = new char[m][n];
		//make a 
		for(int i=0;i<9;i++){
			for(int j=0;j<n;j++){
				s[i][j]='A';
			}
		}
		//make b
		for(int i=9;i<18;i++){
			for(int j=0;j<n;j++){
				s[i][j]='B';
			}
		}
		//make c
		for(int i=18;i<27;i++){
			for(int j=0;j<n;j++){
				s[i][j]='C';
			}
		}
		//make d
		for(int i=27;i<36;i++){
			for(int j=0;j<n;j++){
				s[i][j]='D';
			}
		}
		//use a
		int x=10,y=0;
		for(int i=0;i<a;i++){
			s[x][y]='A';
			y+=2;
			if(y>48){
				y=0;
				x+=2;
			}
			
		}
		//use b
		x=19;y=0;
		for(int i=0;i<b;i++){
			s[x][y]='B';
			y+=2;
			if(y>48){
				y=0;
				x+=2;
			}
		}
		//use c
		x=28;y=0;
		for(int i=0;i<c;i++){
			s[x][y]='C';
			y+=2;
			if(y>48){
				y=0;
				x+=2;
			}
		}
		//use d
		x=1;y=0;
		for(int i=0;i<d;i++){
			s[x][y]='D';
			y+=2;
			if(y>48){
				y=0;
				x+=2;
			}
		}
		System.out.println(m+" "+n);
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(s[i][j]);
			}
			System.out.println();
		}

	}
}