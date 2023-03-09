package Array;
public class AdditionArray_2 {
	public static void main(String[] args) {
		// create matrix
		int a [][]= {{1,2,3},{3,4,5},{0,9,8}};
		int b [][]= {{1,2,5},{3,1,5},{4,5,6}};
		//for storing result creating another matrix
		int c[][]=new int [3][3]; //three row and three column
		//logic and printing
		for(int i=0;i<3;i++) {//printing row
			for(int j=0;j<3;j++) {//printing column
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	}
