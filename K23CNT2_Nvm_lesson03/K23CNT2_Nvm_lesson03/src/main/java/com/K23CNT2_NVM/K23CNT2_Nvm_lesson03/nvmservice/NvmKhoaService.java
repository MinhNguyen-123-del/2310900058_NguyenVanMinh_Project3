package com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmservice;

import com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmentity.NvmKhoa;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class NvmKhoaService {
    private List<NvmKhoa> nvmKhoas = new ArrayList<>();

    public NvmKhoaService() {
        nvmKhoas.addAll(Arrays.asList(
                new NvmKhoa("KH01", "Công nghệ thông tin"),
                new NvmKhoa("KH02", "Kinh tế"),
                new NvmKhoa("KH03", "Ngôn ngữ Anh"),
                new NvmKhoa("KH04", "Điện tử"),
                new NvmKhoa("KH05", "Du lịch")
        ));
    }

    public List<NvmKhoa> getAll() { return nvmKhoas; }

    public NvmKhoa getById(String nvmMaKH) {
        return nvmKhoas.stream().filter(k -> k.getNvmMaKH().equalsIgnoreCase(nvmMaKH)).findFirst().orElse(null);
    }

    public NvmKhoa add(NvmKhoa khoa) {
        nvmKhoas.add(khoa);
        return khoa;
    }

    public NvmKhoa update(String nvmMaKH, NvmKhoa khoa) {
        NvmKhoa old = getById(nvmMaKH);
        if (old != null) {
            old.setNvmTenKH(khoa.getNvmTenKH());
            return old;
        }
        return null;
    }

    public boolean delete(String nvmMaKH) {
        NvmKhoa old = getById(nvmMaKH);
        return nvmKhoas.remove(old);
    }
}
