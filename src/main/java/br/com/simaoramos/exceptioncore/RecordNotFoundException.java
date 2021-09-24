package br.com.simaoramos.exceptioncore;

public class RecordNotFoundException extends RuntimeException {
    public RecordNotFoundException(String message) {
        super(message);
    }
}
