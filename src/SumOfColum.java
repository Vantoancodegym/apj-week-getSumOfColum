import java.util.Scanner;

public class SumOfColum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y;
        int a;
        do {
            System.out.println("Enter row");
            x=input.nextInt();
            System.out.println("Enter col");
            y=input.nextInt();}
        while (x<1||y<1);
        int[][] myArray=new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("enter myarray"+i+"-"+j);
                myArray[i][j]=input.nextInt();
            }
        }
        do {
            System.out.println("enter index of colum you to get sum");
            a= input.nextInt();
        }while (a<0||a>=y);
        System.out.println("sum of colum "+a+" is "+getSum(myArray,a));
    }
    public static int getSum(int[][] array,int a){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i][a];
        }
        return sum;
    }
}
