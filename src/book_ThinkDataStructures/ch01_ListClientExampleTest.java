package book_ThinkDataStructures;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ch01_ListClientExampleTest {
	/**
	 * Test method for {@link ch01_ListClientExample}.
	 */
	@Test
	public void test() {
		ch01_ListClientExample lce = new ch01_ListClientExample();
		@SuppressWarnings("rawtypes")
		List list = lce.getList();
		// assertThat : 두 값을 비교. 첫번째 파라미터에는 비교대상 값을, 두번째 파라미터로는 비교로직이 담긴 Matcher가 사용된다.
		// instanceOf : instanceOf, isCompatibleType - test type
		// assertThat(list, instanceOf(ArrayList.class)); -- FAIL
		assertThat(list, instanceOf(LinkedList.class)); // -- SUCCESS
	}
}
