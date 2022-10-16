package ObjectOrienteradKurs.Sprint2.Inlämningsuppgift2;

public class Membership {
    private int year;
    private int month;
    private int day;

    private int name;
    private int personalNumber;




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
