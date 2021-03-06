//need to optimize in case of conditions

class SolutionvalidIP {
	public static void main(String[] args) {
		System.out.println(isValid("172.16.254.01"));
	}

	public static boolean isValid(String s) {
		int dotcount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '.') {
				dotcount++;
			}
		}
		if (dotcount > 3 || !s.matches("[0-9.]+")) {
			return false;
		}
		String arr[] = s.split("[.]+");
		if (arr.length < 4 || arr.length > 4) {
			return false;
		}
		for (String str : arr) {
			if (str.length() > 3 || (str.length() > 1 && (Integer.valueOf(str) == 0 || str.charAt(0) == '0'))) {
				return false;
			}

			if (!(Integer.valueOf(str) >= 0 && Integer.valueOf(str) <= 255)) {
				return false;
			}

		}
		return true;
	}
}