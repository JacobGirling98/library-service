package com.library.library.Controller;

import com.library.library.Services.LibraryService;
import com.library.library.Entities.LibraryEntity;
import com.library.library.Models.LibraryModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libraries")
public class LibraryController {
  
  @Autowired
  private LibraryService libraryService;

  @GetMapping()
  public String getAllLibraries() {
    List<LibraryEntity> libraries = libraryService.getAllLibraries();
    
    for (LibraryEntity l : libraries) {
      System.out.println(l);
    }
    
    return "success!";
    // return libraryService.getAllLibraries();
  }

}
