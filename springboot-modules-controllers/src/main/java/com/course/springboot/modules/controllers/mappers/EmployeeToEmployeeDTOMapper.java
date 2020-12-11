package com.course.springboot.modules.controllers.mappers;

import com.course.springboot.modules.controllers.dto.EmployeeDTO;
import com.course.springboot.modules.vo.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {EmployeeKnowledgeToEmployeeKnowledgeDTO.class})
public interface EmployeeToEmployeeDTOMapper {

    EmployeeToEmployeeDTOMapper INSTANCE = Mappers.getMapper(EmployeeToEmployeeDTOMapper.class);

    EmployeeDTO employeeToEmployeeDTO(Employee employee);

    Employee employeeDTOToEmployee(EmployeeDTO employee);
}
