package com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmcontroller;

import com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmentity.NvmStudent;
import com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmservice.NvmServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nvmstudent")
public class NvmStudentController {

    @Autowired
    private NvmServiceStudent nvmServiceStudent;

    @GetMapping("/list")
    public List<NvmStudent> getAllStudents() {
        return nvmServiceStudent.getStudents();
    }

    @PostMapping("/add")
    public NvmStudent addStudent(@RequestBody NvmStudent student) {
        return nvmServiceStudent.addStudent(student);
    }

    @GetMapping("/{id}")
    public NvmStudent getStudentById(@PathVariable Long id) {
        return nvmServiceStudent.getStudent(id);
    }
}
