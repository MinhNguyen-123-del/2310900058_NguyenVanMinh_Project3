package K23CNT2_NVM_Lab08.nvmentity;

@Entity
@Table(name = "nvm_product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NvmProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nvmId;

    private String nvmName;
    private String nvmImgUrl;
    private Integer nvmQuantity;
    private Double nvmPrice;
    private Boolean nvmIsActive;
}

