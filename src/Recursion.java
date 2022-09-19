public class Recursion {

    private static int factorial(int n){

    if(n > 1){
        return factorial(n-1) + n;
    }else {
        return 1;
    }

    }

    private static int countBunnyEars(int bunnies){

        if(bunnies > 0){
            return countBunnyEars(bunnies - 1) + 2;
        }else{
            return 0;
        }

    }

    private static int mutantBunnyEars(int bunnies){

        if(bunnies > 0){

            if(bunnies % 2 == 0){

                return mutantBunnyEars(bunnies - 1) + 3;

            } else {

                return mutantBunnyEars(bunnies - 1) + 2;

            }

        }else{
            return 0;
        }

    }

    private static int countSeven(int n){

        if(n < 7){

            return 0;

        }

        if(n % 10 == 7){

            return countSeven(n / 10) + 1;

        }else{

            return countSeven(n / 10);

        }

    }

    private static int countStringPairs(String s){

        if(s.length() <= 2){
            return 0;
        }

        if(s.charAt(0) == s.charAt(2)){

            return countStringPairs(s.substring(1)) + 1;

        } else {

            return countStringPairs(s.substring(1));

        }

    }

    private static int fibonacci(int n){

        if(n == 0){
            return 0;
        }if(n == 1){
            return 1;
        }else{
            return fibonacci(n) + 1;
        }

    }

    public static void main(String[] args) {

       System.out.println(fibonacci(3));

    }

}
