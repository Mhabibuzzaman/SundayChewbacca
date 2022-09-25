package Assignment_5;

public class Problem1 {

	public Integer maximum(Integer[] list) {

		int maximum = list[0];
		for (int i : list) {
		    if (i > maximum) {
		        maximum = i;
		    }
		}
		return maximum;
		}



}
