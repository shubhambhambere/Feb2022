package com.aspire.java.arrays;
//row=4
//column=5
public class MultiDimension {
public static void main(String[] args) {
	// int [] b[]= {{}};
    // int c[] []= {{}};
	//int[] []d={{}};
	//int [][]e={{}};
	int [][] a= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};  //4*5 equal column
	int [][] f= {{1,2,3},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
    int [][] z= {{1,2,3,4},{5,6,7,8,},{9,10,11,12},{13,14,15,16}};
	int [][] g=new int [2][3];
	g[0][0]=0;
	g[0][1]=1;
    g[0][2]=2;
    g[1][0]=3;
    g[1][1]=4;
    g[1][2]=5;
    
    System.out.println("print z[]");
    
    for (int x=0;x<4;x++)
    {
    	for (int y=0;y<4;y++)
    	{
    	   System.out.print(z[x][y]+" ");	
    	}
    	System.out.println();
    }
    
    
    
    
    
    System.out.println("print g[]");
    for(int h=0;h<2;h++)
    {
    	for(int i=0;i<3;i++)
    	{
    		System.out.print(g[h][i]+" ");
    	}
    	System.out.println();
    }
    
    System.out.println("Print a[]");
			
    for(int j=0;j<4;j++) 
    {
    	for(int k=0;k<5;k++)
    	{
    		System.out.print(a[j][k]+" ");
    		
    	}
    	System.out.println();
    }
    
    System.out.println("Print f[] ");
    for(int l=0;l<4;l++)
    {
    	for(int m=0;m<f[l].length;m++)
    	{
    		System.out.print(f[l][m]+" ");
    		
    	}
    	System.out.println();
    }
}
	
}
