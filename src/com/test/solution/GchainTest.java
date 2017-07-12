package com.test.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.dev.solution.Gchain;

public class GchainTest {
	Gchain gChain;
	
	@Before
	public void before() {
		gChain = new Gchain();
	}

	@Test
	public void c2ShouldReturn1() {
		long answer = gChain.calculateNumberOfChains(2);
		
		assertEquals(1, answer);
	}
	
	@Test
	public void c3ShouldReturn2() {
		long answer = gChain.calculateNumberOfChains(3);
		
		assertEquals(2, answer);
	}
	
	@Test
	public void c4ShouldReturn4() {
		long answer = gChain.calculateNumberOfChains(4);
		
		assertEquals(4, answer);
	}
	
	@Test
	public void c5ShouldReturn5() {
		long answer = gChain.calculateNumberOfChains(5);
		
		assertEquals(5, answer);
	}
	
	@Test
	public void c6ShouldReturn10() {
		long answer = gChain.calculateNumberOfChains(6);
		
		assertEquals(10, answer);
	}
	
	@Test
	public void c7ShouldReturn11() {
		long answer = gChain.calculateNumberOfChains(7);
		
		assertEquals(11, answer);
	}
	
	@Test
	public void c8ShouldReturn16() {
		long answer = gChain.calculateNumberOfChains(8);
		
		assertEquals(16, answer);
	}
	
	@Test
	public void c1024ShouldReturn68116() {
		long answer = gChain.calculateNumberOfChains(1024);
		
		assertEquals(68116, answer);
	}
	
	@Test
	public void c9ShouldReturn18() {
		long answer = gChain.calculateNumberOfChains(9);
		
		assertEquals(18, answer);
	}
	
	@Test
	public void c10ShouldReturn23() {
		long answer = gChain.calculateNumberOfChains(10);
		
		assertEquals(23, answer);
	}
	
	@Test
	public void c12ShouldReturn36() {
		long answer = gChain.calculateNumberOfChains(12);
		
		assertEquals(36, answer);
	}
	
	@Test
	public void c2ToThePower20ShouldReturn7260458765() {
		long answer = gChain.calculateNumberOfChains(1048576);
		
		assertEquals(7260458765l, answer);
	}

}
