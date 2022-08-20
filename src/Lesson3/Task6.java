package Lesson3;

public class Task6 {

// Надана електронна адреса користувача: john_smith@example.com. Створіть два рядки «login» і «domain», які будуть підрядками повної електронної адреси.
// Ім'я та прізвище користувача повинні бути у форматі «Ім'я Прізвище».
// The result should be: login = "John Smith" domain = "example.com"

    public static void main(String[] args) {
        String s = "\"";
        String eMail = "Volodymyr_operchuk@uKr.net";

        String login = eMail.substring(0, eMail.indexOf("@"));
        String domain = eMail.substring(eMail.indexOf("@")+1);
        String domainF = domain.toLowerCase();

        String firstName = login.substring(0, login.indexOf("_"));
        String firstNameF = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        String lostName = login.substring(login.indexOf("_")+1, login.length());
        String lostNameF = lostName.substring(0,1).toUpperCase() + lostName.substring(1);

        System.out.println(s + firstNameF + " " + lostNameF + s);
        System.out.println(s + domainF + s);
    }
}
