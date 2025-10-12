package ProblemSolving;

public class CheckSort {

    public static boolean checkSort(int [] arr){
        if(arr.length == 1){
            return true;
        }
        for(int i=1; i<arr.length; i++){
            if(arr[i] > arr[i-1])
                continue;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr = {1,4,7,8,11,19,0};

        if(checkSort(arr)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }

    }
}
