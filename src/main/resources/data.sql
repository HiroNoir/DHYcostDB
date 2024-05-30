
/* 04.内訳種別区分設定 */
INSERT INTO estimate_type (et_id, type_name) VALUES (10, '官庁提示設計書');
INSERT INTO estimate_type (et_id, type_name) VALUES (20, '施工業者見積書');
INSERT INTO estimate_type (et_id, type_name) VALUES (30, '補助金用設計書');
INSERT INTO estimate_type (et_id, type_name) VALUES (40, '実施設計概算書');

/* 12.編集者テーブル */
INSERT INTO editor_user (eu_code, created_at, updated_at, name, password)
VALUES ('775', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, '山本 浩明', 'yamahiro');

/* 21.設計契約テーブル */
INSERT INTO design_contract (dc_latest_editor, dc_created_at, dc_updated_at, contract_number, contract_name, customer_name)
VALUES ('775', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'X2024-001', 'T再開発事業に係る施設建築物実施設計等業務', 'T市街地再開発組合');

INSERT INTO design_contract (dc_latest_editor, dc_created_at, dc_updated_at, contract_number, contract_name, customer_name)
VALUES ('775', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'X2024-002', 'G察署庁舎実施設計', 'A警察本部');

/* 22.工事契約テーブル */
INSERT INTO construction_contract (cc_latest_editor, cc_created_at, cc_updated_at, cc_dc_id, cc_et_id, estimate_year, estimate_month, construction_period, project_name, site_address, site_area, separete_construction, planned_price, contract_price, contractor_name, remarks_section, blueprint_address)
VALUES ('775', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1, 30, '2019年', '8月', '1期', 'T再開発事業に係る解体工事', 'T地内', 15325.53, '再開発事業', 446400000, 408000000, 'O社', 'O社内訳は2019.7.31時点、設計書は2019.8.26時点', '決まり次第更新');

INSERT INTO construction_contract (cc_latest_editor, cc_created_at, cc_updated_at, cc_dc_id, cc_et_id, estimate_year, estimate_month, construction_period, project_name, site_address, site_area, separete_construction, planned_price, contract_price, contractor_name, remarks_section, blueprint_address)
VALUES ('775', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1, 30, '2020年', '11月', '2期', 'T再開発事業', 'T地内', 15325.53, '解体工事', 12980000000, 12735000000, 'O社', '・RIBC内訳書ではサインは大項目で計上されているが、ここでは各棟と外構に分けて計上する。\r\n・2020年3月23日当時の設計書から追加VE(2億円以上)を行うとしてO社と契約した。このコストデータはその追加VEを反映したものであり、結果落札率は98.11%となっている。', '決まり次第更新');

INSERT INTO construction_contract (cc_latest_editor, cc_created_at, cc_updated_at, cc_dc_id, cc_et_id, estimate_year, estimate_month, construction_period, project_name, site_address, site_area, separete_construction, planned_price, contract_price, contractor_name, remarks_section, blueprint_address)
VALUES ('775' ,CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2, 10, '2018年', '3月', '1期', 'G警察暑車庫棟取壊し等工事【RIBC復元】', 'G地内', 4744.64, '霊安室棟オーバースライダー(2期建築に移動)', 27460000, 24710000, 'K社', '・RIBC内訳のため、RIBC単価は仮単価\r\n・解体撤去工事詳細\r\n　車庫棟解体　1式　2,021,165円\r\n　危険物貯蔵所解体　1式　632,811円\r\n　倉庫解体　1式　541,920円\r\n　駐輪場解体　1式　209,322円\r\n　外構解体　1式　1,902,111円\r\n　電気設備解体　1式　78,145円\r\n　機械設備解体　1式　5,682,056円\r\n　計　5,682,056円', '決まり次第更新');

INSERT INTO construction_contract (cc_latest_editor, cc_created_at, cc_updated_at, cc_dc_id, cc_et_id, estimate_year, estimate_month, construction_period, project_name, site_address, site_area, separete_construction, planned_price, contract_price, contractor_name, remarks_section, blueprint_address)
VALUES ('775', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2, 10, '2018年', '5月', '2期-1', 'G警察署庁舎建築工事【RIBC復元】', 'G地内', 4744.64, '電気、空調、管、エレベーター、外構', 919000000, 919000000, 'S社', '・RIBC内訳のため、RIBC単価は仮単価\r\n・解体撤去工事詳細\r\n　庁舎階段解体　1式　112,634円\r\n　外構解体　1式　2,841,840円\r\n計　2,954,474円\r\n', '決まり次第更新');

INSERT INTO construction_contract (cc_latest_editor, cc_created_at, cc_updated_at, cc_dc_id, cc_et_id, estimate_year, estimate_month, construction_period, project_name, site_address, site_area, separete_construction, planned_price, contract_price, contractor_name, remarks_section, blueprint_address)
VALUES ('775', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2, 10, '2018年', '5月', '2期-2', 'G警察署庁舎電気工事', 'G地内', 4744.64, '建築、空調、管、エレベーター、外構', 198600000, 178700000, 'I社', '・入札結果のみ（内訳不明）', '決まり次第更新');

INSERT INTO construction_contract (cc_latest_editor, cc_created_at, cc_updated_at, cc_dc_id, cc_et_id, estimate_year, estimate_month, construction_period, project_name, site_address, site_area, separete_construction, planned_price, contract_price, contractor_name, remarks_section, blueprint_address)
VALUES ('775', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2, 10, '2018年', '5月', '2期-3', 'G警察署庁舎空調工事', 'G地内', 4744.64, '建築、電気、管、エレベーター、外構', 134400000, 120960000, 'I社', '・入札結果のみ（内訳不明）', '決まり次第更新');

INSERT INTO construction_contract (cc_latest_editor, cc_created_at, cc_updated_at, cc_dc_id, cc_et_id, estimate_year, estimate_month, construction_period, project_name, site_address, site_area, separete_construction, planned_price, contract_price, contractor_name, remarks_section, blueprint_address)
VALUES ('775', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2, 10, '2018年', '5月', '2期-4', 'G警察署庁舎管工事', 'G地内', 4744.64, '建築、電気、空調、エレベーター、外構', 91410000, 82260000, 'H社', '・入札結果のみ（内訳不明）\r\n・1回目予定価格86,260,000円で不調、2回目で落札', '決まり次第更新');

INSERT INTO construction_contract (cc_latest_editor, cc_created_at, cc_updated_at, cc_dc_id, cc_et_id, estimate_year, estimate_month, construction_period, project_name, site_address, site_area, separete_construction, planned_price, contract_price, contractor_name, remarks_section, blueprint_address)
VALUES ('775', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2, 10, '2018年', '5月', '2期-5', 'G警察署庁舎エレベーター工事', 'G地内', 4744.64, '建築、電気、空調、管、外構', 27840000, 25050000, 'M社', '・入札結果のみ（内訳不明）', '決まり次第更新');

INSERT INTO construction_contract (cc_latest_editor, cc_created_at, cc_updated_at, cc_dc_id, cc_et_id, estimate_year, estimate_month, construction_period, project_name, site_address, site_area, separete_construction, planned_price, contract_price, contractor_name, remarks_section, blueprint_address)
VALUES ('775', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2, 10, '2019年', '9月', '2期-6', 'G警察暑庁舎外構工事【RIBC復元】', 'G地内', 4744.64, '建築、電気、空調、管、エレベーター', 38520000, 38500000, 'S社', '・RIBC内訳のため、RIBC単価は仮単価', '決まり次第更新');

INSERT INTO construction_contract (cc_latest_editor, cc_created_at, cc_updated_at, cc_dc_id, cc_et_id, estimate_year, estimate_month, construction_period, project_name, site_address, site_area, separete_construction, planned_price, contract_price, contractor_name, remarks_section, blueprint_address)
VALUES ('775', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2, 10, '2020年', '3月', '3期', 'G警察署環境整備等工事【RIBC復元】', 'G地内', 4744.64, '無し', 149800000, 135950000, 'S社', '・RIBC内訳のため、RIBC単価は仮単価\r\n・解体建物面積　内部面積参考1358㎡　17,975円/床面積', '決まり次第更新');
