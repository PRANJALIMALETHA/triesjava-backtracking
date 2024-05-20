public class findsubset_java_program {
    public static void findsubset(String str,String ans,int i){
        if(str.length()==i){
            System.out.println(ans);
            return;
        }
        //yes choice
        findsubset(str,ans+str.charAt(i),i+1);
        findsubset(str,ans,i+1);
    }
    public static void main(String args[]){
        String str="abc";
        String ans=" ";
        int i=0;
        findsubset(str,ans,i);
    }
    
}
