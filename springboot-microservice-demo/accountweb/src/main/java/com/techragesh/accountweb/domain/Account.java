package com.techragesh.accountweb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {

    private Integer accountId;

    private Integer amount;

    private String accountName;

}
