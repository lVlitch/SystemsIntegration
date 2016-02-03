import static org.junit.Assert.*;

import org.junit.*;

public class StorageTest {
	
	@Test
	public void testSetAndReadTemp() {
		
		float[] temp = {(float) 10.2, (float) 20.1, (float) 30.0};
		
		Storage s = new Storage();
		s.setTemp(temp);
		
		for (int i = 0; i < 8; i++) {
			assertEquals(temp[i], s.readTemp(i), (float)0.1);
		}
		
		
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetAndReadVolt() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetAndReadCurrent() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetAndReadCL() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetAndReadCapacity() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetAndGetCharging() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetAndGetChangeBattery() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetAndGetControlBattery() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetAndGetError() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetAndGetORWarning() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetAndGetRUL() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetAndGetCharge() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetAndGetIsolated() {
		fail("Not yet implemented");
	}
	
	
	
	@Test
	public void testWrite() {
		fail("Not yet implemented");
	}
	

	@Test
	public void testReadSensor() {
		fail("Not yet implemented");
	}

}
