package junit.tutorial;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpectedExceptionTest {
	// ��O���������҂��Ȃ��ꍇ�̂��߂�ExpectedException.none()�ɂ���
	@Rule
	public ExpectedException exException = ExpectedException.none();

	@Test
	public void ��O���b�Z�[�W�����[�����g���Č��؂���e�X�g()throws Exception{
		exException.expect(ArithmeticException.class);
		exException.expectMessage(containsString("by zero"));
		int result = 1/0;
		System.out.println(result);
	}

}
