package K23CNT2_NVM_Lab08.nvmentity;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NvmAuthor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long nvmId;

    private String nvmCode;

    private String nvmName;

    private String nvmDescription;

    private String nvmImgUrl;

    private String nvmEmail;

    private String nvmPhone;

    private String nvmAddress;

    private Boolean nvmIsActive;

    // Many-to-Many với NvmBook
    @ManyToMany(mappedBy = "nvmAuthors")
    private List<NvmBook> nvmBooks = new ArrayList<>();
}
