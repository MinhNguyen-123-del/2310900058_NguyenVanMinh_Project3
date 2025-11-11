package K23CNT2_Lesson05.nvmentity;

public class NvmInfo {
    private String nvmName;
    private String nvmDescription;
    private String nvmEmail;
    private String nvmWebsite;

    public NvmInfo(String nvmName, String nvmDescription, String nvmEmail, String nvmWebsite) {
        this.nvmName = nvmName;
        this.nvmDescription = nvmDescription;
        this.nvmEmail = nvmEmail;
        this.nvmWebsite = nvmWebsite;
    }

    // Getters
    public String getNvmName() { return nvmName; }
    public String getNvmDescription() { return nvmDescription; }
    public String getNvmEmail() { return nvmEmail; }
    public String getNvmWebsite() { return nvmWebsite; }

    // Setters (nếu cần)
    public void setNvmName(String nvmName) { this.nvmName = nvmName; }
    public void setNvmDescription(String nvmDescription) { this.nvmDescription = nvmDescription; }
    public void setNvmEmail(String nvmEmail) { this.nvmEmail = nvmEmail; }
    public void setNvmWebsite(String nvmWebsite) { this.nvmWebsite = nvmWebsite; }
}
