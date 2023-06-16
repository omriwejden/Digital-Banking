package tn.backend.entities;
import tn.backend.enums.*;
import lombok.*;


import jakarta.persistence.*;

import java.util.*;


@Entity
//stocker tous les classes fils de cette classe dans une seule table
//puisque chaque table fils a moins d'attributs
/**
 * Single table
 * table per class
 * Joined table
 */
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",length = 4)
@Data @NoArgsConstructor @AllArgsConstructor
public class BankAccount {
	@Id
	    private String id;
	    private double balance;
	    private Date createAt;
	    @Enumerated(EnumType.STRING)
	    private AccountStatus status;
	    @ManyToOne
		protected  Customer customer;
	    @OneToMany(mappedBy = "bankAccount",fetch = FetchType.LAZY)
	    private List<AccountOperation> accountOperations;
	
	 // Getters
	    public String getId() {
	        return id;
	    }
	    
	    public double getBalance() {
	        return balance;
	    }
	    
	    public Date getCreateAt() {
	        return createAt;
	    }
	    
	    public AccountStatus getStatus() {
	        return status;
	    }
	    
	    // Setters
	    public void setId(String id) {
	        this.id = id;
	    }
	    
	    public void setBalance(double balance) {
	        this.balance = balance;
	    }
	    
	    public void setCreateAt(Date createAt) {
	        this.createAt = createAt;
	    }
	    
	    public void setStatus(AccountStatus status) {
	        this.status = status;
	    }
	    public Customer getCustomer() {
	        return customer;
	    }

	    public void setCustomer(Customer customer) {
	        this.customer = customer;
	    }
}
