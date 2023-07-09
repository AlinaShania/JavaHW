package class29;


/**
 * ** This exception is thrown when there is not enough balance in the user class
 */
public class InsuficientBalance extends RuntimeException {
    public InsuficientBalance (String errorMessage){
        super(errorMessage);
    }
}
