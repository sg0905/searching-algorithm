public class BinarySearch {
    public void run(int ar[], int element){
        int len = ar.length;
        int start = 0;
        int end = len;
        
        while(start < end){
            int mid = (start+end)/2;
            if(ar[mid] == element){
                System.out.println("Found the element at position " + (mid+1));
                break;
            }
            else if( ar[mid] > element ){
                end = mid-1;
            }
            else{
                start = mid + 1; 
            }
        }
    }
    public static void main(String args[]){
        int ar [] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int element = 60;
        BinarySearch bs = new BinarySearch();
        bs.run(ar, element);
    }
}
