import java.util.*;
import java.io.*;

class Array{
	int SecondLargest(int arr[]){
		int l=arr[0];
		int sL=Integer.MIN_VALUE;
		int n=arr.length;
		for(int i=1;i<n;i++){
			if(l<arr[i]){
				sL=l;
				l=arr[i];
			}
		}
		return sL;
	}
}
class Run{
	public static void main(String[] args){
		Array a=new Array();
		int arr[]={1,5,47,8,2,3,99,44};
		System.out.println(a.SecondLargest(arr));
	}
}