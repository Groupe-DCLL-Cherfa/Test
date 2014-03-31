package org.tsaap.questions.impl;

import java.util.List;

import org.tsaap.questions.UserAnswerBlock;

import junit.framework.TestCase;

public class DefaultUserResponseTest extends TestCase{
	
	public void testgetUserIdentifier(){
		DefaultUserResponse a = new DefaultUserResponse();
		a.setUserIdentifier("hey");
		assertSame("hey",a.getUserIdentifier());
	}
	
	public void testgetQuestion(){
		DefaultUserResponse a = new DefaultUserResponse();
		DefaultQuestion q = new DefaultQuestion();
		a.setQuestion(q);
		assertSame(q,a.getQuestion());
	}
	
	public void testsetQuestion(){
		DefaultUserResponse a = new DefaultUserResponse();
		DefaultQuestion q = new DefaultQuestion();
		a.setQuestion(q);
		assertSame(q,a.getQuestion());
	}
	
	public void testgetUserAnswerBlockList(){
		DefaultUserResponse a = new DefaultUserResponse();
		List<UserAnswerBlock> l = a.getUserAnswerBlockList();
		assertTrue(l.size()==0);
	}
	
	public void testevaluatePercentCredit(){
		DefaultUserResponse a = new DefaultUserResponse();
		DefaultUserAnswerBlock e = new DefaultUserAnswerBlock();
		DefaultAnswer da = new DefaultAnswer();
		da.setPercentCredit(3.6f);
		e.getAnswerList().add(da);
		a.getUserAnswerBlockList().add(e);
		float r =a.evaluatePercentCredit();
		assertTrue(r==3.6f);
	}
}
