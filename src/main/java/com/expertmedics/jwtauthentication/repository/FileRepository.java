package com.expertmedics.jwtauthentication.repository;

import com.expertmedics.jwtauthentication.model.FileModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface FileRepository extends JpaRepository<FileModel, Long>{
}