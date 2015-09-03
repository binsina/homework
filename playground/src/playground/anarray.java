package playground;

public class anarray {


	public class anArray {
		int j=0;  // keeps track of column position
		   int k=0;  //this varialbe is what we are populating the array with
		     int[][] multD = new int[5][10];{
		     for(int i=0;i<5;i++)
		     {   
		     if(j>0)
		     {k--;
		     }
		        j=0;
		     multD[i][j]=k; //store the value of k inside multidimensional array
		    // System.out.println(multD[i][j]);
		     k++;
		     for(j=0;j<10;j++)
		     {
		     multD[i][j]=k;
		     System.out.println(multD[i][j]);
		     k++;
		     
	}
	System.out.println(multD[2][8]);
		     }
		     }
	}
}
