package ProblemSolving;

public class NegativeBeginning {
    public static void main(String[] args) {
        int [] arr = {9,6,7,4,-2,-4,1,-5,8,90};
        int i = 0;
        int j = arr.length-1;

        while(i<=j){
            if(arr[i]<0)    // left
                i++;
            else if(arr[j]>=0)  // right
                j--;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        for(int k:arr){
            System.out.print(k+" ");
        }

    }
}
