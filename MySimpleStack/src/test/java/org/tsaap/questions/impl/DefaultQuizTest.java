package org.tsaap.questions.impl;

import junit.framework.TestCase;

public class DefaultQuizTest extends TestCase{
	
	public void testaddQuestion(){
		DefaultQuiz Q = new DefaultQuiz();
		DefaultQuestion k = new DefaultQuestion();
		Q.addQuestion(k);
		assertFalse(Q.getQuestionList().size()==0);
	}
	
	public void testgetQuestionList(){
		DefaultQuiz Q = new DefaultQuiz();
		DefaultQuestion k = new DefaultQuestion();
		Q.addQuestion(k);
		assertTrue(Q.getQuestionList().size()==1);
	}
}
