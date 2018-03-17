package dreamly.timeComplexicity.Experiments;

public class Main {
public static void main(String[] args){
        
        System.out.println(intToString(123));
        System.out.println(intToString(0));
        System.out.println(intToString(-321));
        
        System.out.println();
        
        if(isPrime2(137)){
            System.out.println("137 is a prime");
        }else{
            System.out.println("137 is not a prime");
        }
        
        if(isPrime2(121)){
            System.out.println("121 is a prime");
        }else{
            System.out.println("121 is not a prime");
        }
    }
    
    //O(1)
    private static void swap(Object[] arr, int i, int j){
        
        if(i < 0 || i >= arr.length){
            throw new IllegalArgumentException("i is out of bound");
        }
        
        if(j < 0 || j >= arr.length){
            throw new IllegalArgumentException("j is out of bound");
        }
        
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    //O(n)
    private static int sum(int n){

        if(n < 0){
            throw new IllegalArgumentException("n should be greater or equal to zero");
        }
        
        int ret = 0;
        for(int i = 0 ; i <= n ; i ++){
            ret +=i;
        }
        return ret;
    }
    
    private static void reverse(Object[] arr){
        
        int n = arr.length;
        for(int i = 0 ; i < n/2 ; i ++){
            swap(arr, i, n - 1 - i);
        }
    }
    
    //O(n^2)Time Complexity
    private static void selectionSort(Comparable[] arr, int n){
        
        for(int i = 0 ; i < n ; i ++){
            int minIndex = i;
            for(int j = i + 1 ; j < n ; j ++){
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
    
    //O(n) Time Complexity
    private static void printInformation(int n){
        
        for( int i =1 ; i <= n ; i++){
            for( int j = 1 ; j <= 30 ; j ++){
                System.out.println("class " + i + "-" + "No. " + j);
            }
        }
    }
    
    //O(logn) Time Complexity
    private static int binarySearch(Comparable[] arr, int n, int target){
        
        int l = 0, r = n-1;
        while( l <= r ){
            int mid = l + (r-1)/2;
            if(arr[mid].compareTo(target) == 0){
                return mid;
            }
            if(arr[mid].compareTo(target) > 0){
                return l = mid + 1;
            }
        }
        return -1;
    }

    private static String intToString(int num){
        
        StringBuilder s = new StringBuilder("");
        String sign = "+";
        if(num < 0){
            num = -num;
            sign = "-";
        }
        
        while(num != 0){
            s.append(Character.getNumericValue('0') + num % 10);
            num /= 10;
        }
        
        if(s.length() == 0){
            s.append('0');
        }
        
        s.reverse();
        if(sign == "-"){
            return sign + s.toString();
        }else{
            return s.toString();
        }
    }
    
    //O(nlogn)
    private static void hello(int n){
        
        for( int sz = 1 ; sz < n ; sz += sz ){
            for( int i = 1 ; i < n ; i ++ ){
                System.out.println("hello, alorithm!");
            }
        }
    }
    
    //O(sqrt(n)) Time Complexity
    private static boolean isPrime(int num){
        
        for(int x = 2 ; x*x <= num ; x ++){
            if( num % x == 0){
                return false;
            }
        }
        return true;
    }
    
    private static boolean isPrime2(int num){
        
        if( num <= 1 ){
            return false;
        }
        if( num == 2 ){
            return true;
        }
        
        for(int x = 3 ; x*x <= num ; x += 2){
            if( num % x == 0){
                return false;
            }
        }
        return true;
    }
}
