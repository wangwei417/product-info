package com.boot;

import static org.junit.Assert.assertEquals;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import com.boot.controller.HomeController;

public class AppTest 
{

	@Test
    public void testApp()
    {
		HomeController hc = new HomeController();
		String result = hc.home();
		Assert.assertThat(result, CoreMatchers.containsString("Finally I can have my jenkins"));
    }
}
