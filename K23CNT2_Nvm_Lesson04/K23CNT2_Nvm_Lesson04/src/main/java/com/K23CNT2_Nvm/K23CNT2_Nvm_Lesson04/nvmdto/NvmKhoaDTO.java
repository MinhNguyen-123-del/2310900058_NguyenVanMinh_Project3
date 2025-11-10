package com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmdto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NvmKhoaDTO {
    @NotBlank(message = "Mã khoa không được trống")
    @Size(min = 2, message = "Mã khoa tối thiểu 2 ký tự")
    String nvmMaKH;

    @NotBlank(message = "Tên khoa không được trống")
    @Size(min = 5, max = 25, message = "Tên khoa phải từ 5–25 ký tự")
    String nvmTenKH;
}
