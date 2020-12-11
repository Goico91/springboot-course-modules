package com.course.springboot.modules.controllers.mappers;

import com.course.springboot.modules.controllers.dto.EmployeeKnowledgeDTO;
import com.course.springboot.modules.vo.EmployeeKnowledge;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeKnowledgeToEmployeeKnowledgeDTO {

    EmployeeKnowledge toEmployeeKnowledge(EmployeeKnowledgeDTO employeeKnowledgeDTO);

    EmployeeKnowledgeDTO toEmployeeKnowledgeDTO(EmployeeKnowledge employeeKnowledge);
}
