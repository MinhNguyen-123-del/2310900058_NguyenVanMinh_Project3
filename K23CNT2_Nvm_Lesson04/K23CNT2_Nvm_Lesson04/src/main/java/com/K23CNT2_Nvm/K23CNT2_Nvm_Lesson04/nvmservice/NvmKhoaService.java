package com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmservice;

import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmdto.NvmKhoaDTO;
import com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04.nvmentity.NvmKhoa;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class NvmKhoaService {
    private List<NvmKhoa> khoaList = new ArrayList<>();

    public NvmKhoaService() {
        khoaList.add(new NvmKhoa("KH01", "Công nghệ thông tin"));
        khoaList.add(new NvmKhoa("KH02", "Kinh tế"));
        khoaList.add(new NvmKhoa("KH03", "Ngoại ngữ"));
        khoaList.add(new NvmKhoa("KH04", "Du lịch"));
        khoaList.add(new NvmKhoa("KH05", "Điện - Điện tử"));
    }

    public List<NvmKhoa> findAll() { return khoaList; }

    public NvmKhoa findById(String id) {
        return khoaList.stream().filter(k -> k.getNvmMaKH().equalsIgnoreCase(id)).findFirst().orElse(null);
    }

    public boolean create(NvmKhoaDTO dto) {
        khoaList.add(new NvmKhoa(dto.getNvmMaKH(), dto.getNvmTenKH()));
        return true;
    }

    public boolean update(String id, NvmKhoaDTO dto) {
        for (NvmKhoa k : khoaList) {
            if (k.getNvmMaKH().equalsIgnoreCase(id)) {
                k.setNvmTenKH(dto.getNvmTenKH());
                return true;
            }
        }
        return false;
    }

    public boolean delete(String id) {
        return khoaList.removeIf(k -> k.getNvmMaKH().equalsIgnoreCase(id));
    }
}
