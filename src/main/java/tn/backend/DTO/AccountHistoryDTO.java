
package tn.backend.DTO;

import lombok.Data;
import java.util.List;
@Data
public class AccountHistoryDTO {
    private String accountId;
    private double balance;
    private int currentPage;
    private int totalPages;
    private int pageSize;
    private List<AccountOperationDTO> accountOperationDTOS;
 // Getters
    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public List<AccountOperationDTO> getAccountOperationDTOS() {
        return accountOperationDTOS;
    }

    // Setters
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setAccountOperationDTOS(List<AccountOperationDTO> accountOperationDTOS) {
        this.accountOperationDTOS = accountOperationDTOS;
    }
}