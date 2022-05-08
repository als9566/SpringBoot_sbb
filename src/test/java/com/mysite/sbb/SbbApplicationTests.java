package com.mysite.sbb;

//test_1
import java.time.LocalDateTime; 

//test_2
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;

import com.mysite.sbb.question.QuestionService;

// @SpringBootTest : ��������Ʈ �׽�Ʈ Ŭ�������� �ǹ�
@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private QuestionService questionService;

//test_1 (������ �����ϱ�)
//	@Test
//    void testJpa() {        
//        Question q1 = new Question();
//        q1.setSubject("sbb�� �����ΰ���?");
//        q1.setContent("sbb�� ���ؼ� �˰� �ͽ��ϴ�.");
//        q1.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q1);  // ù��° ���� ����
//
//        Question q2 = new Question();
//        q2.setSubject("��������Ʈ �� �����Դϴ�.");
//        q2.setContent("id�� �ڵ����� �����ǳ���?");
//        q2.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q2);  // �ι�° ���� ����
//    }
	
//test_2 (������ ��ȸ�ϱ�_findAll)
//	@Test
//    void testJpa() {
//        List<Question> all = this.questionRepository.findAll();
//        assertEquals(2, all.size());
//
//        Question q = all.get(0);
//        assertEquals("sbb�� �����ΰ���?", q.getSubject());
//    }
	
//test_3 (������ ��ȸ�ϱ�_findById)
//	@Test
//    void testJpa() {
//        Optional<Question> oq = this.questionRepository.findById(1);
//        if(oq.isPresent()) {
//            Question q = oq.get();
//            assertEquals("sbb�� �����ΰ���?", q.getSubject());
//        }
//    }
	
//test_4 (������ ��ȸ�ϱ�_findBySubject)
//	@Test
//    void testJpa() {
//        Question q = this.questionRepository.findBySubject("sbb�� �����ΰ���?");
//        assertEquals(1, q.getId());
//    }
	
//test_5 (������ ��ȸ�ϱ�_findBySubjectAndContent)
//	@Test
//    void testJpa() {
//        Question q = this.questionRepository.findBySubjectAndContent(
//                "sbb�� �����ΰ���?", "sbb�� ���ؼ� �˰� �ͽ��ϴ�.");
//        assertEquals(1, q.getId());
//    }
	
//test_6 (������ ��ȸ�ϱ�_findBySubjectLike)
//	@Test
//    void testJpa() {
//        List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//        Question q = qList.get(0);
//        assertEquals("sbb�� �����ΰ���?", q.getSubject());
//    }

//test_7 (������ �����ϱ�)
//	@Test 
//    void testJpa() {
//        Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        q.setSubject("������ ����");  // �����ͼ���
//        this.questionRepository.save(q); // ����� ����������
//    }
	
//test_8 (������ �����ϱ�)
//	@Test
//    void testJpa() {
//        assertEquals(2, this.questionRepository.count());
//        Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        this.questionRepository.delete(q); //�����ͻ���
//        assertEquals(1, this.questionRepository.count());
//    }

//test_9 (�亯 ������ ���� �� �����ϱ�)
//	@Test
//    void testJpa() {
//        Optional<Question> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//
//        Answer a = new Answer();
//        a.setContent("�� �ڵ����� �����˴ϴ�.");
//        a.setQuestion(q);  // � ������ �亯���� �˱����ؼ� Question ��ü�� �ʿ��ϴ�.
//        a.setCreateDate(LocalDateTime.now());
//        this.answerRepository.save(a);
//    }
	
//test_10 (�亯 ��ȸ�ϱ�)
//	@Test
//    void testJpa() {
//        Optional<Answer> oa = this.answerRepository.findById(1);
//        assertTrue(oa.isPresent());
//        Answer a = oa.get();
//        assertEquals(2, a.getQuestion().getId());
//    }
	
//test_11 (�亯�� ����� �亯 ã��)
//	@Transactional
//	@Test
//    void testJpa() {
//        Optional<Question> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//
//        List<Answer> answerList = q.getAnswerList();
//
//        assertEquals(1, answerList.size());
//        assertEquals("�� �ڵ����� �����˴ϴ�.", answerList.get(0).getContent());
//    }
	
	// �뷮 �׽�Ʈ ������ ����� 
	@Test
    void testJpa() {
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("�׽�Ʈ �������Դϴ�:[%03d]", i);
            String content = "���빫";
            this.questionService.create(subject, content, null);
        }
    }
}
