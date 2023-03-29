package com.orkun.service;

import com.orkun.dto.request.TeacherSaveRequestDto;
import com.orkun.mapper.ITeacherMapper;
import com.orkun.repository.ITeacherRepository;
import com.orkun.repository.entity.Teacher;
import com.orkun.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService extends ServiceManager<Teacher,Long> {
    private final ITeacherRepository repository;

    public TeacherService(ITeacherRepository repository){
        super(repository);
        this.repository=repository;
    }
    public Teacher save(TeacherSaveRequestDto dto){
        return save(ITeacherMapper.INSTANCE.toTeacher(dto));
    }
    public List<Teacher>findAll(){
        return repository.findAll();
    }
}
