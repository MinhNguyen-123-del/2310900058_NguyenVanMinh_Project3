package com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmservice;

import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmdto.NvmMonHocDTO;
import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmentity.NvmMonHoc;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class NvmMonHocService {
    private List<NvmMonHoc> monList = new ArrayList<>();

    public NvmMonHocService() {
        monList.add(new NvmMonHoc("MH01", "Lập trình Java", 60));
        monList.add(new NvmMonHoc("MH02", "Cơ sở dữ liệu", 45));
        monList.add(new NvmMonHoc("MH03", "Mạng máy tính", 70));
        monList.add(new NvmMonHoc("MH04", "Phân tích thiết kế HTTT", 75));
    }

    public List<NvmMonHoc> findAll() { return monList; }

    public NvmMonHoc findById(String id) {
        return monList.stream().filter(m -> m.getNvmMaMH().equalsIgnoreCase(id)).findFirst().orElse(null);
    }

    public boolean create(NvmMonHocDTO dto) {
        monList.add(new NvmMonHoc(dto.getNvmMaMH(), dto.getNvmTenMH(), dto.getNvmSoTiet()));
        return true;
    }

    public boolean update(String id, NvmMonHocDTO dto) {
        for (NvmMonHoc m : monList) {
            if (m.getNvmMaMH().equalsIgnoreCase(id)) {
                m.setNvmTenMH(dto.getNvmTenMH());
                m.setNvmSoTiet(dto.getNvmSoTiet());
                return true;
            }
        }
        return false;
    }

    public boolean delete(String id) {
        return monList.removeIf(m -> m.getNvmMaMH().equalsIgnoreCase(id));
    }
}
