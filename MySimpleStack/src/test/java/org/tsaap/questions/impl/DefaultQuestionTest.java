package org.tsaap.questions.impl;

import java.util.List;

import junit.framework.TestCase;

import org.tsaap.questions.AnswerBlock;
import org.tsaap.questions.QuestionBlock;
import org.tsaap.questions.QuestionType;
import org.tsaap.questions.TextBlock;

public class DefaultQuestionTest extends TestCase{
	
	public void testaddAnswerBlock(){
		DefaultAnswerBlock fragment = new DefaultAnswerBlock();
		DefaultQuestion Q= new DefaultQuestion();
		Q.addAnswerBlock(fragment);
		assertFalse(Q.getBlockList().size()==0);
		assertFalse(Q.getAnswerBlockList().size()==0);
	}
	
	public void testaddTextBlock(){
		TextBlock fragment =null;
		DefaultQuestion Q= new DefaultQuestion();
		Q.addTextBlock(fragment);
		assertFalse(Q.getBlockList().size()==0);
		assertFalse(Q.getTextBlockList().size()==0);

	}
	
	public void testsetTitle(){
		DefaultQuestion t = new DefaultQuestion();
		t.setTitle("hey");
		assertEquals("hey",t.getTitle());
	}
	
	public void testgetTitle(){
		DefaultQuestion t = new DefaultQuestion();
		t.setTitle("hey");
		assertEquals("hey",t.getTitle());
	}
	
	
	public void testgetQuestionType(){
		DefaultQuestion t = new DefaultQuestion();
		QuestionType q = QuestionType.Undefined;
		t.setQuestionType(q);
		assertEquals(q,t.getQuestionType());
	}
	
	public void testsetQuestionType(){
		DefaultQuestion t = new DefaultQuestion();
		QuestionType q = QuestionType.Undefined;
		t.setQuestionType(q);
		assertEquals(q,t.getQuestionType());
	}
	
	public void testgetBlockList(){
		DefaultQuestion t = new DefaultQuestion();
		List<QuestionBlock> l = t.getBlockList();
		assertTrue(l.size()==0);
	}
	
	public void testgetanswerBlockList(){
		DefaultQuestion t = new DefaultQuestion();
		List<AnswerBlock> l = t.getAnswerBlockList();
		assertTrue(l.size()==0);
	}
	
	public void testgetTextBlockList(){
		DefaultQuestion t = new DefaultQuestion();
		List<TextBlock> l = t.getTextBlockList();
		assertTrue(l.size()==0);
	}

}