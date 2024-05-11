package org.example;


public class User {

    private final String ssn; //требуется
    private final String firstName; //требуется
    private final String lastName; //требуется
    private final String phone; //необязательно
    private final String address; //необязательно

    private User(UserBuilder builder) {
        this.ssn = builder.ssn;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phone = builder.phone;
        this.address = builder.address;
    }
    public   String getSsn() {
        return ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "ssn='" + ssn + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class UserBuilder {

        private final String ssn;
        private final String firstName;
        private final String lastName;
        private String phone;
        private String address;

        public UserBuilder(String ssn, String firstName, String lastName) {
            this.ssn = ssn;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}