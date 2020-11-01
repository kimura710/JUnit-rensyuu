package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import javax.annotation.processing.SupportedAnnotationTypes;
import javax.swing.SwingUtilities;
import javax.swing.plaf.synth.SynthGraphicsUtils;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;

public class VerifierExampleTest {

		@Rule
		public Verifier verifier = new Verifier() {
			protected void verify() throws Throwable{
				assertThat("value should be 0.", sut.value,is(0));
			}
		};
	  VerifierExample sut;
	  // ������
	  @Before
	  public void setUp()throws Exception{
		  sut = new VerifierExample();
	  }
	  //�@�㏈��
	  @After
	  public void tearDown() throws Exception{
		  
	  }
	  @Test
	  public void clear���\�b�h�Ōv�Z���ʂ���������0�ɂ���e�X�g()throws Exception{
		  sut.set(0);
		  sut.add(140);
		  sut.minus(7);
		  assertThat(sut.getValue(), is(135));
		  sut.clear();
	  }
}
