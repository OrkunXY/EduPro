package com.orkun.repository;

import com.orkun.repository.entity.Teacher;
import com.orkun.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher, Long> {


}
