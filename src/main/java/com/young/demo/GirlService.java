package com.young.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Young
 * @desc:
 * @date: Created at 1/11 0011 13:47
 */
@Service
@Transactional
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    public void addTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("E");
        girlA.setAge(10);
        girlRepository.save(girlA);


        Girl girlB = new Girl();
        girlB.setCupSize("GGGGG");
        girlB.setAge(12);
        girlRepository.save(girlB);
    }
}
