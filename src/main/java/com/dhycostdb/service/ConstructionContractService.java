package com.dhycostdb.service;

import java.util.List;

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
    public List<ConstructionContract> getConstructionContractList(){
        // リポジトリのfindAllメソッドを呼び出す
        return constructionContractRepository.findAll();
    }

    /** 登録を行う */
    @Transactional
    public ConstructionContract saveConstructionContract(ConstructionContract constructionContract) {
        return constructionContractRepository.save(constructionContract);
    }

}