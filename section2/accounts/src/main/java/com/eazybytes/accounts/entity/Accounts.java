package com.eazybytes.accounts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Accounts extends BaseEntity{

    private long customerId;

    @Id
    private long accountNumber;

    private String accountType;

    private String branchAddress;
}
