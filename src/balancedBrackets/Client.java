package balancedBrackets;

public class Client {

	public static void main(String[] args) {
		BalancedBrackets balancedBrackets = new BalancedBrackets();
		boolean value = balancedBrackets.isBalanced("([{}])");

		if (value) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
