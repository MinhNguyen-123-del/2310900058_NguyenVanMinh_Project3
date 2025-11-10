package com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmservice;

import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmdto.NvmEmployeeDTO;
import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmentity.NvmEmployee;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class NvmEmployeeService {
    private List<NvmEmployee> empList = new ArrayList<>();

    public NvmEmployeeService() {
        empList.add(new NvmEmployee(1L, "Nguyen Van A", "Nam", 28, 1200.5));
        empList.add(new NvmEmployee(2L, "Tran Thi B", "Nữ", 32, 1500.0));
        empList.add(new NvmEmployee(3L, "Pham Van C", "Nam", 40, 2000.0));
    }

    public List<NvmEmployee> findAll() { return empList; }

    public NvmEmployee findById(Long id) {
        return empList.stream().filter(e -> e.getNvmId().equals(id)).findFirst().orElse(null);
    }

    public boolean create(NvmEmployeeDTO dto) {
        empList.add(new NvmEmployee(dto.getNvmId(), dto.getNvmFullName(), dto.getNvmGender(), dto.getNvmAge(), dto.getNvmSalary()));
        return true;
    }

    public boolean update(Long id, NvmEmployeeDTO dto) {
        for (NvmEmployee e : empList) {
            if (e.getNvmId().equals(id)) {
                e.setNvmFullName(dto.getNvmFullName());
                e.setNvmGender(dto.getNvmGender());
                e.setNvmAge(dto.getNvmAge());
                e.setNvmSalary(dto.getNvmSalary());
                return true;
            }
        }
        return false;
    }

    public boolean delete(Long id) {
        return empList.removeIf(e -> e.getNvmId().equals(id));
    }
}
