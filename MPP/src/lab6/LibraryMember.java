package lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LibraryMember {

    private String memberId;
    private String firstName;
    private String lastName;
    private String phone;

  CheckoutRecord checkoutRecord;

    public LibraryMember(String memberId, String firstName, String lastName, String phone) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getMemberId() {
        return memberId;
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

    public CheckoutRecord getCheckoutRecord() {

        return checkoutRecord;
    }
    public void setCheckoutRecord(CheckoutRecord cr) {
        checkoutRecord=cr;
    }


}
