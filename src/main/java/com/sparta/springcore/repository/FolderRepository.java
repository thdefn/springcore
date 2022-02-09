package com.sparta.springcore.repository;

import com.sparta.springcore.model.Folder;
import com.sparta.springcore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    //어노테이션 안써도 구현체에서 가지고 있음
    List<Folder> findAllByUser(User user);
}
