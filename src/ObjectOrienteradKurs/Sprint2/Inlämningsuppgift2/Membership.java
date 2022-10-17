package ObjectOrienteradKurs.Sprint2.Inlämningsuppgift2;

public class Membership {
    private String name;
    private String socialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    private boolean member;

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }


    private boolean customerHistory;

    public boolean isCustomerHistory() {
        return customerHistory;
    }

    public void setCustomerHistory(boolean customerHistory) {
        this.customerHistory = customerHistory;
    }


}
