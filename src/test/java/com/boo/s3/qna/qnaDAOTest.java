package com.boo.s3.qna;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.boo.s3.MyTestCase;


public class qnaDAOTest extends MyTestCase {

	@Autowired
	private QnaDAO qnaDAO;
	
//	@Test
//	public void qnaWriteTest() throws Exception {
//		QnaDTO qnaDTO = new QnaDTO();
//		qnaDTO.setTitle("test title 1");
//		qnaDTO.setWriter("test writer 1");
//		qnaDTO.setContents("test contents 1");
//		int result = qnaDAO.qnaWrite(qnaDTO);
//		assertNotEquals(0, result);
//	}
	
	@Test
	public void qnaReplyTest() throws Exception{
		// 답글
		QnaDTO child = new QnaDTO();
		child.setTitle("Test Reply Title 2");
		child.setWriter("Test Reply Writer 2");
		child.setContents("Test Reply Contents 2");
		
		// 부모글 정보
		QnaDTO parent = qnaDAO.qnaSelect(4);
//		System.out.println(parent.getRef());
//		System.out.println(parent.getStep());
//		System.out.println(parent.getDepth());
		
		// 부모글 정보로 답글에 정보 입력
		
		// ref는 부모의 ref
		
		//update
		qnaDAO.qnaReplyUpdate(parent);
		
		child.setRef(parent.getRef());
		child.setStep(parent.getStep()+1);
		child.setDepth(parent.getDepth()+1);
		
		int result = qnaDAO.qnaReply(child);
		assertNotEquals(0, result);
		//assertNotNull(parent);
		
	}

}
