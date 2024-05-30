package com.dhycostdb.entity;

import java.time.LocalDateTime;
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
@Table(name = "editor_user")
public class EditorUser {

    // 主キー（社員番号）
    @Id
    @Column(length = 10)
    private String euCode;

    // 登録日時
    @Column(nullable = false)
    private LocalDateTime createdAt;

    // 更新日時
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    // 名前
    @Column(length = 30, nullable = false)
    private String name;

    // パスワード
    @Column(length = 255, nullable = false)
    private String password;

    // 設計契約テーブルのエンティティとのリレーション実装
    @OneToMany(mappedBy = "editorUser", cascade = CascadeType.ALL)
    private List<DesignContract> designContract;

    // 工事契約テーブルのエンティティとのリレーション実装
    @OneToMany(mappedBy = "editorUser", cascade = CascadeType.ALL)
    private List<ConstructionContract> constructionContract;

}