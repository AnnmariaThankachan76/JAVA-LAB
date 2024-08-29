import java.util.Scanner;
public class Matrixmultiplication
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,k;
		System.out.println("MATRIX MULTIPLICATION ");
		System.out.println("Enter the number of row of matrix A");
		int r1=sc.nextInt();
		System.out.println("Enter the number of columns of matrix A");
		int c1=sc.nextInt();
		System.out.println("Enter the number of rows of matrix B");
		int r2=sc.nextInt();
		System.out.println("Enter the number of columns of matrix B");
		int c2=sc.nextInt();
		if(c2!=r1)
		{
			System.out.println("Matrix multiplication is not possible");
			
		}
		int A[][]=new int[r1][c1];
		int B[][]=new int[r2][c2];
		int C[][]=new int[r1][c2];
		System.out.println("Enter the  elements of the matrix A");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				A[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Enter the  elements of the matrix B");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				B[i][j]=sc.nextInt();
				
			}
		}	
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++)
				{
					C[i][j]=0;
					for(k=0;k<c1;k++)
					{
						C[i][j]+=A[i][k]*B[k][j];
						
					}
				}
			}
			System.out.println("The  elements of the matrix A\n");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{	
					System.out.print(A[i][j]+"\t");
					
				}
				System.out.println("\n");
		}
			System.out.println("The  elements of the matrix B\n");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{	
					System.out.print(B[i][j]+"\t");
				
				}
				System.out.println("\n");
			}
			System.out.println("The answer i.e  elements of the matrix C\n");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{	
					System.out.print(C[i][j]+"\t");
				
				}
				System.out.println("\n");
			}
				
	}
}
