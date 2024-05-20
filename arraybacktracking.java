public class arraybacktracking {
    public static void main (String args[]){
        int arr[]=new int[5];
        backtracking_rry(arr,0,1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
   public static void backtracking_rry(int arr[],int i,int val){
    if(arr.length==i){
        return;
    }
    arr[i]=val;
    backtracking_rry(arr,i+1,val+1);
    arr[i]=arr[i]-2;


    }
    
    
}
