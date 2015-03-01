
public class SwitchWithEnums {

	public static void main(String[] args) {

//		int month = 1;
		Month month = Month.FEBRUARI;
		
		switch (month) {
		case JANUARI:
			System.out.println("The month is Januari");
			break;
		case FEBRUARI:
			System.out.println("The month is Februari");
			break;
		case MARCH:
			System.out.println("The month is March");
			break;

		default:
			break;
		}

	}

}
