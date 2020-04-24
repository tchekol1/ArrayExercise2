import java.util.Scanner;

public class deplicatearray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int []arr= new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
        {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j])
                    break;
            }

                if (i == j)
                    System.out.print(arr[i] + " ");

        }
    }
}
