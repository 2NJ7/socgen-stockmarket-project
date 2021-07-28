package com.company.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.company.entity.Ipo;

@Repository
public interface IpoRepository extends JpaRepository<Ipo, Integer>{
	
	public List<Ipo> findAllByOrderByDateTimeAsc();
	
	public Ipo findByCompanyId(@Param("companyId") int companyId);

}