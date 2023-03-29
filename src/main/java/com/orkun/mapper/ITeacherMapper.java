package com.orkun.mapper;

import com.orkun.dto.request.TeacherSaveRequestDto;
import com.orkun.repository.entity.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITeacherMapper {
    ITeacherMapper INSTANCE = Mappers.getMapper(ITeacherMapper.class);

    Teacher toTeacher(final TeacherSaveRequestDto dto);
}
