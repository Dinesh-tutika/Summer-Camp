public class EasyPattern {
    public static void main(String[] args) {
        int n = 5;
        //****** 
        for(int i =1;i<=n;i++){
            System.out.print("* ");
        }
        System.out.println();

        System.out.println("\n");
//*********
//*********
//*********
        for(int i =1;i<=4;i++){
            for(int j=1;j<=12;j++){
                System.out.print(" "+"* ");
            }
            System.out.println();
        }
/* *******
    *******
     *******
      *******  
 */
        for(int i =1;i<=4;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=12;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
/*
*
**
***
****
 */
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
/*
*****
****
***
**
*
 */
        for(int i=5;i>=1;i--){
			for(int j=1;j<=i-1;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
        //method 2
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
/*
*****
 ****
  ***
   **
    *
 */
        for(int i=1; i<=n; i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
/*  *
   ***
  *****
 *******
********* */
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
/*0
10
010
1010
01010 */
        int k;
        for(int i=1;i<=5;i++){
            if(i%2==0) k=1;
            else k=0;
            for(int j=1;j<=i;j++){
                System.out.print(k);
                if(k==0) k=1;
                else k=0;
            }
            System.out.println();
        }
        //method 2
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               if((i+j)%2==0) System.out.print("0");
               else System.out.print("1");
            }
            System.out.println();
        }
/*1
12
123
1234
12345 */
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
/*
* * * * * * 
*         * 
*         * 
*         * 
* * * * * * */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                if(i==1||i==n||j==1||j==6) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}






/* 
1
1122
111222333
1111222233334444

for(int i=1;i<=4;i++){
    for(int j=1;j<=i;j++){
        for(int k=1;k<=j;k++){
        System.out.print(j);
        }
    }
    System.out.println();
}
*/