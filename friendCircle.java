import java.util.Scanner;
//USING ADJACENCY MATRIX
class friendCircle {
    boolean isValid(int arr[][], int i, int j, boolean visited[][], int a) {
        return (i >= 0) && (i < a) && (j >= 0) && (j < a) && (arr[i][j] == 1 && !visited[i][j]);
    }


    void totalCircles(int arr[][], boolean visited[][], int i, int j, int a) {
        //Check for all 8 neighbours ie: (i-1,j-1),(i,j-1),(i+1,j-1),(i-1,j),(i+1,j),(i-1,j+1),(i,j+1),(i+1,j+1)
        int rowNo[] = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
        int colNo[] = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};
        visited[i][j] = true;

        for (int k = 0; k < 8; ++k) {
            if (isValid(arr, i + rowNo[k], j + colNo[k], visited, a)) {
                totalCircles(arr, visited, i + rowNo[k], j + colNo[k], a);
            }
        }
    }


    public static void main(String[] args) {
        friendCircle fc = new friendCircle();
        //int visited[][]= new int[][];
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // System.out.println(a);
        int arr[][] = new int[a][a];
        boolean visited[][] = new boolean[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int totalLoops = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    fc.totalCircles(arr, visited, i, j, a);
                    totalLoops++;
                }
            }
        }
        System.out.println(totalLoops);
    }

}
/*
5,- input matrix size
1 1 0 0 0
0 1 0 0 1
1 0 0 1 1
0 0 0 0 0
1 0 1 0 1
5<- result
*/