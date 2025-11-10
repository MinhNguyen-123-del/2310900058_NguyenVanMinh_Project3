package com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmcontroller;

import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmdto.NvmMonHocDTO;
import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmentity.NvmMonHoc;
import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmservice.NvmMonHocService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nvmmonhoc")
public class NvmMonHocController {

    @Autowired
    private NvmMonHocService service;

    @GetMapping("/list")
    public List<NvmMonHoc> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public NvmMonHoc getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<String> add(@Valid @RequestBody NvmMonHocDTO dto) {
        service.create(dto);
        return ResponseEntity.ok("✅ Thêm môn học thành công!");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable String id, @Valid @RequestBody NvmMonHocDTO dto) {
        boolean ok = service.update(id, dto);
        return ok ? ResponseEntity.ok("✅ Cập nhật môn học thành công!") :
                ResponseEntity.badRequest().body("❌ Không tìm thấy môn học!");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok("✅ Xóa môn học thành công!") :
                ResponseEntity.badRequest().body("❌ Không tìm thấy môn học!");
    }
}
