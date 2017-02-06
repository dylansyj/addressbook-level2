package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {
	public static final String EXAMPLE = "Uvuwevwevwev";
	public static final String MESSAGE_CONTACT_CONSTRAINTS = "Person contact is empty";
	public static final String CONTACT_VALIDATION_REGEX = ".+";
	
	public String value;
	private boolean isPrivate;
	
	/**
	 *  Validates given contact details
	 *  
	 *  @throws IllegalValueException if given empty string 
	 */
	
	public Contact (String contact, boolean isPrivate) throws IllegalValueException{
		this.isPrivate = isPrivate;
		String trimmedContact = contact.trim();
		if(!isValidContact(trimmedContact)){
			throw new IllegalValueException(MESSAGE_CONTACT_CONSTRAINTS);
		}
		this.value = trimmedContact;
	}
	
	/*
	 * Checks if a given string is a valid contact
	 */
	public boolean isValidContact (String trimmedContact){
		return trimmedContact.matches(CONTACT_VALIDATION_REGEX);
	}
	
	@Override
	public String toString(){
		return value;
	}
	
	@Override
	public boolean equals(Object other){
		return other == this
				|| (other instanceof Contact
				&& this.value.equals(((Contact)other).value));
	}
	
	@Override
	public int hashCode(){
		return value.hashCode();
	}
	
	public boolean isPrivate(){
		return isPrivate;
	}
}
