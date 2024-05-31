package com.dhycostdb.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhycostdb.entity.EditorUser;
import com.dhycostdb.repository.EditorUserRepository;

@Service
public class EditorUserService {
    private final EditorUserRepository editorUserRepository;

    public EditorUserService(EditorUserRepository repository) {
        this.editorUserRepository = repository;
    }

    /** 全件を検索して返す */
    public List<EditorUser> findAll(){
        // リポジトリのfindAllメソッドを呼び出す
        return editorUserRepository.findAll();
    }

    /** 登録を行う */
    @Transactional
    public EditorUser saveEditorUser(EditorUser user) {
        return editorUserRepository.save(user);
    }

}