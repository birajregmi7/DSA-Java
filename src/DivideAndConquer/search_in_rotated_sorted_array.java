package DivideAndConquer;

public class search_in_rotated_sorted_array {
    public static int search(int arr[], int target, int si , int ei){
        //bc
        if (si>ei){
            return 1;
        }
        int mid = si + (ei-si)/2;
        if (arr[mid] == target){
            return mid;
        }
        //line1
        if (arr[si]<=arr[mid]){
            if (arr[si]<=target && target<=mid-1){
                return search(arr,target, si,mid-1);
            }else{
                return search(arr,target,mid+1,ei);
            }
        }else{
            if (arr[mid]<=target && target <=ei){
                return search(arr,target,mid+1,ei);
            }else{
                return search(arr,target,si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
       int arr[] ={4,5,6,7,0,1,2};
       int target = 0;
       int targetIndex = search(arr,target, 0, arr.length-1);
        System.out.println(targetIndex);
    }
}
