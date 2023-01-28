import java.util.*;
class Findele{
public static void Testele(int[] arr, int ele){
for (int n : arr){
if(ele == n){
System.out.println("Array contains "+ ele);
return;
}
}
System.out.println("Can not find the element you have entered");
}
public static void main(String[] args){
int arr[] = {12, 13, 14, 27, 30};
Scanner sc = new Scanner(System.in);
System.out.println("Enter element to search :");
int ele = sc.nextInt();
Testele(arr,ele);
}
}