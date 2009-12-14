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

		
		// Testing remove.
		
	
		public void testNothing(){
			System.out.println("Points: " + points);
		}
		
		public static void main(String args[]) {
			junit.swingui.TestRunner.run(Testing.class);
		}
}