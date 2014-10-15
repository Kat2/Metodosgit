

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContaTeste {

	@Test
	public void test() {
		int num = 5;
		String num2 = "";
		Contador c = new Contador();
		num2 = c.ContaImpares(num);
		assertEquals("números pares", num2);
	}

}
