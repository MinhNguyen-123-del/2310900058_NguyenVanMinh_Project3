package com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmcontroller;

import com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmentity.NvmMonHoc;
import com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmservice.NvmMonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/nvmmonhoc")
public class NvmMonHocController {

    @Autowired
    private NvmMonHocService service;

    @GetMapping("/list")
    public List<NvmMonHoc> getAll() { return service.getAll(); }

    @GetMapping("/{id}")
    public NvmMonHoc getById(@PathVariable String id) { return service.getById(id); }

    @PostMapping("/add")
    public NvmMonHoc add(@RequestBody NvmMonHoc mh) { return service.add(mh); }

    @PutMapping("/{id}")
    public NvmMonHoc update(@PathVariable String id, @RequestBody NvmMonHoc mh) { return service.update(id, mh); }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable String id) { return service.delete(id); }
}
