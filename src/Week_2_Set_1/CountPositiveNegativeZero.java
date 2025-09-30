package Week_2_Set_1;

public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        int arr[] = {5, -3, 0, 12, -9, 0, 7};
        int zero = 0, pos = 0, neg = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==0){
                zero++;
            } else if (arr[i]<0) {
                neg++;
            }
            else {
                pos++;
            }
        }
        System.out.println("Positive Numbers Count: "+ pos);
        System.out.println("Negative Numbers Count: "+ neg);
        System.out.println("Zero Count: "+ zero);
    }
}
