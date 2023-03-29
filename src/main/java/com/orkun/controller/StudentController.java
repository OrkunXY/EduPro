package com.orkun.controller;

import com.orkun.dto.request.StudentSaveRequestDto;
import com.orkun.dto.request.StudentUpdateRequestDto;
import com.orkun.repository.entity.Student;
import com.orkun.repository.entity.Teacher;
import com.orkun.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.orkun.constants.EndPointList.*;

@RestController
@RequestMapping(STUDENT)
@RequiredArgsConstructor

public class StudentController {
    private final StudentService studentService;

    /*@GetMapping(SAVE)
    public ResponseEntity<Student> save(Student student){
        studentService.save(student);
        return ResponseEntity.ok(studentService.save(student));
    }*/
    @GetMapping(SAVE)
    public ResponseEntity<Student>saveStudent(StudentSaveRequestDto dto){
        return ResponseEntity.ok(studentService.save(dto));
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Student>> findAll(){
        return ResponseEntity.ok(studentService.findAll());
    }
    /*@GetMapping(FIND_BY_ID)
    public Optional<Student> findById(Integer id){
        Optional<Student> optionalStudent=studentService.findById(id);
        if (optionalStudent.isEmpty()){
            System.out.println("bu kayıtta ogrenci yok");
        }
        return optionalStudent;
    }*/
    @GetMapping(UPDATE)
    public ResponseEntity<Void> update(StudentUpdateRequestDto dto){
        studentService.update(dto);
        return ResponseEntity.ok().build();
    }
}
