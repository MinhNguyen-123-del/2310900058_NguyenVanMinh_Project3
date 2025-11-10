package com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmentity;


public class NvmStudent {
    Long nvmId;
    String nvmName;
    int nvmAge;
    String nvmGender;
    String nvmAddress;
    String nvmPhone;
    String nvmEmail;

    // Constructor mặc định
    public NvmStudent() {
    }

    // Constructor đầy đủ tham số
    public NvmStudent(Long nvmId, String nvmName, int nvmAge, String nvmGender,
                      String nvmAddress, String nvmPhone, String nvmEmail) {
        this.nvmId = nvmId;
        this.nvmName = nvmName;
        this.nvmAge = nvmAge;
        this.nvmGender = nvmGender;
        this.nvmAddress = nvmAddress;
        this.nvmPhone = nvmPhone;
        this.nvmEmail = nvmEmail;
    }

    // Getter & Setter
    public Long getNvmId() {
        return nvmId;
    }

    public void setNvmId(Long nvmId) {
        this.nvmId = nvmId;
    }

    public String getNvmName() {
        return nvmName;
    }

    public void setNvmName(String nvmName) {
        this.nvmName = nvmName;
    }

    public int getNvmAge() {
        return nvmAge;
    }

    public void setNvmAge(int nvmAge) {
        this.nvmAge = nvmAge;
    }

    public String getNvmGender() {
        return nvmGender;
    }

    public void setNvmGender(String nvmGender) {
        this.nvmGender = nvmGender;
    }

    public String getNvmAddress() {
        return nvmAddress;
    }

    public void setNvmAddress(String nvmAddress) {
        this.nvmAddress = nvmAddress;
    }

    public String getNvmPhone() {
        return nvmPhone;
    }

    public void setNvmPhone(String nvmPhone) {
        this.nvmPhone = nvmPhone;
    }

    public String getNvmEmail() {
        return nvmEmail;
    }

    public void setNvmEmail(String nvmEmail) {
        this.nvmEmail = nvmEmail;
    }

    @Override
    public String toString() {
        return "NvmStudent{" +
                "nvmId=" + nvmId +
                ", nvmName='" + nvmName + '\'' +
                ", nvmAge=" + nvmAge +
                ", nvmGender='" + nvmGender + '\'' +
                ", nvmAddress='" + nvmAddress + '\'' +
                ", nvmPhone='" + nvmPhone + '\'' +
                ", nvmEmail='" + nvmEmail + '\'' +
                '}';
    }
}
