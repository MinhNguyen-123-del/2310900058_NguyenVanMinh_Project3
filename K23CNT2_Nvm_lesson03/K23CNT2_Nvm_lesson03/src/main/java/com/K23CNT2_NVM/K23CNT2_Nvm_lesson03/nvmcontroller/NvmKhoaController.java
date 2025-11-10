package com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmcontroller;

import com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmentity.NvmKhoa;
import com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmservice.NvmKhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/nvmkhoa")
public class NvmKhoaController {

    @Autowired
    private NvmKhoaService service;

    @GetMapping("/list")
    public List<NvmKhoa> getAll() { return service.getAll(); }

    @GetMapping("/{id}")
    public NvmKhoa getById(@PathVariable String id) { return service.getById(id); }

    @PostMapping("/add")
    public NvmKhoa add(@RequestBody NvmKhoa khoa) { return service.add(khoa); }

    @PutMapping("/{id}")
    public NvmKhoa update(@PathVariable String id, @RequestBody NvmKhoa khoa) { return service.update(id, khoa); }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable String id) { return service.delete(id); }
}
