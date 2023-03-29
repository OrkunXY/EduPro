package com.orkun.mapper;

import com.orkun.dto.request.StudentSaveRequestDto;
import com.orkun.dto.request.StudentUpdateRequestDto;
import com.orkun.dto.request.TeacherSaveRequestDto;
import com.orkun.repository.entity.Student;
import com.orkun.repository.entity.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IStudentMapper {
    IStudentMapper INSTANCE = Mappers.getMapper(IStudentMapper.class);

    Student toUpdateStudent(final StudentUpdateRequestDto dto);
    Student toStudent(final StudentSaveRequestDto dto);
}
