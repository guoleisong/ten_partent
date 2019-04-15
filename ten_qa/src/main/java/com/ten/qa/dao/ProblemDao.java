package com.ten.qa.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ten.qa.pojo.Problem;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface ProblemDao extends JpaRepository<Problem,String>,JpaSpecificationExecutor<Problem>{

    @Query(value="SELECT * FROM tb_problem,tb_pl WHERE id = problemid AND labelid =? ORDER BY replytime DESC",nativeQuery = true)
    public Page<Problem> newlitst(String labelid, Pageable pageable);

    @Query(value="SELECT * FROM tb_problem,tb_pl WHERE id = problemid AND labelid =? ORDER BY reply DESC",nativeQuery = true)
    public Page<Problem> hotlitst(String labelid, Pageable pageable);

    @Query(value="SELECT * FROM tb_problem,tb_pl WHERE id = problemid AND labelid =? AND reply = 0 ORDER BY createtime DESC",nativeQuery = true)
    public Page<Problem> waitlitst(String labelid, Pageable pageable);

}
