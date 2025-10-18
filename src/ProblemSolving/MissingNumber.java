package ProblemSolving;

public class MissingNumber {

    public static int findMissing(int [] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2; // ideal sum
        int sum1 = 0;
        for(int i: arr){
            sum1+=i;
            //System.out.println(i);
        }
        System.out.println(sum);
        System.out.println(sum1);
        return sum - sum1;
    }

    public static void main(String[] args) {
        int [] arr = {3,1,2,4,5,7}; // size = 6 (1-7)
        // natural numbers N => N+1
//        int [] present = new int[arr.length+2] ;
//        for(int i=0; i<arr.length; i++){
//            int element = arr[i];
//            present[element] = 1;
//        }
//        for(int i=1; i<present.length;i++){
//            if(present[i] == 0)
//                System.out.println(i);
//        }
        System.out.println(findMissing(arr));
    }
}
