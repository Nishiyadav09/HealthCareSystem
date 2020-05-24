package com.cg.health.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.health.entity.Test;
/*****************************************************************************************************
 * @author        Nishi Yadav
 * Description    It is a TestDao interface typically which extends the JpaRepository 
 *                which implements the method. 
 *                
 * Version        1.0
 * Created Date   06-MAY-2020 
 *
 ****************************************************************************************************/
public interface TestDao extends JpaRepository<Test, Integer> {

}
