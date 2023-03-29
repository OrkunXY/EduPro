package com.orkun.utility;

import com.orkun.repository.entity.Student;
import com.orkun.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
    @RequiredArgsConstructor
    public class DemoDataImpl {
        private final StudentService studentService;

       // @PostConstruct
        public void init(){
            studentService.save(Student.builder()
                    .username("i.gokyar")
                    .avatar("https://picsum.photos/233/530")
                    .name("ibrahim")
                    .surname("gokyar")
                    .build());
            studentService.save(Student.builder()
                    .username("s.yazici")
                    .avatar("https://picsum.photos/233/530")
                    .name("sezin")
                    .surname("yazicioglu")
                    .build());
            studentService.save(Student.builder()
                    .username("b.candela")
                    .avatar("https://picsum.photos/233/530")
                    .name("berat")
                    .surname("kandili")
                    .build());
            studentService.save(Student.builder()
                    .username("b.yazici")
                    .avatar("https://picsum.photos/233/530")
                    .name("bilge")
                    .surname("yazicioglu")
                    .build());

        }
    }

