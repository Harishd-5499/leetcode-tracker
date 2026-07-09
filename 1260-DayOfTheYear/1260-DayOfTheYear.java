// Last updated: 7/9/2026, 9:11:53 AM
import java.time.LocalDate;

class Solution {
	public int dayOfYear(String date) {
		return LocalDate.parse(date).getDayOfYear();
	}
}
