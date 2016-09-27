package net.example.exception;

/**
 * Created by xiu on 9/20/16.
 */
public class ErrorMessage {

    private int errorCode;
    private String errorMessage;


    public ErrorMessage() {
    }

    public ErrorMessage(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
