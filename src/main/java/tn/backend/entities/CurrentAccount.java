package tn.backend.entities;

import lombok.*;


import jakarta.persistence.*;


import java.util.*;
@Entity

@DiscriminatorValue("CA")
@Data @NoArgsConstructor @AllArgsConstructor

public class CurrentAccount extends BankAccount {
	
	  private double overDraft;
	  public double getOverDraft() {
	        return overDraft;
	    }

	    public void setOverDraft(double overDraft) {
	        this.overDraft = overDraft;
	    }
	
}
