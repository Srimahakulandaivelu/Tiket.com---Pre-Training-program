package exception;

public class numberValidator extends Exception{

    public static void validate(int number) throws moreThanOneDigitException{
        if(Math.abs(number) > 9){
            throw new moreThanOneDigitException("Number contains more than one digit");
        }

        else {
            System.out.println("Valid single digit number.");
        }

    }
}