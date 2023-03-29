package com.orkun.controller;


import com.orkun.dto.request.TeacherSaveRequestDto;
import com.orkun.repository.entity.Teacher;
import com.orkun.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.orkun.constants.EndPointList.*;


@RestController
@RequestMapping(TEACHER)
@RequiredArgsConstructor
public class TeacherController {
    private final TeacherService teacherService;

    @GetMapping(SAVE)
    public ResponseEntity<Teacher> saveTeacher(TeacherSaveRequestDto dto){
        return ResponseEntity.ok(teacherService.save(dto));
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Teacher>> findAll(){
        return ResponseEntity.ok(teacherService.findAll());
    }


}
