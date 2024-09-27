package com.cuscatlan.products.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data Transfer Object (DTO) for representing product details.
 * This class is used to transfer product data between layers of the application.
 * <p>
 * Includes product metadata such as title, price, description, category, and image.
 * </p>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    
    /**
     * The unique identifier of the product.
     */
    private Long id;

    /**
     * The title or name of the product.
     */
    private String title;

    /**
     * The price of the product.
     */
    private Double price;

    /**
     * A detailed description of the product.
     */
    private String description;

    /**
     * The category the product belongs to.
     */
    private String category;

    /**
     * A URL or path to an image representing the product.
     */
    private String image;
}
