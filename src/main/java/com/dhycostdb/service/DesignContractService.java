package com.dhycostdb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhycostdb.entity.DesignContract;
import com.dhycostdb.repository.DesignContractRepository;

@Service
public class DesignContractService {
    private final DesignContractRepository designContractRepository;

    public DesignContractService(DesignContractRepository repository) {
        this.designContractRepository = repository;
    }

    /** 全件を検索して返す */
    public List<DesignContract> findAll(){
        // リポジトリのfindAllメソッドを呼び出す
        return designContractRepository.findAll();
    }

    /** 設計契約1件をdc_idで検索 */
    public DesignContract findByDcId(Integer id) {
        // findByIdで検索
        Optional<DesignContract> option = designContractRepository.findById(id);
        // 取得できなかった場合はnullを返す
        DesignContract designContract = option.orElse(null);
        return designContract;
    }

    /** 登録を行う */
    @Transactional
    public DesignContract saveDesignContract(DesignContract designContract) {
        return designContractRepository.save(designContract);
    }

}