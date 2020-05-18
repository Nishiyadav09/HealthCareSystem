package com.cg.health.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.health.entity.Appointment;

public interface AppointmentDao extends JpaRepository<Appointment, Integer>{

}