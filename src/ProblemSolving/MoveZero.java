package ProblemSolving;

public class MoveZero {
    public static void main(String[] args) {
        int [] arr = {5,0,0,1,6,7,0};
        // int [] brr = new int[arr.length];

        int j=0;

        for(int i=0; i< arr.length; i++){
            if(arr[i] != 0){
                arr[j] = arr[i]; // non zero value
                j++;
            }
        }

        System.out.println(j);

//        for( ; j<arr.length; j++){
//            arr[j] = 0;
//        }

        while(j<arr.length){
            arr[j] = 0;
            j++;
        }

        for(int i: arr){ // 4 6 7 8
            System.out.print(i+" ");
        }

    }
}
