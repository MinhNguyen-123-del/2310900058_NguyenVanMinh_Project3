package com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmdto;

import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NvmEmployeeDTO {
    Long nvmId;

    @NotBlank(message = "Họ tên không được trống")
    @Size(min = 3, max = 25, message = "Tên phải từ 3–25 ký tự")
    String nvmFullName;

    @NotBlank(message = "Giới tính không được trống")
    String nvmGender;

    @Min(value = 18, message = "Tuổi tối thiểu là 18")
    @Max(value = 60, message = "Tuổi tối đa là 60")
    int nvmAge;

    @Positive(message = "Lương phải > 0")
    double nvmSalary;
}
