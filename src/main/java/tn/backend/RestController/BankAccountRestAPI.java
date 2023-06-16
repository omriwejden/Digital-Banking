package tn.backend.RestController;

import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import tn.backend.DTO.*;
import tn.backend.services.*;
import tn.backend.exceptions.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class BankAccountRestAPI {
    private BankAccountService bankAccountService;

    @GetMapping("/accounts/{accountId}")
    public BankAccountDTO getBankAccount(@PathVariable String accountId) throws BankAccountNotFoundException {
        return bankAccountService.getBankAccount(accountId);
    }
    @GetMapping("/accounts")
    public List<BankAccountDTO> listAccounts(){
        return bankAccountService.bankAccountList();
    }
    @GetMapping("/accounts/{accountId}/pageOperations")
    public AccountHistoryDTO getAccountHistory(@PathVariable  String accountId,
                                               @RequestParam(name = "page",defaultValue = "0") int page,
                                               @RequestParam(name = "size",defaultValue = "5")int size) throws BankAccountNotFoundException {
        return bankAccountService.getAccountHistory(accountId,page,size);
    }
    @GetMapping("/accounts/{idAccount}/operations")
    public List<AccountOperationDTO> getHistory(@PathVariable String idAccount){
        return bankAccountService.accountHistory(idAccount);
    }
}

