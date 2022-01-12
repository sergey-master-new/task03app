package com.example.task03app.dto;

import com.example.task03app.exception.marker.OnCreate;
import com.example.task03app.exception.marker.OnUpdate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    @Null(groups = OnCreate.class, message = "Id should be Null")
    @NotNull(groups = OnUpdate.class, message = "Id should be not Null")

    private Long id;

    @NotBlank(message = "ISBN is mandatory")
    @Pattern(regexp = "^(?=(?:\\D*\\d){10}(?:(?:\\D*\\d){3})?$)[\\d-]+$",
            message = "Incorrect ISBN number entered")
    private String isbn;

    @NotBlank(message = "Book name is mandatory")
    @Size(min = 2, max = 40, message = "Book name should be between 2 and 40 characters")
    private String name;

    @NotNull(message = "Author is mandatory")
    private AuthorDto author;

    @NotNull(message = "The number of pages is mandatory")
    @Positive(message = "Page count should be greater than 0")
    private Integer pageCount;

    @NotNull(message = "Weight is mandatory")
    @Positive(message = "Weight should be greater than 0")
    private Integer weightInGrams;

    @NotNull(message = "Price is mandatory")
    @PositiveOrZero (message = "Price cannot be negative")
    private Integer priceInKopecks;

}
