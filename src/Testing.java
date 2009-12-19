import java.util.ArrayList;
import java.util.Iterator;

import junit.framework.TestCase;

public class Testing extends TestCase{
	
	private static int points = 0;
	
		public void testingAVLInsertBasics(){
			AVLTree<Integer> b = new AVLTree<Integer>();
			assertTrue(b.insert(5));
			
			Iterator<Integer> i = b.iterator();
			ArrayList<Integer> m = new ArrayList<Integer>();
			m.add(5);
			ArrayList<Boolean> v = new ArrayList<Boolean>();
			v.add(false);
			assertTrue(i.hasNext());
			for (int k = 0; k < m.size(); k++){
				assertEquals(m.get(k), i.next());
				assertEquals((boolean)v.get(k), i.hasNext());
			}
			assertEquals(0, b.getRotationCount());
			points += 4;
		}
		
		public void testingAVLInsertSingleRightRotation(){		
			AVLTree<Integer> b = new AVLTree<Integer>();
			b.insert(7);
			b.insert(9);
			b.insert(5);
			b.insert(3);
			b.insert(1);
			Iterator<Integer> i = b.iterator();
			ArrayList<Integer> m = new ArrayList<Integer>();
			m.add(7); m.add(3); m.add(1);  m.add(5); m.add(9);
			ArrayList<Boolean>
			v = new ArrayList<Boolean>();
			v.add(true); v.add(true); v.add(true); v.add(true); v.add(false);
			assertTrue(i.hasNext());
			for (int k = 0; k < m.size(); k++){
				assertEquals(m.get(k), i.next());
				assertEquals((boolean)v.get(k), i.hasNext());
			}
			assertEquals(1, b.getRotationCount());
			points += 4;
		}
		
		public void testingAVLInsertSingleRightRotationWithRoot(){		
			AVLTree<Integer> b = new AVLTree<Integer>();
			b.insert(9);
			b.insert(7);
			b.insert(5);
			Iterator<Integer> i = b.iterator();
			ArrayList<Integer> m = new ArrayList<Integer>();
			m.add(7); m.add(5); m.add(9);
			ArrayList<Boolean>
			v = new ArrayList<Boolean>();
			v.add(true); v.add(true); v.add(false);
			assertTrue(i.hasNext());
			for (int k = 0; k < m.size(); k++){
				assertEquals(m.get(k), i.next());
				assertEquals((boolean)v.get(k), i.hasNext());
			}
			assertEquals(1, b.getRotationCount());
			points += 4;
		}
	
		public static void testingAVLInsertDoubleRightRotation(){		
			AVLTree<Integer> b = new AVLTree<Integer>();
			b.insert(7);
			b.insert(9);
			b.insert(3);
			b.insert(5);
			b.insert(4);
			Iterator<Integer> i = b.iterator();
			ArrayList<Integer> m = new ArrayList<Integer>();
			m.add(7); m.add(4); m.add(3); m.add(5); m.add(9);
			ArrayList<Boolean>
			v = new ArrayList<Boolean>();
			v.add(true); v.add(true); v.add(true); v.add(true); v.add(false);
			assertTrue(i.hasNext());
			for (int k = 0; k < m.size(); k++){
				assertEquals(m.get(k), i.next());
				assertEquals((boolean)v.get(k), i.hasNext());
			}
			assertEquals(2, b.getRotationCount());
			points += 4;
		}
		
		public static void testingAVLInsertDoubleRightRotationWithRoot(){		
			AVLTree<Integer> b = new AVLTree<Integer>();
			b.insert(9);
			b.insert(5);
			b.insert(7);
			Iterator<Integer> i = b.iterator();
			ArrayList<Integer> m = new ArrayList<Integer>();
			m.add(7); m.add(5); m.add(9);
			ArrayList<Boolean>
			v = new ArrayList<Boolean>();
			v.add(true); v.add(true); v.add(false);
			assertTrue(i.hasNext());
			for (int k = 0; k < m.size(); k++){
				assertEquals(m.get(k), i.next());
				assertEquals((boolean)v.get(k), i.hasNext());
			}
			assertEquals(2, b.getRotationCount());
			points += 4;
		}
	
		public void testingAVLInsertSingleLeftRotation(){		
			AVLTree<Integer> b = new AVLTree<Integer>();
			b.insert(3);
			b.insert(1);
			b.insert(5);
			b.insert(7);
			b.insert(9);
			Iterator<Integer> i = b.iterator();
			ArrayList<Integer> m = new ArrayList<Integer>();
			m.add(3); m.add(1); m.add(7); m.add(5); m.add(9);
			ArrayList<Boolean>
			v = new ArrayList<Boolean>();
			v.add(true); v.add(true); v.add(true); v.add(true); v.add(false);
			assertTrue(i.hasNext());
			for (int k = 0; k < m.size(); k++){
				assertEquals(m.get(k), i.next());
				assertEquals((boolean)v.get(k), i.hasNext());
			}
			assertEquals(1, b.getRotationCount());
			points += 4;
		}
		
		public void testingAVLInsertSingleLeftRotationWithRoot(){		
			AVLTree<Integer> b = new AVLTree<Integer>();
			b.insert(5);
			b.insert(7);
			b.insert(9);
			Iterator<Integer> i = b.iterator();
			ArrayList<Integer> m = new ArrayList<Integer>();
			m.add(7); m.add(5); m.add(9);
			ArrayList<Boolean>
			v = new ArrayList<Boolean>();
			v.add(true); v.add(true); v.add(false);
			assertTrue(i.hasNext());
			for (int k = 0; k < m.size(); k++){
				assertEquals(m.get(k), i.next());
				assertEquals((boolean)v.get(k), i.hasNext());
			}
			assertEquals(1, b.getRotationCount());
			points += 4;
		}
	
		public static void testingAVLInsertDoubleLeftRotation(){		
			AVLTree<Integer> b = new AVLTree<Integer>();
			b.insert(3);
			b.insert(1);
			b.insert(5);
			b.insert(9);
			b.insert(7);
			Iterator<Integer> i = b.iterator();
			ArrayList<Integer> m = new ArrayList<Integer>();
			m.add(3); m.add(1); m.add(7); m.add(5); m.add(9);
			ArrayList<Boolean>
			v = new ArrayList<Boolean>();
			v.add(true); v.add(true); v.add(true); v.add(true); v.add(false);
			assertTrue(i.hasNext());
			for (int k = 0; k < m.size(); k++){
				assertEquals(m.get(k), i.next());
				assertEquals((boolean)v.get(k), i.hasNext());
			}
			assertEquals(2, b.getRotationCount());
			points += 4;
		}
		
		public static void testingAVLInsertDoubleLeftRotationWithRoot(){		
			AVLTree<Integer> b = new AVLTree<Integer>();
			b.insert(5);
			b.insert(9);
			b.insert(7);
			Iterator<Integer> i = b.iterator();
			ArrayList<Integer> m = new ArrayList<Integer>();
			m.add(7); m.add(5); m.add(9);
			ArrayList<Boolean>
			v = new ArrayList<Boolean>();
			v.add(true); v.add(true); v.add(false);
			assertTrue(i.hasNext());
			for (int k = 0; k < m.size(); k++){
				assertEquals(m.get(k), i.next());
				assertEquals((boolean)v.get(k), i.hasNext());
			}
			assertEquals(2, b.getRotationCount());
			points += 4;
		}

		public static void nums(int lower, int upper, Iterator i){
			if (lower > upper) return;
			int mid = (lower + upper)/2;
			assertEquals(mid, i.next());
			nums(lower, mid - 1, i);
			nums(mid + 1, upper, i);
		}
		
		public void testingStressWithNoRotations(){
			AVLTree<Integer> b = new AVLTree<Integer>();

			// No rotations at all
			int size = 128;
			int v = size / 2;
			int temp;
			while (v > 0) {
				temp = v;
				while (temp < size){
					b.insert(temp);
					temp += v;
					}
				v = v / 2;
			}
			nums(1,127,b.iterator());
			assertEquals(0, b.getRotationCount());
			points += 6;
		}
			
		public void testingStressWithOnlySingleLeftRotations(){
			AVLTree<Integer> b = new AVLTree<Integer>();
			for (int i = 1; i < 128; i++) b.insert(i);
			nums(1, 127, b.iterator());
			assertEquals(120, b.getRotationCount());
			points += 6;
		}
			
		public void testingStressWithOnlySingleRightRotations(){
			AVLTree<Integer> b = new AVLTree<Integer>();
			for (int i = 127; i >= 1; i--) b.insert(i);
			nums(1, 127, b.iterator());
			assertEquals(120, b.getRotationCount());
			points += 6;
		}
		
		public void testingStressWithOnlyDoubleRotations(){
			AVLTree<Integer> b = new AVLTree<Integer>();
			b = new AVLTree<Integer>();	
			int maxx = 64;
			int num = maxx / 2;
			int offset = num;
			int start = offset;
			b.insert(0);
			while (num > 0){
				while (start < maxx) {
					b.insert(start*2);
					b.insert(start*2-1);
					start += offset;
				}
				offset = num;
				num = num/2;
				start = num;
			}
			nums(0,126,b.iterator());
			assertEquals(126, b.getRotationCount());
			points += 6;
		}

		
		public void testingAVLRemoveBasics(){
		AVLTree<Integer> b = new AVLTree<Integer>();
		assertFalse(b.remove(5));
		
		assertTrue(b.insert(5));
		assertTrue(b.remove(5));
		assertEquals(0, b.getRotationCount());
		
		Iterator<Integer> i = b.iterator();
		assertFalse(i.hasNext());
		points += 4;
	}
	
	public void testingAVLRemoveSingleRightRotation(){		
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(7);
		b.insert(9);
		b.insert(5);
		b.insert(3);
		b.insert(6);
		b.insert(10);
		b.insert(1);
		b.remove(6);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(7); m.add(3); m.add(1);  m.add(5); m.add(9); m.add(10);
		ArrayList<Boolean>
		v = new ArrayList<Boolean>();
		v.add(true); v.add(true); v.add(true); v.add(true); v.add(true); v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++){
			assertEquals(m.get(k), i.next());
			assertEquals((boolean)v.get(k), i.hasNext());
		}
		assertEquals(1, b.getRotationCount());
		points += 4;
	}
	
	public void testingAVLRemoveSingleRightRotationWithRoot(){		
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(7);
		b.insert(9);
		b.insert(5);
		b.insert(3);
		b.remove(9);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(5); m.add(3); m.add(7);
		ArrayList<Boolean>
		v = new ArrayList<Boolean>();
		v.add(true); v.add(true); v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++){
			assertEquals(m.get(k), i.next());
			assertEquals((boolean)v.get(k), i.hasNext());
		}
		assertEquals(1, b.getRotationCount());
		points += 4;
	}

	public void testingAVLRemoveDoubleRightRotation(){		
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(7);
		b.insert(9);
		b.insert(5);
		b.insert(3);
		b.insert(6);
		b.insert(10);
		b.insert(4);
		b.remove(6);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(7); m.add(4); m.add(3);  m.add(5); m.add(9); m.add(10);
		ArrayList<Boolean>
		v = new ArrayList<Boolean>();
		v.add(true); v.add(true); v.add(true); v.add(true); v.add(true); v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++){
			assertEquals(m.get(k), i.next());
			assertEquals((boolean)v.get(k), i.hasNext());
		}
		assertEquals(2, b.getRotationCount());
		points += 4;
	}

	public void testingAVLRemoveDoubleRightRotationWithRoot(){		
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(7);
		b.insert(9);
		b.insert(5);
		b.insert(6);
		b.remove(9);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(6); m.add(5); m.add(7);
		ArrayList<Boolean>
		v = new ArrayList<Boolean>();
		v.add(true); v.add(true); v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++){
			assertEquals(m.get(k), i.next());
			assertEquals((boolean)v.get(k), i.hasNext());
		}
		assertEquals(2, b.getRotationCount());
		points += 4;
	}

	public void testingAVLRemoveSingleLeftRotation(){		
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(3);
		b.insert(1);
		b.insert(5);
		b.insert(2);
		b.insert(4);
		b.insert(7);
		b.insert(9);
		b.remove(4);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(3); m.add(1); m.add(2); m.add(7); m.add(5); m.add(9);
		ArrayList<Boolean>
		v = new ArrayList<Boolean>();
		v.add(true); v.add(true); v.add(true); v.add(true); v.add(true); v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++){
			assertEquals(m.get(k), i.next());
			assertEquals((boolean)v.get(k), i.hasNext());
		}
		assertEquals(1, b.getRotationCount());
		points += 4;
	}
	
	public void testingAVLRemoveSingleLeftRotationWithRoot(){		
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(3);
		b.insert(1);
		b.insert(5);
		b.insert(7);
		b.remove(1);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(5); m.add(3); m.add(7); 
		ArrayList<Boolean>
		v = new ArrayList<Boolean>();
		v.add(true); v.add(true); v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++){
			assertEquals(m.get(k), i.next());
			assertEquals((boolean)v.get(k), i.hasNext());
		}
		assertEquals(1, b.getRotationCount());
		points += 4;
	}
	
	public static void testingAVLRemoveDoubleLeftRotation(){		
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(3);
		b.insert(2);
		b.insert(6);
		b.insert(1);
		b.insert(4);
		b.insert(7);
		b.insert(5);
		b.remove(7);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(3); m.add(2); m.add(1); m.add(5); m.add(4); m.add(6);
		ArrayList<Boolean>
		v = new ArrayList<Boolean>();
		v.add(true); v.add(true); v.add(true); v.add(true); v.add(true); v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++){
			assertEquals(m.get(k), i.next());
			assertEquals((boolean)v.get(k), i.hasNext());
		}
		assertEquals(2, b.getRotationCount());
		points += 4;
	}	
	
	public static void testingAVLRemoveDoubleLeftRotationWithRoot(){		
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(3);
		b.insert(1);
		b.insert(5);
		b.insert(4);
		b.remove(1);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(4); m.add(3); m.add(5); 
		ArrayList<Boolean>
		v = new ArrayList<Boolean>();
		v.add(true); v.add(true); v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++){
			assertEquals(m.get(k), i.next());
			assertEquals((boolean)v.get(k), i.hasNext());
		}
		assertEquals(2, b.getRotationCount());
		points += 4;
	}
		
		public void testMiscellaneousRemoveCases(){
			AVLTree<Integer> b = new AVLTree<Integer>();
			int size = 8; 
			int v = size / 2;
			int temp;
			while (v > 0) {
				temp = v;
				while (temp < size){
					b.insert(temp);
					temp += v;
					}
				v = v / 2;
			}
			b.remove(4);
			b.remove(3);
			b.remove(2);
			Iterator<Integer> i = b.iterator();
			assertTrue(i.hasNext());
			int t1 = i.next();
			assertTrue(i.hasNext());
			int t2 = i.next();
			assertTrue(i.hasNext());
			int t3 = i.next();
			assertTrue(i.hasNext());
			int t4 = i.next();
			assertFalse(i.hasNext());
			if (!((t1 == 6 && t2 == 1 && t3 == 5 && t4 == 7)||
				  (t1 == 5 && t2 == 1 && t3 == 6 && t4 == 7)))
				fail();
			points+=4;
		}
		

	
		public void testNothing(){
			System.out.println("Points: " + points);
		}
		
		public static void main(String args[]) {
			junit.swingui.TestRunner.run(Testing.class);
		}
}