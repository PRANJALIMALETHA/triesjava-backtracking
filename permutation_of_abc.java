public class permutation_of_abc {
   public static void  findpermutation(String str,String ans){
        if(str.length()==0){
          System.out.println(ans);
          return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
           String mystr=str.substring(0,i)+str.substring(i+1,str.length()-1);
            findpermutation(mystr,ans+curr);
        }

    }
    public static void main(String args[]){
       String str="abc";
       String ans="";
       findpermutation(str,ans);
    }
    
}
