package K23CNT2_NVM_Lab08.nvmrepository;

import K23CNT2_NVM_Lab08.nvmentity.NvmAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NvmAuthorRepository extends JpaRepository<NvmAuthor, Long> {
}
