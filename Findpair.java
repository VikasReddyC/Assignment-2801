import java.util.*;
class Findpair{
public static void Findpair(ArrayList<Integer> arr, int number){
int start = 0;
int end = arr.size()-1;
int x,y;

while (start<end){
if (arr.get(start) + arr.get(end) == number){
System.out.println("Pair is : ");
x = arr.get(start);
y= arr.get(end);
System.out.println(x+ " "+ y);
return;
}
if(arr.get(start) + arr.get(end) > number){
end--;
}
else{
start++;
}
}
System.out.println("Given number have no pair in arryList");
}
public static void main(String[] args){
ArrayList<Integer> arr = new ArrayList<Integer>();
arr.add(1);
arr.add(3);
arr.add(4);
arr.add(7);
Scanner sc = new Scanner(System.in);
System.out.println("Enter number to find pair :");
int number = sc.nextInt();
Findpair(arr, number);
}
}