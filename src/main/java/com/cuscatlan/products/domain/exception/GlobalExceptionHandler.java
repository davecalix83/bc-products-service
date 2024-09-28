package com.cuscatlan.products.domain.exception;

import java.net.UnknownHostException;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * Global exception handler for managing exceptions and returning dynamic error responses across the application.
 * <p>
 * This class centralizes the handling of exceptions using a more dynamic approach, reducing code duplication 
 * and improving maintainability. It also provides consistent error responses to the clients.
 * </p>
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Dynamically handles all custom application exceptions by mapping them to appropriate HTTP statuses.
     * This method provides a single entry point for various exceptions, making the error handling more flexible.
     *
     * @param ex the exception to handle.
     * @param request the current web request (optional for future extensions).
     * @return a ResponseEntity with the corresponding error message and HTTP status.
     */
    @ExceptionHandler({
            ProductServiceException.class, 
            ProductNotFoundException.class, 
            UnknownHostException.class
    })
    public ResponseEntity<ErrorResponse> handleCustomExceptions(Exception ex, WebRequest request) {
        ErrorResponse errorResponse = createErrorResponse("ERROR", ex.getMessage());
        HttpStatus status = getHttpStatusForException(ex);
        return new ResponseEntity<>(errorResponse, status);
    }

    /**
     * Determines the appropriate HTTP status based on the exception type.
     * This method maps exceptions to their respective HTTP status dynamically.
     *
     * @param ex the exception to evaluate.
     * @return the corresponding HttpStatus for the exception.
     */
    private HttpStatus getHttpStatusForException(Exception ex) {
        if (ex instanceof ProductNotFoundException) {
            return HttpStatus.NOT_FOUND;
        } else if (ex instanceof UnknownHostException) {
            return HttpStatus.SERVICE_UNAVAILABLE;
        } else if (ex instanceof ProductServiceException) {
            return HttpStatus.SERVICE_UNAVAILABLE;
        } 
        return HttpStatus.INTERNAL_SERVER_ERROR; // Default to 500 if no specific mapping exists
    }

    /**
     * Utility method to create an ErrorResponse object with a status and message.
     *
     * @param status  the status of the error (e.g., "ERROR").
     * @param message a descriptive message providing details about the error.
     * @return a new instance of ErrorResponse.
     */
    private ErrorResponse createErrorResponse(String status, String message) {
        return ErrorResponse.builder()
                .status(status)
                .message(message)
                .processedAt(LocalDateTime.now())
                .build();
    }
}
