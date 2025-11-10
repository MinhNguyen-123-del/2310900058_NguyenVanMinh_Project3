package com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmentity;

public class NvmKhoa {
    private String nvmMaKH;
    private String nvmTenKH;

    public NvmKhoa() {}

    public NvmKhoa(String nvmMaKH, String nvmTenKH) {
        this.nvmMaKH = nvmMaKH;
        this.nvmTenKH = nvmTenKH;
    }

    public String getNvmMaKH() { return nvmMaKH; }
    public void setNvmMaKH(String nvmMaKH) { this.nvmMaKH = nvmMaKH; }

    public String getNvmTenKH() { return nvmTenKH; }
    public void setNvmTenKH(String nvmTenKH) { this.nvmTenKH = nvmTenKH; }
}
