package com.TestApp.dao;

import com.TestApp.model.Test;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class TestDataAccessService implements TestDao {

    private static List<Test> DB = new ArrayList<>();

    @Override
    public int insertTest(UUID id, Test test) {
        DB.add(new Test(id, test.getName()));
        return 1;
    }

    @Override
    public int insertTest(Test test) {
        return TestDao.super.insertTest(test);
    }

    @Override
    public List<Test> selectAllTest() {
        return DB;
    }

    @Override
    public Optional<Test> selectTestByid(UUID id) {
        return DB.stream().filter(test -> test.getId().equals(id)).findFirst();
    }


    @Override
    public int deleteTestById(UUID id) {
        Optional<Test> testMaybe = selectTestByid(id);
        if(!testMaybe.isPresent ()) {
            return 0;
        }
        DB.remove(testMaybe.get());
        return 1;

    }

    @Override
    public int updateTestById(UUID id, Test update) {
        return selectTestByid(id).map(test -> {
            int indexOfTestToUpdate = DB.indexOf(test);
            if (indexOfTestToUpdate >= 0){
                DB.set(indexOfTestToUpdate, new Test(id, update.getName()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }
}
