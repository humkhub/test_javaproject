package Array;

public class Array {
//    public static void main(String[] args) {
//     // 0,1,2,3,4,5,6,7,8,9,10indexing
//
//      String[] arr = {"dhi","fkdhfi", "ffy", "hdihf", "nidhfih", "hfi"};
//                     // 0    1        2      3         4         5...> write indexing for refernce
//        //for(int i=5; i>=0 ; i--){
//            //System.out.println(arr[i]);
//        for(int i=0; i<=5; i++){
//            System.out.println(arr[i]);
//
//        }
//    }
//
//
//}

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {1, 2, 3, 4, 5};
         //          0  1   2    3     4
        // Print array elements

        for (int i = 0; i < arr.length; i++) {   //.length is for the whole length of the array
            System.out.println(arr[i]);
        }
    }
}