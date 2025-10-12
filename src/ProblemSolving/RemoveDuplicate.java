package ProblemSolving;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,4,4,5};

        //int [] brr = new int[arr.length];
        int j=1;

//        brr[j] = arr[0];
//        j++;

        for(int i=1; i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                continue;
            }
            else {
                arr[j] = arr[i];
                j++;
            }
        }

        for(; j<arr.length;j++){
            arr[j] = 0;
        }

        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
