import java.util.*;
class Array{
public static void findMinimum(int arr[]){
int s = arr[0];
for(int i = 0; i< arr.length; i++){
if(arr[i] < s){
s=arr[i];
}
}
System.out.println("Smallest element in array is : " + s);
}
public static void main(String[] args){
int arr[] = {2,23,1,3,12,17};
findMinimum(arr);
}
}