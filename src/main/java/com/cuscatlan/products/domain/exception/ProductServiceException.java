package com.cuscatlan.products.domain.exception;

/**
 * Exception thrown when there is an error in the Product Service.
 * <p>
 * This exception is used to handle various failures related to interactions
 * with the Product Service, such as service unavailability, timeouts, or
 * any other unexpected issues.
 * </p>
 * 
 * @author hguzman
 */
public class ProductServiceException extends RuntimeException {

    /**
     * Constructs a new {@code ProductServiceException} with a specified message.
     * 
     * @param message the detail message, which explains the reason for the exception.
     */
    public ProductServiceException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code ProductServiceException} with a specified message and cause.
     * This allows for chaining exceptions.
     * 
     * @param message the detail message explaining the reason for the exception.
     * @param cause the underlying cause of the exception (e.g., another exception that triggered this one).
     */
    public ProductServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
