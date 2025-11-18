package K23CNT2_NVM_Lab08.nvmservice;

import K23CNT2_NVM_Lab08.nvmentity.NvmAuthor;
import K23CNT2_NVM_Lab08.nvmrepository.NvmAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NvmAuthorService {

    @Autowired
    private NvmAuthorRepository nvmAuthorRepository;

    public List<NvmAuthor> getAllNvmAuthors() {
        return nvmAuthorRepository.findAll();
    }

    public NvmAuthor saveNvmAuthor(NvmAuthor nvmAuthor) {
        return nvmAuthorRepository.save(nvmAuthor);
    }

    public NvmAuthor getNvmAuthorById(Long nvmId) {
        return nvmAuthorRepository.findById(nvmId).orElse(null);
    }

    public void deleteNvmAuthor(Long nvmId) {
        nvmAuthorRepository.deleteById(nvmId);
    }

    public List<NvmAuthor> findAllNvmAuthorsById(List<Long> nvmIds) {
        return nvmAuthorRepository.findAllById(nvmIds);
    }
}
