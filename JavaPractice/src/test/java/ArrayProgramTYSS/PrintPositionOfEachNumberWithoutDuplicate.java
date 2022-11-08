package ArrayProgramTYSS;

import java.util.LinkedHashSet;

public class PrintPositionOfEachNumberWithoutDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int[] q = {4,3,2,3,1};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer> (); //to remove duplicate
		for(int i =0; i<q.length; i++)
		{
			set.add(q[i]);
		}
		for(Integer in: set)
		{
			for(int i=0; i<q.length; i++)
			{
				if(in==q[i]){
					{	
						System.out.println(in+" "+(i+1));	
						break;	
					}}
			}

		}}}
