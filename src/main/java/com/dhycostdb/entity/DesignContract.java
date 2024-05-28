package com.dhycostdb.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "design_contract")
public class DesignContract {

    // ID　（主キー自動生成）
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dcId;

    // 登録日時
    @Column(nullable = false)
    private LocalDateTime dcCreatedAt;

    // 更新日時
    @Column(nullable = false)
    private LocalDateTime dcUpdatedAt;

    // 業務番号
    @Column(length = 10, nullable = false)
    private String contractNumber;

    // 業務名称
    @Column(length = 100, nullable = false)
    private String contractName;

    // 顧客名称
    @Column(length = 30, nullable = false)
    private String customerName;

    // 編集者テーブルのエンティティとのリレーション実装
    @ManyToOne
    @JoinColumn(name = "dc_latest_editor", referencedColumnName = "euCode", nullable = false)
    private EditorUser editorUser;

}