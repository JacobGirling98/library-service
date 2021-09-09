package com.library.library.Services;

import com.library.library.Respositories.LibraryRepository;

import java.util.List;

import com.library.library.Entities.LibraryEntity;

import org.springframework.stereotype.Service;

@Service
public class LibraryService {

  LibraryRepository repository;
  
  public List<LibraryEntity> getAllLibraries() {
    return repository.findAll();
  }
}
