package exp09.data;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException() {
        super();
    }

    public IllegalTriangleException(String message) {
        super(message);
    }

    public IllegalTriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalTriangleException(Throwable cause) {
        super(cause);
    }

    protected IllegalTriangleException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
