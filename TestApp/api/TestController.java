package com.TestApp.api;


import com.Aviolinx.stub.GetRosters;
import com.Aviolinx.stub.ObjectFactory;
import com.Aviolinx.stub.RosterRequestData;
import com.Aviolinx.stub.RosterRequestFilter;
import com.TestApp.Service.SoapClient;
import com.TestApp.Service.TestService;
import com.TestApp.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/")
@RestController
public class TestController {

    private final TestService testService;

    @Autowired
    private SoapClient soapClient;

    @Autowired
    public TestController(TestService testService){
        this.testService = testService;
    }

    @PostMapping
    public void addTest(@NonNull @RequestBody Test test){
        testService.addTest(test);
    }

    @GetMapping
    public List<Test> getAllTest(Model model) {
        model.addAttribute("something", "this is coming from the conteroller");
        model.addAttribute("test");
        return testService.getTest();
    }


    @GetMapping(path = "{id}")
    public Test getTestById(@PathVariable("id") UUID id){
        return testService.getTestById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteTestById(@PathVariable("id") UUID id){
        testService.deleteTest(id);
    }

    @PutMapping(path = "{id}")
    public void updateTest(@PathVariable("id") UUID id, @NonNull @RequestBody Test testToUpdate){
        testService.updateTest(id, testToUpdate);
    }

    @GetMapping
    public GetRosters sum(@RequestParam String username, @RequestParam String password, @RequestParam RosterRequestFilter filter, @RequestParam RosterRequestData data){
        ObjectFactory objectFactory = new ObjectFactory();
        RosterRequestFilter rosterRequestFilter = new RosterRequestFilter();
        RosterRequestData rosterRequestData = new RosterRequestData();


    }





}
