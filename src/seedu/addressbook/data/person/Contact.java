package seedu.addressbook.data.person;

public class Contact {
	public final String value;
	protected boolean isProtected;
	
	public Contact(String contact, boolean isProtected) {
		this.isProtected = isProtected;
		this.value = contact;
	}
	
	@Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }


    public boolean isProtected() {
        return isProtected;
    }
}
