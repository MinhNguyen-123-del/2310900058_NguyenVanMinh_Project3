package com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmservice;

import com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmentity.NvmMonHoc;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class NvmMonHocService {
    private List<NvmMonHoc> nvmMonHocs = new ArrayList<>();

    public NvmMonHocService() {
        nvmMonHocs.addAll(Arrays.asList(
                new NvmMonHoc("MH01", "Lập trình Java", 45),
                new NvmMonHoc("MH02", "Cơ sở dữ liệu", 60),
                new NvmMonHoc("MH03", "Mạng máy tính", 50),
                new NvmMonHoc("MH04", "Toán cao cấp", 40),
                new NvmMonHoc("MH05", "Cấu trúc dữ liệu", 55)
        ));
    }

    public List<NvmMonHoc> getAll() { return nvmMonHocs; }

    public NvmMonHoc getById(String nvmMaMH) {
        return nvmMonHocs.stream().filter(m -> m.getNvmMaMH().equalsIgnoreCase(nvmMaMH)).findFirst().orElse(null);
    }

    public NvmMonHoc add(NvmMonHoc mh) {
        nvmMonHocs.add(mh);
        return mh;
    }

    public NvmMonHoc update(String nvmMaMH, NvmMonHoc mh) {
        NvmMonHoc old = getById(nvmMaMH);
        if (old != null) {
            old.setNvmTenMH(mh.getNvmTenMH());
            old.setNvmSoTiet(mh.getNvmSoTiet());
            return old;
        }
        return null;
    }

    public boolean delete(String nvmMaMH) {
        NvmMonHoc old = getById(nvmMaMH);
        return nvmMonHocs.remove(old);
    }
}
