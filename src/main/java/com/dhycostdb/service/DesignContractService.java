package com.dhycostdb.service;

import java.util.List;

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
    public List<DesignContract> getDesignContractList(){
        // リポジトリのfindAllメソッドを呼び出す
        return designContractRepository.findAll();
    }

    /** 登録を行う */
    @Transactional
    public DesignContract saveDesignContract(DesignContract designContract) {
        return designContractRepository.save(designContract);
    }

}