package com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmservice;



import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmdto.NvmUserDTO;
import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmentity.NvmUsers;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Service
public class NvmUserService {
    List<NvmUsers> nvm_userList = new ArrayList<>();

    public NvmUserService() {
        nvm_userList.add(new NvmUsers(1L, "nvm_user1", "pass1", "Nguyen Van Minh",
                LocalDate.parse("1990-01-01"), "nvm1@example.com", "0123456789", 34, true));
        nvm_userList.add(new NvmUsers(2L, "nvm_user2", "pass2", "Nguyen Hai Son",
                LocalDate.parse("1992-05-15"), "nvm2@example.com", "0987654321", 32, false));
        nvm_userList.add(new NvmUsers(3L, "nvm_user3", "pass3", "Tran Minh Anh",
                LocalDate.parse("1985-11-22"), "nvm3@example.com", "0912233445", 39, true));
        nvm_userList.add(new NvmUsers(4L, "nvm_user4", "pass4", "Le Bao Quoc",
                LocalDate.parse("1988-03-18"), "nvm4@example.com", "0906677889", 36, true));
        nvm_userList.add(new NvmUsers(5L, "nvm_user5", "pass5", "Pham Chi Hieu",
                LocalDate.parse("1995-09-30"), "nvm5@example.com", "0934432110", 29, false));
    }

    public List<NvmUsers> findAll() {
        return nvm_userList;
    }

    public Boolean create(NvmUserDTO nvmUserDTO) {
        try {
            NvmUsers user = new NvmUsers();
            user.setNvm_id((long) (nvm_userList.stream().count() + 1));
            user.setNvm_username(nvmUserDTO.getNvm_username());
            user.setNvm_password(nvmUserDTO.getNvm_password());
            user.setNvm_fullName(nvmUserDTO.getNvm_fullName());
            user.setNvm_email(nvmUserDTO.getNvm_email());
            user.setNvm_phone(nvmUserDTO.getNvm_phone());
            user.setNvm_birthDay(nvmUserDTO.getNvm_birthDay());
            user.setNvm_age(nvmUserDTO.getNvm_age());
            user.setNvm_status(nvmUserDTO.getNvm_status());

            nvm_userList.add(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
