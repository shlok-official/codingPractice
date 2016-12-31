import java.util.Scanner;;
class spiralMatrix{



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[][] = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
            i++;
            if(i>= a) break;
            for (int j = a-1; j >= 0; j--) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}