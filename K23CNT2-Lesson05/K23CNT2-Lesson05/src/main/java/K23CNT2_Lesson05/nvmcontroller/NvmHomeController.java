package K23CNT2_Lesson05.nvmcontroller;

import K23CNT2_Lesson05.nvmentity.NvmInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class NvmHomeController {

    // ✅ Trang chủ
    @GetMapping("/")
    public String index() {
        return "nvmindex";  // => templates/nvmindex.html
    }

    // ✅ Trang giới thiệu
    @GetMapping("/nvmabout")
    public String about() {
        return "nvmabout";  // => templates/nvmabout.html
    }

    // ✅ Trang hồ sơ Devmaster + Minh
    @GetMapping("/nvmprofile")
    public String nvmProfile(Model model) {
        List<NvmInfo> nvmProfiles = new ArrayList<>();

        nvmProfiles.add(new NvmInfo(
                "Devmaster Academy",
                "Trung tâm đào tạo CNTT chuyên sâu",
                "contact@devmaster.edu.vn",
                "https://devmaster.edu.vn"
        ));

        nvmProfiles.add(new NvmInfo(
                "Nguyễn Văn Minh",
                "Học viên lớp K23CNT2",
                "2310900068@student.nttu.edu.vn",
                "https://www.ntt.edu.vn"
        ));

        model.addAttribute("nvmProfiles", nvmProfiles);
        return "nvmprofile"; // => templates/nvmprofile.html
    }
}
