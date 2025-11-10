package com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmcontroller;

import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmdto.NvmEmployeeDTO;
import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmentity.NvmEmployee;
import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmservice.NvmEmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nvmemployee")
public class NvmEmployeeController {

    @Autowired
    private NvmEmployeeService service;

    @GetMapping("/list")
    public List<NvmEmployee> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public NvmEmployee getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<String> add(@Valid @RequestBody NvmEmployeeDTO dto) {
        service.create(dto);
        return ResponseEntity.ok("✅ Thêm nhân viên thành công!");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @Valid @RequestBody NvmEmployeeDTO dto) {
        boolean ok = service.update(id, dto);
        return ok ? ResponseEntity.ok("✅ Cập nhật nhân viên thành công!") :
                ResponseEntity.badRequest().body("❌ Không tìm thấy nhân viên!");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok("✅ Xóa nhân viên thành công!") :
                ResponseEntity.badRequest().body("❌ Không tìm thấy nhân viên!");
    }
}
