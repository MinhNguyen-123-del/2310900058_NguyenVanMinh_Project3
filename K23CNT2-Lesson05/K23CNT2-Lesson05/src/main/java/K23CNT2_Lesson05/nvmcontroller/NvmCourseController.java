package K23CNT2_Lesson05.nvmcontroller;

import K23CNT2_Lesson05.nvmentity.NvmCourse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class NvmCourseController {

    @GetMapping("/nvmcourses")
    public String showCourses(Model model) {
        List<NvmCourse> nvmCourses = new ArrayList<>();

        nvmCourses.add(new NvmCourse("C001", "Lập trình Java Spring Boot", 40,
                "Khóa học giúp bạn làm chủ framework Spring Boot từ cơ bản đến nâng cao."));
        nvmCourses.add(new NvmCourse("C002", "Lập trình Web ASP.NET Core MVC", 36,
                "Xây dựng ứng dụng web MVC hiện đại với .NET 8 và Razor."));
        nvmCourses.add(new NvmCourse("C003", "Cơ sở dữ liệu MySQL nâng cao", 32,
                "Khóa học tập trung vào tối ưu truy vấn và thiết kế CSDL."));
        nvmCourses.add(new NvmCourse("C004", "Frontend với ReactJS", 30,
                "Học cách tạo giao diện người dùng động với ReactJS và Bootstrap."));

        model.addAttribute("nvmCourses", nvmCourses);
        return "nvmcourses";  // => /templates/nvmcourses.html
    }
}
