package com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmdto;

import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NvmMonHocDTO {
    @NotBlank(message = "Mã môn học không được trống")
    @Size(min = 2, max = 5, message = "Mã môn học từ 2–5 ký tự")
    String nvmMaMH;

    @NotBlank(message = "Tên môn học không được trống")
    @Size(min = 5, max = 50, message = "Tên môn học từ 5–50 ký tự")
    String nvmTenMH;

    @Min(value = 45, message = "Số tiết ít nhất 45")
    @Max(value = 75, message = "Số tiết tối đa 75")
    int nvmSoTiet;
}
