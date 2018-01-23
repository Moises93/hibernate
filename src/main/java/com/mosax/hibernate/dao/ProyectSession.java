package com.mosax.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ProyectSession {
	private Session session;
	
	public ProyectSession() {
		 /*Nota: El ServiceRegistry lo cree porque para esta version de Hibernate parece que el metodo
	     * buildSessionFactory() esta obsoleto y necesita este parametro. En el curso de Java EE platzi
	     * la profesora Anahi no uso el serviceRegistry uso el metodo buildSession si parametros,
	     * de esa forma me funciono igual , cree el SrviceRegistry porque me molestaba la notificacion
	     * del IDE*/
		    Configuration configuration= new Configuration();
		    configuration.configure();
		    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry); 
		    session = sessionFactory.openSession();
		    session.beginTransaction();
	}
	
	public Session getSession(){
	    return session;
	}
}
