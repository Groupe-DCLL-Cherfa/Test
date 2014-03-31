package org.tsaap.questions.impl;

import junit.framework.TestCase;

public class DefaultAnswerTest extends TestCase {
	
	public void testequals(){
		DefaultAnswer d = new DefaultAnswer();
		DefaultAnswer e = new DefaultAnswer();
		d.setIdentifier("hey");
		e.setIdentifier("hey");
		DefaultQuiz q = new DefaultQuiz();
		assertFalse(d.equals(q));
		assertTrue(d.equals(e));
	}
	
	public void testhashCode(){
		DefaultAnswer a = new DefaultAnswer();
		a.setIdentifier("hey");
		assertEquals(a.hashCode(),a.getIdentifier().hashCode());
	}
	
	public void testgetTextValue(){
		DefaultAnswer a = new DefaultAnswer();
		a.setTextValue("hey");
		assertSame("hey",a.getTextValue());
	}
	
	public void testsetTextValue(){
		DefaultAnswer a = new DefaultAnswer();
		a.setTextValue("hey");
		assertSame("hey",a.getTextValue());
	}
	
	public void testgetPercentCredit(){
		DefaultAnswer a = new DefaultAnswer();
		a.setPercentCredit(3.6f);
		assertNotSame(3.6f,a.getPercentCredit());
	}
	
	public void testsetPercentCredit(){
		DefaultAnswer a = new DefaultAnswer();
		a.setPercentCredit(3.6f);
		assertNotSame(3.6f,a.getPercentCredit());
	}
	
	public void testgetIdentifier(){
		DefaultAnswer a = new DefaultAnswer();
		a.setIdentifier("hey");
		assertSame("hey",a.getIdentifier());
	}
	
	public void testsetIdentifier(){
		DefaultAnswer a = new DefaultAnswer();
		a.setIdentifier("hey");
		assertSame("hey",a.getIdentifier());
	}
	
	public void testgetFeedBack(){
		DefaultAnswer a = new DefaultAnswer();
		a.setFeedback("hey");
		assertSame("hey",a.getFeedBack());
	}
	
	public void testsetFeedBack(){
		DefaultAnswer a = new DefaultAnswer();
		a.setFeedback("hey");
		assertSame("hey",a.getFeedBack());
	}	
}