package com.mosax.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mosax.hibernate.model.Teacher;
import com.mosax.hibernate.dao.TeacherDaoImpl;
import com.mosax.hibernate.model.Course;

/**
 * Hello world!
 *
 */
public class App 
{
    
	public static void main( String[] args )
    {
        System.out.println( "CRUD HIBERNATE!" );
        
        
       /* Teacher teacher = new Teacher("Alvarado","Avatare");
        TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
        teacherDaoImpl.saveTeacher(teacher);
        */
        TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
        List<Teacher> teachers=teacherDaoImpl.findAllTeachers();
       // System.out.println("Nombre: " + teachers.size());
        for (Teacher t : teachers) {
        	System.out.println("Nombre: " + t.getName());
		}
        teacherDaoImpl.getSession().close();
    }
}
