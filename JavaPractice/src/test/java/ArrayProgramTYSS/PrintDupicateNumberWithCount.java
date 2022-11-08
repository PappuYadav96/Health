package ArrayProgramTYSS;

import java.util.LinkedHashSet;

public class PrintDupicateNumberWithCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] q = {4,3,2,3,1};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer> ();
		for(int i=0; i<q.length; i++)
		{
			set.add(q[i]);
		}
		for(Integer in: set)
		{
			int count =0;
			for(int i=0; i<q.length; i++)
			{
				if(in.equals(q[i]))
				{
					count++;
				}}
			if(count>1) {
				System.out.print(in);

			}}	
	}}