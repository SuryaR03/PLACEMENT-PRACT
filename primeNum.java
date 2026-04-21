import java.util.*;

class Prime{

    public boolean checkprime(int num){

        boolean prime =true;

        for(int i =2;i<=(num /2);i++){

            if(num % i == 0){
                prime =false;
                break;
            }
        }
        return prime;
    }
    public int sumPrime(int num){
        int sum=0;
        for(int i=2;i<=num;i++){
            if( checkprime(i) == true){
                sum = sum+i;
            }
        }
        return sum;
    }
}

public class primeNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Prime prime = new Prime();

        System.out.println("Sum of prime: "+prime.sumPrime(num));
    }
}

