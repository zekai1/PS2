package pkgPS2;

public class MyInteger {
    private int iValue;

    public MyInteger(int iValue) {
        this.iValue = iValue;
    }

    public int getiValue() {
        return iValue;
    }

    public boolean isEven(){
        if(iValue % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isOdd(){
        if(iValue % 2 == 1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isPrime(){
        if (iValue < 2) return false;
        if (iValue == 2) return true;
        if (iValue % 2 == 0) return false;
        for (int i = 3; i * i <= iValue; i += 2)
            if (iValue % i == 0) return false;
        return true;
    }

    public static boolean isEven(int x){
        if(x % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isOdd(int x){
        if(x % 2 == 1){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isPrime(int x){
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        for (int i = 3; i * i <= x; i += 2)
            if (x % i == 0) return false;
        return true;
    }

    public static boolean isEven(MyInteger i){
        if(i.isEven()){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isOdd(MyInteger i){
        if(i.isOdd()){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isPrime(MyInteger i){
        if(i.isPrime()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEquals(int x){
        if(x == iValue){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEquals(MyInteger i){
        if(i.iValue == iValue){
            return true;
        }
        else{
            return false;
        }
    }
}
