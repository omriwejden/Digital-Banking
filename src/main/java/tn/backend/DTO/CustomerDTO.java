package tn.backend.DTO;

import lombok.Data;

@Data
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
    public void setId(Long id) {
        this.id = id;
    }
}