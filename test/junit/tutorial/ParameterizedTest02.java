package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
@RunWith(Theories.class)
public class ParameterizedTest02 {
	// DataPointsを使用した定義
	@DataPoints
	public static Fixture[] INT_PARAMS = {
			new Fixture(1,2,3),
			new Fixture(0,2,2),
	};
	// DataPointを使用した定義
	@DataPoint
	public static Fixture INT_PARAM_1 =new Fixture(1,2,3);
	@DataPoint
	public static Fixture INT_PARAM_2 = new Fixture(0,2,2);
	
	
	@SuppressWarnings("deprecation")
	@Theory
	public void testCase(Fixture params)throws Exception{
		assertThat(params.x + params.y, is(params.expected));
	}

	
}
class Fixture{
	int x;
	int y;
	int expected;
	
	Fixture(int x,int y,int expected){
		this.x = x;
        this.y = y;
        this.expected = expected;
	}
}
