
/* 12.編集者テーブル */
INSERT INTO editor_user (eu_code, created_at, updated_at, name, password)
VALUES ('775', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, '山本 浩明', 'yamahiro');

/* 21.設計契約テーブル */
INSERT INTO design_contract (dc_latest_editor, dc_created_at, dc_updated_at, contract_number, contract_name, customer_name)
VALUES ('775', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'X2024-001', 'T再開発事業に係る施設建築物実施設計等業務', 'T市街地再開発組合');

INSERT INTO design_contract (dc_latest_editor, dc_created_at, dc_updated_at, contract_number, contract_name, customer_name)
VALUES ('775', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'X2024-002', 'G察署庁舎実施設計', 'A警察本部');
