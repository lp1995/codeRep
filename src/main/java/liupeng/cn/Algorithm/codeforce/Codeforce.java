package liupeng.cn.Algorithm.codeforce;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforce {
	public static void main(String ...arg){
		Scanner in = new Scanner(System.in);
		int len=in.nextInt();
		int p = in.nextInt();
		String s = in.next();
		char []a = s.toCharArray();
		boolean flag=true;
		for(int i=0;i<len-p;i++){
			if(a[i]=='.'&&a[i+p]=='.'){
				a[i]='1';
				a[i+p]='0';
				flag =false;
			}else if(a[i]=='.'&&a[i+p]!='.'){
				if(a[i+p]=='1'){
					a[i]='0';
				}else{
					a[i]='1';
				}
				flag =false;
			}else if(a[i]!='.'&&a[i+p]=='.'){
				if(a[i]=='1'){
					a[i+p]='0';
				}else{
					a[i+p]='1';
				}
				flag =false;
			}else{
				if(a[i]!=a[i+p]){
					flag = false;
				}
			}
		}
		int b = len/p;
		int c=len%p;
		for(int i=len-p*b;i<len-c;i++){
			if(a[i]=='.'){
				a[i]='0';
			}
			
		}
		String out = "";
		for(int i=0;i<len;i++){
			out+=a[i];
		}
		if(flag==true){
			System.out.println("No");
		}else{
			System.out.println(out);
		}
	}
}