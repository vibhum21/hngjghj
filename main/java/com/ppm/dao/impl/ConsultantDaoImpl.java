package com.ppm.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ppm.dao.ConsultantDao;
import com.ppm.model.ConsultantModel;


@Repository
public class ConsultantDaoImpl implements ConsultantDao{
	protected EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	
	
	@Override
	public ConsultantModel getAllConsultant() {
		TypedQuery<ConsultantModel> qt = entityManager.createQuery("SELECT e FROM ConsultantModel e", ConsultantModel.class);
		List<ConsultantModel> consultantList = (List<ConsultantModel>)qt.getResultList();
		System.out.println("employeeList"+consultantList);
		return consultantList.get(0);
	}
	
	@Override
	@Transactional
	public void addConsultant(ConsultantModel consultant) {
		System.out.println("addPortfolio"+consultant);
		try{
			entityManager.persist(consultant);
			entityManager.flush();
		}catch(Exception ex){
			System.out.println("Exception occured while saving consultant"+ex.getMessage());
			ex.printStackTrace();
		}

	}
	
	@Override
	public ConsultantModel getConsultant(int id) {
		ConsultantModel consultant = entityManager.find(ConsultantModel.class, id);
		return consultant;
	}
	
	
	@Override
	@Transactional
	public void updateConsultant(ConsultantModel consultant) {
		ConsultantModel cons = new ConsultantModel();
		cons = getConsultant(consultant.getConsultantid());
		//emp = getPortfolio(1);
		System.out.println(cons);
		cons.setProjectid(consultant.getProjectid());
		cons.setConsultant(consultant.getConsultant());
		cons.setRole(consultant.getRole());
		cons.setDuration(consultant.getDuration());
		
		entityManager.persist(cons);
		//emp = getPortfolio(1);
		System.out.println(cons);
		
	}
	
	
	
	@Override
	@Transactional
	public void deleteConsultant(int id) {
		ConsultantModel consultant = getConsultant(id);
		entityManager.remove(consultant);
		
	}
	
}
