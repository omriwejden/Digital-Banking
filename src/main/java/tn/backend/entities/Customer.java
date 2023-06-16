package tn.backend.entities;



import lombok.*;


import jakarta.persistence.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;



@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Customer {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    //Client peut avoir plusieurs comptes
    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    //annotation qui fait la serialisation des objets en json
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<BankAccount> bankAccounts;
}
