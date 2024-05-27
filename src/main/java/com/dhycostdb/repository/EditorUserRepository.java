package com.dhycostdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhycostdb.entity.EditorUsers;

public interface EditorUserRepository extends JpaRepository<EditorUsers, String> {

}
