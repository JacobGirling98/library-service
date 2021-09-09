package com.library.library.Respositories;

import com.library.library.Entities.LibraryEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryEntity, Long>, JpaSpecificationExecutor<LibraryEntity> {
  
}
