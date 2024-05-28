package com.dhycostdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhycostdb.entity.EditorUser;

public interface EditorUserRepository extends JpaRepository<EditorUser, String> {

}
