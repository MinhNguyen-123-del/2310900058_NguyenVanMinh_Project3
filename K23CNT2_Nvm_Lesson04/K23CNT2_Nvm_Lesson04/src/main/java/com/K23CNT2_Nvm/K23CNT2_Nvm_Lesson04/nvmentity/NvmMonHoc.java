package com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmentity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NvmMonHoc {
    String nvmMaMH;
    String nvmTenMH;
    int nvmSoTiet;
}
