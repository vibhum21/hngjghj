package com.ppm.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ppm.dao.ProjectEventDao;

import com.ppm.model.ProjectEventModel;

@Repository
public class ProjectEventDaoImpl implements ProjectEventDao {
	protected EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<ProjectEventModel> getAllProjectEvent() {
		TypedQuery<ProjectEventModel> qt = entityManager.createQuery("SELECT e FROM ProjectEventModel e", ProjectEventModel.class);
		List<ProjectEventModel> projectEventList = (List<ProjectEventModel>)qt.getResultList();
		System.out.println("employeeList"+projectEventList);
		return projectEventList;
	}
	
	@Override
	@Transactional
	public void addProjectEvent(ProjectEventModel projectEvent) {
		System.out.println("addProjectEvent"+projectEvent);
		try{
			entityManager.persist(projectEvent);
			entityManager.flush();
		}catch(Exception ex){
			System.out.println("Exception occured while saving portfolio"+ex.getMessage());
			ex.printStackTrace();
		}

	}
	
	@Override
	public ProjectEventModel getProjectEvent(int id) {
		ProjectEventModel projectEvent = entityManager.find(ProjectEventModel.class, id);
		return projectEvent;
	}
	
}
