package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetWhiskiesFromAYear() {
		List<Whisky> result = whiskyRepository.allWhiskiesInYear(1991);
	}

    @Test
    public void canGetWhiskiesFromRegion() {
        List<Whisky> result = whiskyRepository.allWhiskyInRegion("Highland");
    }

    @Test
    public void canGetDistilleryFromRegion() {
	    List<Distillery> result = distilleryRepository.getAllDistilleriesInRegion("Highland");
    }

    @Test
    public void canGetWhiskiesDistilleryAndYear() {
	    List<Whisky> result = distilleryRepository.getWhiskyFromDistilleryWithAge(1L, 15);
    }

    @Test
    public void canGetDistilleriesWithWhiskyThisOld() {
	    List<Distillery> result = distilleryRepository.getDistilleriesWithWhiskyThisOld(12);
    }

}
