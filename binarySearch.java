import java.util.*;
class binarySearch{
     public static void binary_search(int arr[],int n,int num)
     {
       int flag=0;
       int low=0,high=n-1,mid=(low+high)/2;
       while(low<=high)
       {
          if(num==arr[mid])
          {
             flag=1;
             break;
          }
          else if(num<arr[mid])
          {
             high=mid-1;
             mid=(low+high)/2;
          }
          else
          {
             low=mid+1;
             mid=(low+high)/2;
          }
       }
       if (flag==1)
           System.out.println(num+" is at position "+(mid+1));
       else
           System.out.println(num+ " is not in array");
     }
     public static void main(String args[]){
       Scanner s=new Scanner(System.in);
       System.out.println("enter total elements in array:");
       int n=s.nextInt();
       int arr[]=new int[n];
       System.out.println("enter array elements:");
       for (int i=0;i<n;i++)
       {
          arr[i]=s.nextInt();
       }
       System.out.println("Enter element to search:");
       int num=s.nextInt();
       binary_search(arr,n,num);
  }  
}                
          
          
          
          
          
          
                      
