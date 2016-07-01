package com.ppm.populator;

import org.springframework.stereotype.Component;

import com.ppm.dto.ConsultantDto;
import com.ppm.model.ConsultantModel;


@Component
public class ConsultantPopulator {
	public void populate(ConsultantModel consultantModel,ConsultantDto consultantDto){
		consultantDto.setConsultantid(consultantModel.getConsultantid());
		consultantDto.setProjectid(consultantModel.getProjectid());
		consultantDto.setConsultant(consultantModel.getConsultant());
		consultantDto.setRole(consultantModel.getRole());
		consultantDto.setDuration(consultantModel.getDuration());
	}
	
	public void populate(ConsultantDto consultantDto,ConsultantModel consultantModel){
		consultantModel.setConsultantid(consultantDto.getConsultantid());
		consultantModel.setProjectid(consultantDto.getProjectid());
		consultantModel.setConsultant(consultantDto.getConsultant());
		consultantModel.setRole(consultantDto.getRole());
		consultantModel.setDuration(consultantDto.getDuration());
	}
}
