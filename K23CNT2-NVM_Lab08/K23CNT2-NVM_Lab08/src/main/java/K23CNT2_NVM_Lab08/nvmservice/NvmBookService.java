package K23CNT2_NVM_Lab08.nvmservice;

import K23CNT2_NVM_Lab08.nvmentity.NvmBook;
import K23CNT2_NVM_Lab08.nvmrepository.NvmBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NvmBookService {

    @Autowired
    private NvmBookRepository nvmBookRepository;

    public List<NvmBook> getAllNvmBooks() {
        return nvmBookRepository.findAll();
    }

    public NvmBook saveNvmBook(NvmBook nvmBook) {
        return nvmBookRepository.save(nvmBook);
    }

    public NvmBook getNvmBookById(Long nvmId) {
        return nvmBookRepository.findById(nvmId).orElse(null);
    }

    public void deleteNvmBook(Long nvmId) {
        nvmBookRepository.deleteById(nvmId);
    }
}
