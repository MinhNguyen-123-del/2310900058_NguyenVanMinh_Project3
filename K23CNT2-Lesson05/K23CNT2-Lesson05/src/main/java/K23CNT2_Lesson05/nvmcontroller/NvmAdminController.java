package K23CNT2_Lesson05.nvmcontroller;

import K23CNT2_Lesson05.nvmentity.NvmCourse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/nvmadmin")
public class NvmAdminController {

    private List<NvmCourse> nvmCourses = new ArrayList<>();

    public NvmAdminController() {
        nvmCourses.add(new NvmCourse("KH01", "Spring Boot", 40, "Khóa học Java Web với Spring Boot"));
        nvmCourses.add(new NvmCourse("KH02", "ASP.NET Core MVC", 35, "Khóa học .NET cho lập trình viên"));
        nvmCourses.add(new NvmCourse("KH03", "ReactJS Frontend", 30, "Khóa học giao diện hiện đại với ReactJS"));
    }

    @GetMapping("/nvmlist")
    public String nvmList(Model model) {
        model.addAttribute("nvmCourses", nvmCourses);
        return "nvmadmin/nvmlist";
    }

    @GetMapping("/nvmadd")
    public String nvmAddForm(Model model) {
        model.addAttribute("nvmCourse", new NvmCourse());
        return "nvmadmin/nvmadd";
    }

    @PostMapping("/nvmadd")
    public String nvmAddCourse(@ModelAttribute NvmCourse nvmCourse) {
        nvmCourses.add(nvmCourse);
        return "redirect:/nvmadmin/nvmlist";
    }

    @GetMapping("/nvmedit/{nvmId}")
    public String nvmEditForm(@PathVariable String nvmId, Model model) {
        for (NvmCourse c : nvmCourses) {
            if (c.getNvmCourseId().equals(nvmId)) {   // ✅ sửa từ getNvmId() -> getNvmCourseId()
                model.addAttribute("nvmCourse", c);
                break;
            }
        }
        return "nvmadmin/nvmedit";
    }
    // ✅ Xóa khóa học theo mã
    @GetMapping("/nvmdelete/{nvmId}")
    public String nvmDeleteCourse(@PathVariable String nvmId) {
        nvmCourses.removeIf(course -> course.getNvmCourseId().equals(nvmId));
        return "redirect:/nvmadmin/nvmlist";
    }

    @PostMapping("/nvmedit")
    public String nvmUpdateCourse(@ModelAttribute NvmCourse nvmCourse) {
        for (NvmCourse c : nvmCourses) {
            if (c.getNvmCourseId().equals(nvmCourse.getNvmCourseId())) {
                c.setNvmCourseName(nvmCourse.getNvmCourseName());  // ✅ sửa getter thành setter
                c.setNvmDuration(nvmCourse.getNvmDuration());
                c.setNvmDescription(nvmCourse.getNvmDescription());
                break;
            }
        }
        return "redirect:/nvmadmin/nvmlist";  // ✅ thêm return để kết thúc hàm
    }

}
