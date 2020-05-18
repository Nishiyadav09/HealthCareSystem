package com.cg.health.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.health.entity.DiagnosticCenter;


public interface DiagnosticCenterDao extends JpaRepository<DiagnosticCenter, Integer>{

}
