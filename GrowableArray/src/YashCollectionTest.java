
public class YashCollectionTest {

	public static void main(String args[]) {
		YashCollection yCol = new YashCollection();
		yCol.add("a");
		yCol.add("b");
		yCol.add("c");
		yCol.add(100);
		yCol.add(19.5);
		yCol.add(null);
		yCol.add("a");
		yCol.add("Aditi");
		yCol.add("d");
		yCol.add("Jain");
		yCol.add("e");
		yCol.add("ae");
		yCol.add("as");
		yCol.add("aj");
		yCol.add("ai");
		yCol.add("k");
		yCol.add("f");
		yCol.add("h");
		yCol.add("l");
		yCol.add("g");
		Object[] objects = yCol.list();
		for (Object object : objects) {
			System.out.println(object);
		}
		System.out.println("Total count :" + yCol.elementCount);
		System.out.println("Searched element present:" + yCol.searchElement("Ashwini"));
		System.out.println("Retrieved object:" + yCol.retrieveElement(2));
		System.out.println("Removed object:" + yCol.removeElement("a"));
		Object[] obj = yCol.list();
		for (Object object : obj) {

			System.out.println(object);
			System.out.println("Replace object: " + yCol.replaceElement(5, "Ashwini"));
			Object[] object2 = yCol.list();
			for (Object object1 : object2) {
				System.out.println(object1);
			}
		}
	}
}
