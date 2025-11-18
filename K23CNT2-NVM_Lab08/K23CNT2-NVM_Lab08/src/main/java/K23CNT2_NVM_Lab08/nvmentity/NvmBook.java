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
public class NvmBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long nvmId;

    private String nvmCode;

    private String nvmName;

    private String nvmDescription;

    private String nvmImgUrl;

    private Integer nvmQuantity;

    private Double nvmPrice;

    private Boolean nvmIsActive;

    // Many-to-Many với Author
    @ManyToMany
    @JoinTable(
            name = "NvmBook_Author",
            joinColumns = @JoinColumn(name = "nvmBookId"),
            inverseJoinColumns = @JoinColumn(name = "nvmAuthorId")
    )
    private List<NvmAuthor> nvmAuthors = new ArrayList<>();
}
