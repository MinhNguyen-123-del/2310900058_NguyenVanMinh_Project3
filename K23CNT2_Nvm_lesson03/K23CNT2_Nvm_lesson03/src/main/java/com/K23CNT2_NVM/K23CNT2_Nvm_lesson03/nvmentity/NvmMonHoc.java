package com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmentity;

public class NvmMonHoc {
    private String nvmMaMH;
    private String nvmTenMH;
    private int nvmSoTiet;

    public NvmMonHoc() {}

    public NvmMonHoc(String nvmMaMH, String nvmTenMH, int nvmSoTiet) {
        this.nvmMaMH = nvmMaMH;
        this.nvmTenMH = nvmTenMH;
        this.nvmSoTiet = nvmSoTiet;
    }

    public String getNvmMaMH() { return nvmMaMH; }
    public void setNvmMaMH(String nvmMaMH) { this.nvmMaMH = nvmMaMH; }

    public String getNvmTenMH() { return nvmTenMH; }
    public void setNvmTenMH(String nvmTenMH) { this.nvmTenMH = nvmTenMH; }

    public int getNvmSoTiet() { return nvmSoTiet; }
    public void setNvmSoTiet(int nvmSoTiet) { this.nvmSoTiet = nvmSoTiet; }
}
