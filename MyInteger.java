
package myınteger;
    
    public class MyInteger {
    private int value;

    
    public MyInteger(int value) {
        this.value = value;
    }

    
    public int getValue() {
        return value;
    }

    
    public boolean isEven() {
        return isEven(this.value); 
    }

    public boolean isOdd() {
        return isOdd(this.value);
    }

    public boolean isPrime() {
        return isPrime(this.value);
    }

    
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    
    public static boolean isEven(MyInteger myInt) {
        return myInt.isEven();
    }

    public static boolean isOdd(MyInteger myInt) {
        return myInt.isOdd();
    }

    public static boolean isPrime(MyInteger myInt) {
        return myInt.isPrime();
    }

   
    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInt) {
        return this.value == myInt.getValue();
    }

   
    public static int parseInt(char[] chars) {
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result = result * 10 + (chars[i] - '0'); 
        }
        return result;
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}

    
    
    

