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
			points += 3;
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
			points += 3;
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
			points += 3;
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
			points += 3;
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
			points += 3;
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
			points += 3;
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
			points += 3;
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
			points += 3;
		}

		
		public void testingRotations(){
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
			assertEquals(0, b.getRotationCount());
			points += 4;
			
			// Only single rotations
			b = new AVLTree<Integer>();
			for (int i = 1; i <= 1000; i++) b.insert(i);
			assertEquals(990, b.getRotationCount());
			points += 3;
			
			//Only single rotations 
			b = new AVLTree<Integer>();
			for (int i = 1000; i >= 1; i--) b.insert(i);
			assertEquals(990, b.getRotationCount());
			points += 3;
			
			//only double rotations 
			b = new AVLTree<Integer>();	
			b.insert(1);
			b.insert(64);
			b.insert(32);
			//double
			// tree complete
			b.insert(48);
			b.insert(56);
			// double
			b.insert(40);
			//double
			b.insert(60);
			//double
			// tree complete
			b.insert(52);
			b.insert(54);
			//double
			b.insert(58);
			//double
			b.insert(53);
			//double
			b.insert(50);
			//double
			b.insert(51);
			//double
			b.insert(57);
			//double
			b.insert(62);
			//double
			// tree complete
			b.insert(36);
			b.insert(38);
			//double
			b.insert(34);
			//double
			b.insert(39);
			//double
			b.insert(44);
			//double
			b.insert(35);
			//double
			b.insert(42);
			//double
			b.insert(16);
			//double
			b.insert(49);
			//double
			assertEquals(38, b.getRotationCount());
			points += 4;
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
		points += 3;
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
		points += 3;
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
		points += 3;
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
		points += 3;
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
		points += 3;
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
		points += 3;
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
		points += 3;
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
		points += 3;
	}
	
		public void testNothing(){
			System.out.println("Points: " + points);
		}
		
		public static void main(String args[]) {
			junit.swingui.TestRunner.run(Testing.class);
		}
}