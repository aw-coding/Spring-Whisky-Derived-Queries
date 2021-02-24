package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

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
	public void canFindWhiskyByYear(){
		int answer = whiskyRepository.findWhiskiesByYear(1991).size();
		assertEquals(1, answer);
	}

	@Test
	public void canFindDistilleryByRegion(){
		int answer = distilleryRepository.findDistilleriesByRegion("Speyside").size();
		assertEquals(3, answer);

	}

	@Test		//uses distillery id
	public void canFindWhiskiesByDistillery_idAndAge(){
		List<Whisky> answer = whiskyRepository.findWhiskyByDistillery_idAndAge(5L, 16);
		assertEquals("Twist Tattoo", answer.get(0).getName());
	}

//	@Test
//	public void canFindWhiskiesByDistilleryNameAndAge(){
//		List<Whisky> answer = whiskyRepository.findWhiskyByDistillery_idAndAge("Highland Park", 16);
//		assertEquals("Twist Tattoo", answer.get(0).getName());
//	}

}
