// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
       // ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5));
        
int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
int index =1;

for(int i=1;i<arr.length-1;i++)
{
    if(arr[i]!=arr[i-1])
    {
        arr[index++]=arr[i];
    }
}

for(int i=0;i<index;i++)
{
    System.out.print(arr[i]+ "  ");
}




        
        
    }
        
}
