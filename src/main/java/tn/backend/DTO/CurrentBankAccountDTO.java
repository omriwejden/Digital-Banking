package tn.backend.DTO;

import lombok.Data;
import tn.backend.enums.AccountStatus;

import java.util.Date;

@Data
public class CurrentBankAccountDTO extends BankAccountDTO{
    private String id;
    private double balance;
    private Date createAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double overDraft;
    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }
    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

}