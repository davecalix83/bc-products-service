package com.cuscatlan.products.domain.exception;

/**
 * Exception thrown when a product with the specified ID is not found.
 * <p>
 * This exception provides a more meaningful error message to the user, 
 * indicating that the product with the given ID could not be found.
 * </p>
 * 
 * @author hguzman
 */
public class ProductNotFoundException extends RuntimeException {

    /**
     * Constructs a new {@code ProductNotFoundException} with a detailed message 
     * containing the product ID that caused the exception.
     *
     * @param productId the ID of the product that was not found.
     */
    public ProductNotFoundException(Long productId) {
        super(String.format("Product with ID %d not found.", productId));
    }
}
