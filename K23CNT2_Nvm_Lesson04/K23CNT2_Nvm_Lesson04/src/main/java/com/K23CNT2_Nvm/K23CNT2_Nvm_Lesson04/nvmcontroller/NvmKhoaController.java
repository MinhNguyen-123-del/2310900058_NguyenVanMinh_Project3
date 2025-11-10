package com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmcontroller;

import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmdto.NvmKhoaDTO;
import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmentity.NvmKhoa;
import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmservice.NvmKhoaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/nvmkhoa")
public class NvmKhoaController {

    @Autowired
    private NvmKhoaService service;

    @GetMapping("/list")
    public List<NvmKhoa> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public NvmKhoa getById(@PathVariable String id) { return service.findById(id); }

    @PostMapping("/add")
    public ResponseEntity<String> add(@Valid @RequestBody NvmKhoaDTO dto) {
        service.create(dto);
        return ResponseEntity.ok("✅ Thêm khoa thành công!");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable String id, @Valid @RequestBody NvmKhoaDTO dto) {
        boolean ok = service.update(id, dto);
        return ok ? ResponseEntity.ok("✅ Sửa khoa thành công!") :
                ResponseEntity.badRequest().body("❌ Không tìm thấy khoa!");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok("✅ Xóa khoa thành công!") :
                ResponseEntity.badRequest().body("❌ Không tìm thấy khoa!");
    }
}

