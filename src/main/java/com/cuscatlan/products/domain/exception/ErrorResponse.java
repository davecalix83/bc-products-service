package com.cuscatlan.products.domain.exception;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a standard error response that is returned in case of an exception in the application.
 * <p>
 * This class provides a simple structure for sending meaningful error messages back to the client,
 * encapsulating the status of the error, a descriptive message, and the time the error was processed.
 * </p>
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {

    /**
     * The status of the error (e.g., "ERROR", "FAILURE").
     */
    private String status;

    /**
     * A descriptive message providing details about the error.
     */
    private String message;

    /**
     * The timestamp indicating when the error was processed.
     */
    private LocalDateTime processedAt;
}
