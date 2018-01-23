package com.mosax.hibernate.dao;

import java.util.List;

import com.mosax.hibernate.model.Teacher;

public class TeacherDaoImpl extends ProyectSession implements TeacherDao{

	private ProyectSession proyectSession;
	
	public TeacherDaoImpl() {
		proyectSession = new ProyectSession();
	}

	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		proyectSession.getSession().persist(teacher); //puedo usar save o persist, se recomienda perist
		proyectSession.getSession().getTransaction().commit();
		//proyectSession.getSession().close();
	}

	public void deleteTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub
		
	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	public List<Teacher> findAllTeachers() {
		// TODO Auto-generated method stub
		proyectSession.getSession();
		//Hibernate piensa en las clases no en el nombre de las tablas en la BD, por eso es Teacher en vez de teacher
		return proyectSession.getSession().createQuery("from Teacher").list();
	}

	public Teacher findById(Long idTeacher) {
		// TODO Auto-generated method stub
		return null;
	}

	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
