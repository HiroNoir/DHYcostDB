package com.dhycostdb.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "estimate_type")
public class EstimateType {

    // 主キー
    @Id
    private Integer etId;

    // 内訳種別
    @Column(length = 30, nullable = false)
    private String typeName;

    // 工事契約テーブルのエンティティとのリレーション実装
    @OneToMany(mappedBy = "estimateType", cascade = CascadeType.ALL)
    private List<ConstructionContract> constructionContract;

}