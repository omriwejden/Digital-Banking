package tn.backend.entities;

import tn.backend.enums.*;

import lombok.*;


import jakarta.persistence.*;


import java.util.*;



@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class AccountOperation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate;
    private double amount;
    @Enumerated(EnumType.STRING)
    private OperationType type;
    @ManyToOne
    private BankAccount bankAccount;
    private String description;
 // Getters
    public Long getId() {
        return id;
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public double getAmount() {
        return amount;
    }

    public OperationType getType() {
        return type;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
