package K23CNT2_Lesson05.nvmentity;

public class NvmCourse {

    private String nvmCourseId;
    private String nvmCourseName;
    private int nvmDuration;
    private String nvmDescription;

    // ✅ Constructor rỗng — thêm đoạn này vào
    public NvmCourse() {
    }

    // ✅ Constructor đầy đủ (bạn đã có rồi)
    public NvmCourse(String nvmCourseId, String nvmCourseName, int nvmDuration, String nvmDescription) {
        this.nvmCourseId = nvmCourseId;
        this.nvmCourseName = nvmCourseName;
        this.nvmDuration = nvmDuration;
        this.nvmDescription = nvmDescription;
    }

    // Getter & Setter ...
    public String getNvmCourseId() { return nvmCourseId; }
    public void setNvmCourseId(String nvmCourseId) { this.nvmCourseId = nvmCourseId; }

    public String getNvmCourseName() { return nvmCourseName; }
    public void setNvmCourseName(String nvmCourseName) { this.nvmCourseName = nvmCourseName; }

    public int getNvmDuration() { return nvmDuration; }
    public void setNvmDuration(int nvmDuration) { this.nvmDuration = nvmDuration; }

    public String getNvmDescription() { return nvmDescription; }
    public void setNvmDescription(String nvmDescription) { this.nvmDescription = nvmDescription; }
}
