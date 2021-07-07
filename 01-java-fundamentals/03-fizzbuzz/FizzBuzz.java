

public class FizzBuzz {
    public String fizzBuzz(int num){
        if(num % 3 == 0 && num % 5 ==0){
            return "FizzBuzz";
        }
        else if(num % 5 ==0){
            return "Buzz";
        }
        else if (num % 3 ==0){
            return "Fizz";
        }
        else{
            return Integer.toString(num);
        }
    }

    public void counter(){
        for( int count = 0; count <= 5000; count++){
            String Result = fizzBuzz(count);
            System.out.println(count + " will result in " + Result);
        }
    }
}
