public class LinearSearch{
    public void search(int ar[], int s){
        int len = ar.length;
        for(int i =0 ; i < len; i++){
            if(ar[i] == s){
                System.out.println("Found " + s + " at position " + (i+1));
                break;
            }
        }
    }
    public static void main(String args[]){
        int ar[] = { 20 , 25 , 14 , 26 , 85 , 01 , 89};
        int ele = 85;
        LinearSearch ls = new LinearSearch();
        ls.search(ar, ele);
    }
}