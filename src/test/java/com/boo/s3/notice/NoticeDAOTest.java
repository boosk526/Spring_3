package com.boo.s3.notice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.boo.s3.MyTestCase;
import com.boo.s3.notice.NoticeDAO;
import com.boo.s3.notice.NoticeDTO;
import com.boo.s3.util.Pager;

public class NoticeDAOTest extends MyTestCase {

//	@Autowired
//	private NoticeDAO noticeDAO;
//	
//	@BeforeClass
//	public static void before() {
//		System.out.println("Before Class");
//	}
//	
//	@AfterClass
//	public static void after() {
//		System.out.println("After Class");
//	}
//	
//	@Test
//	public void noticeCountTest() throws Exception{
//		
//	}
//	
//	@Test
//	public void noticeListTest() throws Exception {
//		Pager pager = new Pager();
//		pager.setStartRow(11);
//		pager.setLastRow(20);
//		List<NoticeDTO> ar = noticeDAO.noticeList(pager);
//		assertEquals(10, ar.size());
//	}
//	
////	//noticeDeleteTest
////	@Test
////	public void noticeDeleteTest() throws Exception {
////		System.out.println("Delete");
////		int result = noticeDAO.noticeDelete(16);
////		assertNotEquals(0, result);
////	}
//	
//	//noticeInsertTest
////	@Test
////	public void noticeInsertTest() throws Exception {
////		System.out.println("Insert");
////
////		for(int i=0;i<100;i++) {
////			NoticeDTO noticeDTO = new NoticeDTO();
////			noticeDTO.setTitle("Title"+i);
////			noticeDTO.setWriter("Writer"+i);
////			noticeDTO.setContents("Contents"+i);
////			int result = noticeDAO.noticeWrite(noticeDTO);
////			if(i%10==0) {
////				Thread.sleep(1000);
////			}
////		}
////
////		//assertNotEquals(0, result);
////
////	}
//	
//	@Before
//	public void beforeTest() {
//		System.out.println("Before Method");
//	}
//	
//	@After
//	public void AfterTest() {
//		System.out.println("After Method");
//	}
//	
////	@Test
////	public void noticeSelectTest() throws Exception {
////		NoticeDTO noticeDTO = noticeDAO.noticeSelect(6);
////		System.out.println(noticeDTO.getTitle());
////		
////		//단정문 null이면 success
////		//assertNull(noticeDTO);
////		//단정문 null이면 fail
////		//assertNotNull(noticeDTO);
////	}
//	
//	
//	
	

}
