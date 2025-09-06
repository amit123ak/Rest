// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int arr[]={2,1,6,4};
      int Rightevensum=0;
       int Rightoddsum=0;
       for(int i=0;i<arr.length;i++)
       {
           if(i%2==0)
           {
               Rightevensum+=arr[i];
           }else{
                Rightoddsum+=arr[i];
           }
       }
       
         int Leftevensum=0;
       int Leftoddsum=0;
       
       for(int i=0;i<arr.length;i++)
       {
           
            if(i%2==0)
           {
               Rightevensum-=arr[i];
           }else{
                Rightoddsum-=arr[i];
           }
           
           if(Rightevensum+Leftoddsum==Rightoddsum+Leftevensum)
           {
               System.out.print(i+ " ");
           }
           
            if(i%2==0)
           {
               Leftevensum+=arr[i];
           }else{
                Leftoddsum+=arr[i];
           }
           
           
       }
       
       
       
    }
}
