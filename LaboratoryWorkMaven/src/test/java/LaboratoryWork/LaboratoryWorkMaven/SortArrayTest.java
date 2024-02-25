package LaboratoryWork.LaboratoryWorkMaven;

import LaboratoryWork.LaboratoryWorkMaven.SortArray.SortArrayClass;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class SortArrayTest {
	
	@BeforeClass
	public void runBeforeClassSortArrayClass() {
		
	}
	
	@Test
	public void SortArrayClass() {
		int count = 0;
		SortArrayClass SortArrayClass = new SortArrayClass();
		int[] array1 = SortArrayClass.SortArrayResult();
		
		for (int i1 = 0;i1 < array1.length - 1;i1++) {
			if (array1[i1] <= array1[i1 + 1]) {
				count++;
			}
		}
		
		assertEquals(count,array1.length - 1);
	}
	
	@AfterClass
	public void runAfterClassSortArrayClass() {
		
	}
}
