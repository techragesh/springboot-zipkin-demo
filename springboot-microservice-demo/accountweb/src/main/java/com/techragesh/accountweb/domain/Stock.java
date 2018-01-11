package com.techragesh.accountweb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {

    private Integer stockId;

    private Integer stockValue;

    private String stockName;

}
