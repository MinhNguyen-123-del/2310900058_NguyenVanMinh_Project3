package K23CNT2_NVM_Lab08.nvmentity;
@Entity
@Table(name = "nvm_configuration")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NvmConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nvmId;

    private String nvmName;
    private Boolean nvmIsActive;
}
