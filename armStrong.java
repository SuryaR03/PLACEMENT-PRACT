import java.util.*;

class Arm{
    public int countDigits(int num){

    int count =0;
        while(num>0){
            int remainder = num %10;
            count++;
            num=num/10;
        }
        return count;
    }

 //initially public void we returns
 // the int sum so we have to change to public int

    public int checkArmstrong(int num){
        int sum=0;
        int digits = countDigits(num);
    
        while(num>0){
            int remainder = num%10;
            num = num/10;
            sum=sum+ (int)(Math.pow(remainder,digits));
        }
        return sum;
    }
}

class armStrong{                               // class prog main
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Arm arms = new Arm();
        if(num == arms.checkArmstrong(num))
            System.out.println(num + "is an armstrong number");
        else
            System.out.println(num + "is not an armstrong number");
    }
}