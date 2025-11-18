package K23CNT2_NVM_Lab08.nvmrepository;

import K23CNT2_NVM_Lab08.nvmentity.NvmBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NvmBookRepository extends JpaRepository<NvmBook, Long> {
}
