package com.techragesh.stockservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stock")
public class Stock implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stock_id")
    private Integer stockId;
    @Column(name = "stock_value")
    private Integer stockValue;
    @Column(name = "stock_name")
    private String stockName;

}
