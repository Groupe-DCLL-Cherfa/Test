package org.tsaap.questions.impl;

import junit.framework.TestCase;

public class DefaultUserAnswerBlockTest extends TestCase{
	
	public void testgetAnswerList(){
		DefaultUserAnswerBlock U = new DefaultUserAnswerBlock();
		assertNotNull(U.getAnswerList());
	}
	
	public void testevaluatePercentCredit(){
		DefaultUserAnswerBlock e = new DefaultUserAnswerBlock();
		DefaultAnswer da = new DefaultAnswer();
		da.setPercentCredit(3.6f);
		e.getAnswerList().add(da);
		float r =e.evaluatePercentCredit();
		assertTrue(r==3.6f);
	}
}