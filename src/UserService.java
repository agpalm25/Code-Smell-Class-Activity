public class UserService {
    public void registerUser(EmailService email) {
        if (email.isEmailAddressValid()) {
            String cleanedEmail = email.normalizedEmail();
            // Register the user with the cleaned email
            System.out.println("User registered with email: " + cleanedEmail);
        } else {
            System.out.println("Invalid email address.");
        }
    }
}

public class EmailService {

    private String EmailAddress;

    public EmailService(String Email) {
        this.EmailAddress = Email;
    }

    private boolean checkAdminEmail() {
        return true;
    }

    private boolean isEmailAddressValid() {
        // Simple email validation
        return this.EmailAddress != null && this.EmailAddress.contains("@");

    }

    private String normalizeEmail(String email) {
        return this.EmailAddress.trim().toLowerCase();
    }

}

public class AdminService {
    public void addAdmin(EmailService email) {
        if email.checkAdminEmail(){
            String normalizedEmail = email.normalizedEmail();
            // Add the admin with the normalized email
            System.out.println("Admin added with email: " + normalizedEmail);
        } else {
            System.out.println("Invalid email address.");
        }
    }

}
