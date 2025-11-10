package com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmentity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Getter
@Setter
public class NvmUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long nvm_id;

    String nvm_username;
    String nvm_password;
    String nvm_fullName;
    LocalDate nvm_birthDay;
    String nvm_email;
    String nvm_phone;
    int nvm_age;
    Boolean nvm_status;
}
