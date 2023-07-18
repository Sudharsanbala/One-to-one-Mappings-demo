package com.sudharsan.mappingsdemo.dao;

import com.sudharsan.mappingsdemo.entity.Instructor;

public interface AppDao {

    void save (Instructor theinstructor );

Instructor findById(int theId);

    void deleteInstructorById(int theId);
}


