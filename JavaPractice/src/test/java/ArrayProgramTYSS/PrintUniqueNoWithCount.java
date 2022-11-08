package ArrayProgramTYSS;

import java.util.LinkedHashSet;

public class PrintUniqueNoWithCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a= {4,3,2,3,1};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer> (); //to remove duplicate
		for(int i =0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		for(Integer in: set)
		{
			int count=0;
			for(int i=0; i<a.length; i++)
			{
				if(in==a[i])
				{
					count++;
				}}
			if(count==1)     // print unique number with count(that character which is used only one times will print)
			{
				System.out.println(in);
			}}
	}
	}

