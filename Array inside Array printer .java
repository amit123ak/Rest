// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
       // ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5));
        
       int arr[] = {1,2,3,4,5,6,7};
        
       
//[[1],[1,2],[1,2,3,4],[1,2,3,4,5],[1,2,3,4,5,6],[1,2,3,4,5,6,7]]

 List<int[]>list=new ArrayList<>();

int index=0;


for(int i=0;i<arr.length;i++)
{
    index++;
    int copies[]=new int[index];
    
    for(int j=0;j<index;j++)
    {
        
        copies[j]=arr[j];
    }
    list.add(copies);
}



System.out.println(Arrays.deepToString(list.toArray()));




        
        
    }
        
}
