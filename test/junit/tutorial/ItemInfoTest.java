package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ItemInfoTest {

	@Rule
	public ErrorCollector errorCollector = new ErrorCollector();

	@Test
	public void ÉãÅ[ÉãìKópéûÇÃåüèÿ() throws Exception{
		ItemInfo itemInfo =new ItemInfo();
		errorCollector.checkThat(itemInfo, is(nullValue()));
		errorCollector.checkThat(itemInfo.getId(), is(""));
		errorCollector.checkThat(itemInfo.getName(),is(""));
		errorCollector.checkThat(itemInfo.getStockNum(),is(0));
	}
	
}
