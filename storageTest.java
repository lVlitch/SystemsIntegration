import static org.junit.Assert.*;

import org.junit.*;

public class StorageTest {
	
	@Test
	public void testSetAndReadTemp() {
		
		float[] temp = {(float) 10.2, (float) 20.1, (float) 30.0};
		
		Storage s = new Storage();
		s.setTemp(temp);
		
		for (int i = 0; i < 2; i++) {
			assertEquals(temp[i], s.readTemp(i), (float)0.1);
		}
						
	}
	
	@Test
	public void testSetAndReadVolt() {
		float[] volt = {(float) 100.2, (float) 200.1, (float) 300.0};
		
		Storage s = new Storage();
		s.setVolt(volt);
		
		for (int i = 0; i < 2; i++) {
			assertEquals(volt[i], s.readVolt(i), (float)0.1);
		}
				
	}
	
	@Test
	public void testSetAndReadCurrent() {
		float[] current = {(float) 300.2, (float) 250.1, (float) 345.8};
		
		Storage s = new Storage();
		s.setCurrent(current);
		
		for (int i = 0; i < 2; i++) {
			assertEquals(current[i], s.readCurrent(i), (float)0.1);
		}
		
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
