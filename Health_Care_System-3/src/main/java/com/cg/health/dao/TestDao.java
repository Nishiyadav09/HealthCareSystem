package com.cg.health.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.health.entity.Test;
public interface TestDao extends JpaRepository<Test, Integer> {

}
