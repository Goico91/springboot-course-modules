package com.course.springboot.modules.repositories;

import com.course.springboot.modules.vo.EmployeeKnowledge;
import com.course.springboot.modules.vo.EmployeeKnowledgeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeKnowledgeRepository extends JpaRepository<EmployeeKnowledge, EmployeeKnowledgeKey> {

}
