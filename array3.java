import java.util.Scanner;
class darray {
    public static void main(String []arg){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the no of rows in the array: ");
        int r=sc.nextInt();
        System.out.println("enter the no of coloumns int he aray :");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter  the array  elelments:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 arr[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.print("\n");
        }
        System.out.println("\n\n\nTranspose the array :");
       /* System.out.println("enter the row for the array:");
        int ro=sc.nextInt();
        System.out.println("enter the colomns for the array :");
        int co=sc.nextInt();
        int ar[][]=new int[ro][co];

        System.out.println("enter the array elements ;");
        for(int i=0;i<ro;i++){
            for(int j=0;j<co;j++){
                ar[i][j]=sc.nextInt();
            }
        }*/
        System.out.println("transpose of the elements is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        

    }

}