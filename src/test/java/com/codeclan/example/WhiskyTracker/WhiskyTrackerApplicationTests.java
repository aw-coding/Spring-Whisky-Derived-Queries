package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;


	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindWhiskyByYear(){
		int answer = whiskyRepository.findWhiskiesByYear(1991).size();
		assertEquals(1, answer);
	}

}
