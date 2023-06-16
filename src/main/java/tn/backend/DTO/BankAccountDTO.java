package tn.backend.DTO;

import lombok.Data;

@Data
public class BankAccountDTO {
  protected String type;
  public String getType() {
      return type;
  }

  public void setType(String type) {
      this.type = type;
  }
}
