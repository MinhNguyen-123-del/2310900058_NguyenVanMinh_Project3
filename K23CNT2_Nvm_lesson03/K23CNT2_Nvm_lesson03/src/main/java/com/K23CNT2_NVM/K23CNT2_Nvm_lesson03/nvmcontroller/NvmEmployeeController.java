package com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmcontroller;

import com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmentity.NvmEmployee;
import com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmservice.NvmEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/nvmemployee")
public class NvmEmployeeController {

    @Autowired
    private NvmEmployeeService service;

    // ✅ GET toàn bộ
    @GetMapping("/list")
    public List<NvmEmployee> getAll() {
        return service.getAll();
    }

    // ✅ GET theo id (phải đặt sau /list, /add,... để tránh nhầm)
    @GetMapping("/detail/{id}")
    public NvmEmployee getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // ✅ POST thêm mới
    @PostMapping("/add")
    public NvmEmployee add(@RequestBody NvmEmployee emp) {
        return service.add(emp);
    }

    // ✅ PUT cập nhật
    @PutMapping("/update/{id}")
    public NvmEmployee update(@PathVariable Long id, @RequestBody NvmEmployee emp) {
        return service.update(id, emp);
    }

    // ✅ DELETE
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
