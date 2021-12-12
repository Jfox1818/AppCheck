package com.TestApp.dao;

import com.TestApp.model.Test;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TestDao{

    int insertTest(UUID id, Test test);

    // TODO: 07/12/2021 Get id from CMS
    public default int insertTest(Test test) {
        UUID id = UUID.randomUUID();
        return insertTest(id, test);
    }

    public List<Test> selectAllTest();

    public Optional<Test> selectTestByid(UUID id);

    public int deleteTestById(UUID id);

    public int updateTestById(UUID id, Test test);
}
