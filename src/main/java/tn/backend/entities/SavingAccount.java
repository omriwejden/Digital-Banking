package tn.backend.entities;


import lombok.*;


import jakarta.persistence.*;

import java.util.*;
@Entity
@DiscriminatorValue("SA")
@Data @NoArgsConstructor @AllArgsConstructor

public class SavingAccount extends BankAccount  {
	//Taux d'interet
    private double interestRate;

    public Customer getCustomer() {
        return super.getCustomer();
    }

    public void setCustomer(Customer customer) {
        super.setCustomer(customer);
    }
 // Getter
    public double getInterestRate() {
        return interestRate;
    }

    // Setter
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}


