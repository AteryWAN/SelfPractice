package com.young.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: Young
 * @Description:
 * @Date: Created at 1/11 0011 11:10
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    /**
     * 根据年龄查询女生信息
     * @param age
     * @return
     */
    List<Girl> findByAge(Integer age);

    /**
     * 根据年龄查询并按照罩杯大小排序
     * @param age
     * @return
     */
    List<Girl> findByAgeOrderByCupSizeDesc(Integer age);
}
