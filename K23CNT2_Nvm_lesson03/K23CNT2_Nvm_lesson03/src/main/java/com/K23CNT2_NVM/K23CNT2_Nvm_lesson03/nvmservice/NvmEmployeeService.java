package com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmservice;

import com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmentity.NvmEmployee;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class NvmEmployeeService {
    private List<NvmEmployee> nvmEmployees = new ArrayList<>();

    public NvmEmployeeService() {
        nvmEmployees.addAll(Arrays.asList(
                new NvmEmployee(1L, "Nguyễn Văn Minh", "Nam", 25, 1200.0),
                new NvmEmployee(2L, "Nguyễn Hải Sơn", "Nam", 23, 1100.0),
                new NvmEmployee(3L, "Trần Thị Hoa", "Nữ", 26, 1300.0),
                new NvmEmployee(4L, "Phạm Thị Mai", "Nữ", 27, 1500.0),
                new NvmEmployee(5L, "Vũ Đức Long", "Nam", 29, 1400.0)
        ));
    }

    public List<NvmEmployee> getAll() { return nvmEmployees; }

    public NvmEmployee getById(Long id) {
        return nvmEmployees.stream().filter(e -> e.getNvmId().equals(id)).findFirst().orElse(null);
    }

    public NvmEmployee add(NvmEmployee emp) {
        nvmEmployees.add(emp);
        return emp;
    }

    public NvmEmployee update(Long id, NvmEmployee emp) {
        NvmEmployee old = getById(id);
        if (old != null) {
            old.setNvmFullName(emp.getNvmFullName());
            old.setNvmGender(emp.getNvmGender());
            old.setNvmAge(emp.getNvmAge());
            old.setNvmSalary(emp.getNvmSalary());
            return old;
        }
        return null;
    }

    public boolean delete(Long id) {
        NvmEmployee old = getById(id);
        return nvmEmployees.remove(old);
    }
}
