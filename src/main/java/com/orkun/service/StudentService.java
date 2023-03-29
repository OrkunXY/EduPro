package com.orkun.service;

import com.orkun.dto.request.StudentSaveRequestDto;
import com.orkun.dto.request.StudentUpdateRequestDto;
import com.orkun.dto.response.FindAllByNameResponseDto;
import com.orkun.mapper.IStudentMapper;
import com.orkun.mapper.ITeacherMapper;
import com.orkun.repository.IStudentRepository;
import com.orkun.repository.entity.Student;
import com.orkun.repository.entity.Teacher;
import com.orkun.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService extends ServiceManager<Student, Long> {

    private final IStudentRepository repository;
    public StudentService(IStudentRepository repository){
        super(repository);
        this.repository=repository;
    }

    public Student save(StudentSaveRequestDto dto){
        return save(IStudentMapper.INSTANCE.toStudent(dto));
    }
    public List<Student>findAll() {
        return repository.findAll();
    }


      /*  public Student save(String username, String password){
        return repository.save(Student.builder()
                .username(username)
                .password(password)
                .build());
    }*/
    /*public Optional<Student>findById(Integer id){
        Optional<Student> optional=repository.findById(id);
        if (optional.isEmpty()){
            System.out.println("eslesme bulunamadi");
        }
        return optional;
    }*/
    /*public List<FindAllByNameResponseDto> findAllByName(String name){
        return repository.findAllByName(name);
    }*/


    public void update(StudentUpdateRequestDto dto){
        Optional<Student> student=repository.findById(dto.getId());
        if(student.isPresent()){
            student.get().setName(dto.getName());
            student.get().setSurname(dto.getSurname());
           repository.save(student.get());
        }
    }
}
