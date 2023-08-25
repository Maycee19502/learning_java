package day15_StringTasks;

public class PhoneNumberFormatter {

	public static void main(String[] args) {

		String phoneNumber = "7031231234";
		// output = (703) 123-1234

		String areaCode = phoneNumber.substring(0, 3);
		String prefix = phoneNumber.substring(3, 6);
		String LastFour = phoneNumber.substring(6);

		System.out.println("Phone number" + "(" + areaCode + ") " + prefix + " - " + LastFour);
		String formattedPhoneNumber = "(" + areaCode + ")" + prefix + "-" + LastFour;
		System.out.println(formattedPhoneNumber);
		
		String formattedPhoneNumber2 = "".concat("(").concat(areaCode).concat(") ").concat(prefix).concat("-").concat(LastFour);

        System.out.println(formattedPhoneNumber);
        System.out.println(formattedPhoneNumber2);

	}

}
