public class recursionoccurance {
    //first occurance 
    // public static int firstOccrance(int arr[],int key,int i){
    //     if(i == arr.length){
    //         return -1;
    //     }
    //     if(arr[i] == key){
    //         return i;

    //     }
    //     return firstOccrance(arr, key, i+1);
    // }
    //last occurance
    public static int lastOccurance(int arr[],int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound  == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,5,7,9,5,3};
        System.out.println(lastOccurance(arr, 5, 0));
    }
    
}
