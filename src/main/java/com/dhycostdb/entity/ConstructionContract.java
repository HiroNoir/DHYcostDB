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
@Table(name = "construction_contract")
public class ConstructionContract {

    /**
     * 未対応項目
     * ★フィールド（エンティティ）にインデックスを生成させるアノテーション
     * LongTextにはバリデーション追加予定「@Length(max = 600)」
     * 敷地面積の入力は、小数点第2位までの入力とすうるバリデーション
     * */

    // ID　（主キー自動生成）
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ccId;

    // 登録日時
    @Column(nullable = false)
    private LocalDateTime ccCreatedAt;

    // 更新日時
    @Column(nullable = false)
    private LocalDateTime ccUpdatedAt;

    // 積算時期（年）
    @Column(length = 10, nullable = false)
    private String estimateYear;

    // 積算時期（月）
    @Column(length = 10, nullable = false)
    private String estimateMonth;

    // 工事発注時期（期）
    @Column(length = 10, nullable = false)
    private String constructionPeriod;

    // 工事名称
    @Column(length = 100, nullable = false)
    private String projectName;

    // 工事場所
    @Column(length = 100, nullable = false)
    private String siteAddress;

    // 敷地面積　
    @Column(nullable = false)
    private Double siteArea;

    // 別途工事
    @Column(length = 100, nullable = false)
    private String separeteConstruction;

    // 予定価格
    @Column(nullable = false)
    private Long plannedPrice;

    // 落札価格
    @Column(nullable = false)
    private Long contractPrice;

    // 施工業者
    @Column(length = 30, nullable = false)
    private String contractorName;

    // 経緯等コメント ▲バリデーション追加予定「@Length(max = 600)」
    @Column(columnDefinition="LONGTEXT", nullable = false)
    private String remarksSection;

    // 発注図（抜粋）保存先
    @Column(columnDefinition="TEXT", nullable = false)
    private String blueprintAddress;

    // 編集者テーブルのエンティティとのリレーション実装
    @ManyToOne
    @JoinColumn(name = "cc_latest_editor", referencedColumnName = "euCode", nullable = false)
    private EditorUser editorUser;

    // 設計契約テーブルのエンティティとのリレーション実装
    @ManyToOne
    @JoinColumn(name = "cc_dc_id", referencedColumnName = "dcId", nullable = false)
    private DesignContract designContract;

    // 内訳種別区分設定のエンティティとのリレーション実装
    @ManyToOne
    @JoinColumn(name = "cc_et_id", referencedColumnName = "etId", nullable = false)
    private EstimateType estimateType;

}