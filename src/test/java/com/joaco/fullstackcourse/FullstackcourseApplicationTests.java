package com.joaco.fullstackcourse;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class FullstackcourseApplicationTests {

	Calculator underTest = new Calculator();

	@Test
	void itShouldAddNumbers() {
		//given
		int number1 = 10;
		int number2 = 5;

		//when
		int result = underTest.add(number1, number2);

		//then
		int expected = 15;
		assertThat(result).isEqualTo(expected);
	}
	@Test
	void contextLoads() {
	}

	class Calculator {
		int add(int a, int b) {
			return a + b;
		}
	}

}
