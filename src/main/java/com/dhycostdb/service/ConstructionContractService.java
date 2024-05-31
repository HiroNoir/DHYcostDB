package com.dhycostdb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhycostdb.entity.ConstructionContract;
import com.dhycostdb.repository.ConstructionContractRepository;

@Service
public class ConstructionContractService {
    private final ConstructionContractRepository constructionContractRepository;

    public ConstructionContractService(ConstructionContractRepository repository) {
        this.constructionContractRepository = repository;
    }

    /** 全件を検索して返す */
    public List<ConstructionContract> findAll(){
        // リポジトリのfindAllメソッドを呼び出す
        return constructionContractRepository.findAll();
    }

    /** 工事契約1件をcc_idで検索 */
    public ConstructionContract findByCcId(Integer id) {
        // findByIdで検索
        Optional<ConstructionContract> option = constructionContractRepository.findById(id);
        // 取得できなかった場合はnullを返す
        ConstructionContract constructionContract = option.orElse(null);
        return constructionContract;
    }

    /** 登録を行う */
    @Transactional
    public ConstructionContract saveConstructionContract(ConstructionContract constructionContract) {
        return constructionContractRepository.save(constructionContract);
    }

}