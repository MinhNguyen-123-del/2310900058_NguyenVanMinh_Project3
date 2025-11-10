package com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmcontroller;

import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmdto.NvmUserDTO;
import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmentity.NvmUsers;
import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmservice.NvmUserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/api")
public class NvmUserController {

    @Autowired
    NvmUserService nvmUserService;

    @GetMapping("/userlist")
    public List<NvmUsers> getAllUsers() {
        return nvmUserService.findAll();
    }

    @PostMapping("/add-user")
    public ResponseEntity<String> addUser(@Valid @RequestBody NvmUserDTO userDTO) {
        boolean created = nvmUserService.create(userDTO);
        if (created) {
            return ResponseEntity.ok("✅ User created successfully!");
        } else {
            return ResponseEntity.badRequest().body("❌ Failed to create user!");
        }
    }
}

