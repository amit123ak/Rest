// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
       // ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5));
        
       int arr[] = {1,2,3,4,5,6,7};
       
List<List<Integer>> list=new ArrayList<>();

for(int i=0;i<arr.length;i++)
{
    List<Integer>newList=new ArrayList<>();
    
    for(int j=0;j<=i;j++)
    {
        newList.add(arr[j]);
    }
    list.add(newList);
    
    
}

       System.out.println(list); 
        
    }
        
}
