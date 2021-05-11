package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String middleName;
    private final String lastname;
    private final String nickname;
    private final String photo;
    private final String title;
    private final String company;
    private final String address;
    private final String homePhone;
    private final String mobilePhone;
    private final String workPhone;
    private final String faxPhone;
    private final String firstEmail;
    private final String secondEmail;
    private final String thirdEmail;
    private final String homepage;
    private final String secondAddress;
    private final String secondHomePhone;
    private final String notes;

    public ContactData(String firstname, String middleName, String lastname, String nickname, String photo, String title, String company, String address, String homePhone, String mobilePhone, String workPhone, String faxPhone, String firstEmail, String secondEmail, String thirdEmail, String homepage, String secondAddress, String secondHomePhone, String notes) {
        this.firstname = firstname;
        this.middleName = middleName;
        this.lastname = lastname;
        this.nickname = nickname;
        this.photo = photo;
        this.title = title;
        this.company = company;
        this.address = address;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.faxPhone = faxPhone;
        this.firstEmail = firstEmail;
        this.secondEmail = secondEmail;
        this.thirdEmail = thirdEmail;
        this.homepage = homepage;
        this.secondAddress = secondAddress;
        this.secondHomePhone = secondHomePhone;
        this.notes = notes;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPhoto() {
        return photo;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public String getFaxPhone() {
        return faxPhone;
    }

    public String getFirstEmail() {
        return firstEmail;
    }

    public String getSecondEmail() {
        return secondEmail;
    }

    public String getThirdEmail() {
        return thirdEmail;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getSecondAddress() {
        return secondAddress;
    }

    public String getSecondHomePhone() {
        return secondHomePhone;
    }

    public String getNotes() {
        return notes;
    }
}
