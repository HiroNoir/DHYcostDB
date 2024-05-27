package com.dhycostdb.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.dhycostdb.entity.EditorUsers;
import com.dhycostdb.repository.EditorUserRepository;

@Service
public class EditorUserService {
    private final EditorUserRepository editorUsersRepository;

    public EditorUserService(EditorUserRepository repository) {
        this.editorUsersRepository = repository;
    }

    /** 全件を検索して返す */
    public List<EditorUsers> getEditorUserList(){
        // リポジトリのfindAllメソッドを呼び出す
        return editorUsersRepository.findAll();
    }

}