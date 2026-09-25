package genericfeaturespack;

import java.util.List;
import java.util.ArrayList;
public class UnboundedWildCard {

		private static void printList(List <?>list) {
			System.out.println(list);
			public static void main(String[] args) {
				List<Integer>intList=new ArrayList();
				intList.add(10);
				intList.add(20);
				printList(intList);
				List<Double>doubleList=new ArrayList();
				doubleList.add(13.2);
				doubleList.add(15.6);
				printList(doubleList);
		}

	}

}
