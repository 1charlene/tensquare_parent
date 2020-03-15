package com.tensquare.recruit.dao;

import com.tensquare.recruit.pojo.Recruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface RecruitDao extends JpaRepository<Recruit,String>,JpaSpecificationExecutor<Recruit>{
	List<Recruit> findTop6ByStateOrderByCreatetimeDesc(String state);
	//SELECT * FROM tb_recruit WHERE state = 2 ORDER BY createtime DESC
    //根据state字段查询状态为2(热门) createtime 降序 只查询前6个
	List<Recruit> findTop4ByStateNotOrderByCreatetimeDesc(String state);
	//SELECT  * FROM tb_recruit WHERE state != 0 ORDER BY createtime DESC  LIMIT 4
    //根据state字段查询非关闭状态(!=0) createtime 降序 只查询前4个
}
