package com.turkcell.spring.into.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddCategoryRequest {

    @NotBlank(message = "Bu değer boş geçilemez")
    @Size(min = 2,max = 50,message = "Minimum 2 maksimum 50 karakter girişi yapınız.")
    private String categoryName;
}
