package com.TestApp.Service;

import com.TestApp.dao.TestDao;
import com.TestApp.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TestService {

    private final TestDao testDao;

    @Autowired
    public TestService(@Qualifier("fakeDao") TestDao testDao){
        this.testDao = testDao;
    }

    public int addTest(Test test){
        return testDao.insertTest(test); //insert ID here
    }

    public List<Test> getTest(){
        return testDao.selectAllTest();
    }

    public Optional<Test> getTestById(UUID id){
        return testDao.selectTestByid(id);
    }

    public int deleteTest(UUID id){
        return testDao.deleteTestById(id);
    }

    public int updateTest(UUID id, Test newTest){
        return testDao.updateTestById(id, newTest);
    }



}
