package com.tvt.iasf.login;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity(name = "staffs")
@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String password;
    private String onboard;
    private Boolean isAdmin;

    @ManyToOne
    private Department department;

    private BigDecimal salary;


}
