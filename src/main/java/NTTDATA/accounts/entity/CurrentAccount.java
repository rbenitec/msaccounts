package NTTDATA.accounts.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "CurrentAccount")
public class CurrentAccount {

    @Id
    private String id;
    private String nroAccount;
    private double availableBalance;
    private int commission;            // Sin limites de movimientos
    private String clientId;

}
