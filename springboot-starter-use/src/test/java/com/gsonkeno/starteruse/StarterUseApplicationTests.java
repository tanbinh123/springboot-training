package com.gsonkeno.starteruse;

import com.gsonkeno.casestarter.autoconfigure.CaseManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StarterUseApplicationTests {

    @Autowired
    private CaseManager caseManager;
    @Autowired
    private ConfigurableApplicationContext context;

    @Test
    public void test() {
        caseManager.manage();
        Iterator<String> beanNames = context.getBeanFactory().getBeanNamesIterator();
        while (beanNames.hasNext()){
            System.out.println(beanNames.next());
        }
    }

}
