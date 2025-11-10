package com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmservice;

import com.K23CNT2_NVM.K23CNT2_Nvm_lesson03.nvmentity.NvmStudent;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Service class: NvmServiceStudent
 * <p>Lớp dịch vụ thực hiện các chức năng thao tác với List Object NvmStudent</p>
 *
 * @author Nguyễn
 * @version 1.0
 */
@Service
public class NvmServiceStudent {

    private List<NvmStudent> students = new ArrayList<>();

    public NvmServiceStudent() {
        students.addAll(Arrays.asList(
                new NvmStudent(1L, "Devmaster 1", 20, "Nam", "Số 25 VNP", "0978611889", "chungtrinh@gmail.com"),
                new NvmStudent(2L, "Devmaster 2", 25, "Nữ", "Số 27 VNP", "0978611889", "contact@devmaster.edu.vn"),
                new NvmStudent(3L, "Devmaster 3", 22, "Nam", "Số 29 VNP", "0978611889", "student3@gmail.com")
        ));
    }

    // ✅ Lấy toàn bộ danh sách sinh viên
    public List<NvmStudent> getStudents() {
        return students;
    }

    // ✅ Lấy sinh viên theo ID
    public NvmStudent getStudent(Long id) {
        return students.stream()
                .filter(s -> s.getNvmId().equals(id))
                .findFirst().orElse(null);
    }

    // ✅ Thêm sinh viên mới
    public NvmStudent addStudent(NvmStudent s) {
        students.add(s);
        return s;
    }

    // ✅ Cập nhật thông tin sinh viên
    public NvmStudent updateStudent(Long id, NvmStudent s) {
        NvmStudent existing = getStudent(id);
        if (existing == null) {
            return null;
        }
        existing.setNvmName(s.getNvmName());
        existing.setNvmAge(s.getNvmAge());
        existing.setNvmGender(s.getNvmGender());
        existing.setNvmAddress(s.getNvmAddress());
        existing.setNvmPhone(s.getNvmPhone());
        existing.setNvmEmail(s.getNvmEmail());
        return existing;
    }

    // ✅ Xóa sinh viên theo ID
    public boolean deleteStudent(Long id) {
        NvmStudent s = getStudent(id);
        return students.remove(s);
    }
}
