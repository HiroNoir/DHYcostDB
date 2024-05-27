package com.dhycostdb.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "designContracts")
public class DesignContracts {

    // ID　（主キー自動生成）
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dcId;

    // 登録日時
    @Column(nullable = false)
    private LocalDateTime createdAt;

    // 更新日時
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    // 業務番号
    @Column(length = 10, nullable = false)
    private String contractNumber;

    //　業務名称
    @Column(length = 100, nullable = false)
    private String contractName;

    //　顧客名称
    @Column(length = 30, nullable = false)
    private String customerName;

    // 従業員テーブルのエンティティとのリレーション実装
    @ManyToOne
    @JoinColumn(name = "eu_code", referencedColumnName = "euCode", nullable = false)
    private DesignContracts designContracts;
}
