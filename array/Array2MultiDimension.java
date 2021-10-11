package array;

public class Array2MultiDimension {
	

		public static void main(String[] args) {
		int[][] marks=new int[5][3];
//		5 rows and 3 columns
		/*System.out.println(marks[1][2]);*/
//		accessing the value of array
	int mark[][]= {
				{1,2,3},
				{2,3,4},
				{2,4,5},
		};
	// Initializing the array...
	//System.out.println(mark[1][2]);
	int sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("rows");
		int rol=sc.nextInt();
	  System.out.print("cols");
		int col=sc.nextInt();
		System.out.print("rows1");
		int rol1=sc.nextInt();
		System.out.print("cols1");
		int col1=sc.nextInt();
		int[][] a=new int[rol][col];
		int[][] b=new int[rol1][col1];
		System.out.println("for 1st matrix");
		for(int i=0;i<rol;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			                       }}
		System.out.println("for 2nd matrix");
		for(int i=0;i<rol1;i++) {
			for(int j=0;j<col1;j++) {
				b[i][j]=sc.nextInt();
			                       }}
		
		if(col==rol1) {
			int[][] c=new int[rol][col1];
			for(int i=0;i<rol;i++) {
				for(int j=0;j<col1;j++) {
					int kk=b[i][j]*a[j][i];
					sum=kk+sum;
					System.out.println(sum);
					
				                       }
		sum=0;
				}
			for(int i=0;i<rol;i++) {
				for(int j=0;j<col1;j++) {
					System.out.print(c[i][j]+" ");

				                       }
				System.out.println();
				}
				
		}
		else {
			System.out.println(" row of mat1 must be equal to column of mat 2 for multiplication,sorry sir");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}}


