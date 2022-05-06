package com.example.Demo;



import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Demo.Control.EngineerControl;
import com.example.Demo.Entity.Engineer;

@SpringBootTest
class DemoPracticeApplicationTests {

@BeforeAll
public static void beforea()
{
	System.out.println("before all");
}
@BeforeEach
public void beforee()
{
	System.out.println("before each");
}
@Test
@RepeatedTest(value = 5)
public void intet()
{
	System.out.println("in test caase");
}
@Test
public void intet2()
{
	System.out.println("in test caase2");
}
@AfterEach
public void aftr()
{
	System.out.println("after each");
}
@AfterAll
public static void afterr()
{
	System.out.println("after all");
}


}
