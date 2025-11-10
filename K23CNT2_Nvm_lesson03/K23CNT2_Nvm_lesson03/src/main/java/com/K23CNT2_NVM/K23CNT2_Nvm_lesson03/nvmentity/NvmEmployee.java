package com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmentity;

public class NvmEmployee {
    private Long nvmId;
    private String nvmFullName;
    private String nvmGender;
    private int nvmAge;
    private double nvmSalary;

    public NvmEmployee() {}

    public NvmEmployee(Long nvmId, String nvmFullName, String nvmGender, int nvmAge, double nvmSalary) {
        this.nvmId = nvmId;
        this.nvmFullName = nvmFullName;
        this.nvmGender = nvmGender;
        this.nvmAge = nvmAge;
        this.nvmSalary = nvmSalary;
    }

    public Long getNvmId() { return nvmId; }
    public void setNvmId(Long nvmId) { this.nvmId = nvmId; }

    public String getNvmFullName() { return nvmFullName; }
    public void setNvmFullName(String nvmFullName) { this.nvmFullName = nvmFullName; }

    public String getNvmGender() { return nvmGender; }
    public void setNvmGender(String nvmGender) { this.nvmGender = nvmGender; }

    public int getNvmAge() { return nvmAge; }
    public void setNvmAge(int nvmAge) { this.nvmAge = nvmAge; }

    public double getNvmSalary() { return nvmSalary; }
    public void setNvmSalary(double nvmSalary) { this.nvmSalary = nvmSalary; }
}
