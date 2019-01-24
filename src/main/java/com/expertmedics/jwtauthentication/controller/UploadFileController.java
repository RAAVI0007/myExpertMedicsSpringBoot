package com.expertmedics.jwtauthentication.controller;

import com.expertmedics.jwtauthentication.model.FileModel;
import com.expertmedics.jwtauthentication.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UploadFileController {

  @Autowired
  FileRepository fileRepository;

  /*
   * MultipartFile Upload
   */
  @PostMapping("/api/file/upload")
  public String uploadMultipartFile(@RequestParam("file") MultipartFile file) {
    try {
      // save file to PostgreSQL
      System.out.println("Inside The File Upload Process:::::::::");
      FileModel filemode = new FileModel(file.getOriginalFilename(), file.getContentType(), file.getBytes());
      fileRepository.save(filemode);
      return "File uploaded successfully! -> filename = " + file.getOriginalFilename();
    } catch (	Exception e) {
      return "FAIL! Maybe You had uploaded the file before or the file's size > 500KB";
    }
  }
}
