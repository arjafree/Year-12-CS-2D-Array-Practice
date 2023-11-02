
public class Array2dPractice {

    // Declare all methods as static.
    
    // 1. sumAllCells
    static int sumAllCells(int arr[][]){
        int sum = 0;
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                sum+=arr[row][col];
            }
        }

        return sum;

    }
    // 2. sumRowN
    static int sumRowN(int arr[][], int Rown){
        int rowSum = 0;
        for (int col = 0; col < arr[Rown].length; col++){
            rowSum+=arr[Rown][col];
        }
        return rowSum;
    }

    // 3. sumColN

    static int sumColN(int arr[][], int Coln){
        int colSum = 0;

        for(int row = 0; row<arr.length; row++){
        
            colSum+=arr[row][Coln];

        }

        return colSum;
    }

    // 4. sumAllCellsBetween

    static int sumAllCellsBetween(int arr[][], int row1, int col1, int row2, int col2){
        int sum = 0;
        int row = row1;

        while(row<=row2){
            if (row == row2) {
                for (int col = 0; col <= col2; col++) {
                    sum += arr[row][col];
                }
            }
            else if (row == row1){
                for(int col = col1; col<arr[row].length; col++){
                    sum+=arr[row][col];
                }
            }
            else{
                sum += sumRowN(arr, row);
            }
            row++;
        }

        return sum;
    }

}
