package com.orkun.repository;

import com.orkun.dto.response.FindAllByNameResponseDto;
import com.orkun.repository.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

    /*@Query("select new com.orkun.dto.FindAllByNameDto(s.name, s.surname, s.number) from Student where s.name like ?1%")
    List<FindAllByNameResponseDto> findAllByName(String name);*/


}
