import java.util.*;

class rev{

    public int reverseNum(int num){

        int result = 0;
        while( num!= 0){

            int remainder = num % 10;
            int quotient = num / 10;
            result = (result * 10) + remainder;
            num = quotient;
        }
        return result;
    }
}

class reverse{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int num = sc.nextInt();


    }
}