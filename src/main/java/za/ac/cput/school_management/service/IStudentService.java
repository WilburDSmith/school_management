package za.ac.cput.school_management.service;

/*
 *  Author:BS Brady Sheldon 219053715
 *  Student
 *  June Assignment
 *
 * */

import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.domain.Student;


import java.util.List;


public interface IStudentService extends IService<Student, String> {

     List<Student> findAll();


     Student findByStudent_IDOrderByLastName(String countryId);


}