import java.util.*;
public class trie_1{
    static class Node{
        Node children[]=new Node[26];
        boolean eow;
        Node()
        {
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();
    static void insert(String word){//0(l)
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
                curr.children[index]=new Node();
            }
            curr=curr.children[index];

        }
        curr.eow=true;
    }
    public static boolean search(String wor){//0(L)
        Node curr=root;
        for(int level=0;level<wor.length();level++){
            int index=wor.charAt(level)-'a';
           if(curr.children[index]==null){
               return false;
           }
           curr=curr.children[index];
        }
           return curr.eow==true;

        }
    public static void main(String args[]){
        String word[]={"the","a","their","any","the"};
        for(int i=0;i<word.length;i++){
        insert(word[i]);
        }
        System.out.println(search("thee"));
        System.out.println(search("any"));

    }
}