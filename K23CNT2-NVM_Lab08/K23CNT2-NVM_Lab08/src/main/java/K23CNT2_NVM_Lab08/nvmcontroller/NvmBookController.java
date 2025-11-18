package K23CNT2_NVM_Lab08.nvmcontroller;

import K23CNT2_NVM_Lab08.nvmentity.NvmBook;
import K23CNT2_NVM_Lab08.nvmentity.NvmAuthor;
import K23CNT2_NVM_Lab08.nvmservice.NvmBookService;
import K23CNT2_NVM_Lab08.nvmservice.NvmAuthorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/nvmbooks")
public class NvmBookController {

    @Autowired
    private NvmBookService nvmBookService;

    @Autowired
    private NvmAuthorService nvmAuthorService;

    // Thư mục upload ảnh đúng cho Spring Boot
    private static final String UPLOAD_FOLDER = "src/main/resources/static/images/products/";

    // ================================
    // HIỂN THỊ DANH SÁCH SÁCH
    // ================================
    @GetMapping
    public String listNvmBooks(Model model) {
        model.addAttribute("books", nvmBookService.getAllNvmBooks());
        return "nvmbooks/nvmbook-list";
    }

    // ================================
    // FORM THÊM SÁCH
    // ================================
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("book", new NvmBook());
        model.addAttribute("authors", nvmAuthorService.getAllNvmAuthors());
        return "nvmbooks/nvmbook-form";
    }

    // ================================
    // LƯU SÁCH
    // ================================
    @PostMapping("/new")
    public String saveNvmBook(
            @ModelAttribute NvmBook nvmBook,
            @RequestParam List<Long> authorIds,
            @RequestParam("imageBook") MultipartFile imageFile
    ) {
        try {
            if (!imageFile.isEmpty()) {

                // Tạo thư mục nếu chưa có
                Path uploadPath = Paths.get(UPLOAD_FOLDER);
                if (!Files.exists(uploadPath)) {
                    Files.createDirectories(uploadPath);
                }

                // Lấy tên file gốc
                String originalFilename = StringUtils.cleanPath(imageFile.getOriginalFilename());
                String fileExt = originalFilename.substring(originalFilename.lastIndexOf("."));

                // Tạo tên file mới
                String newFileName = nvmBook.getNvmCode() + fileExt;
                Path filePath = uploadPath.resolve(newFileName);

                // Lưu file
                Files.copy(imageFile.getInputStream(), filePath);

                // Lưu đường dẫn ảnh đúng cho HTML
                nvmBook.setNvmImgUrl("/images/products/" + newFileName);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Set danh sách tác giả
        List<NvmAuthor> authors = new ArrayList<>(nvmAuthorService.findAllNvmAuthorsById(authorIds));
        nvmBook.setNvmAuthors(authors);

        nvmBookService.saveNvmBook(nvmBook);

        return "redirect:/nvmbooks";
    }

    // ================================
    // FORM SỬA SÁCH
    // ================================
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        NvmBook book = nvmBookService.getNvmBookById(id);
        model.addAttribute("book", book);
        model.addAttribute("authors", nvmAuthorService.getAllNvmAuthors());
        return "nvmbooks/nvmbook-form";
    }

    // ================================
    // XÓA SÁCH
    // ================================
    @GetMapping("/delete/{id}")
    public String deleteNvmBook(@PathVariable Long id) {
        nvmBookService.deleteNvmBook(id);
        return "redirect:/nvmbooks";
    }
}
