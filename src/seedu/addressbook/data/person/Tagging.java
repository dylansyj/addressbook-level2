package seedu.addressbook.data.person;

import java.util.Iterator;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.tag.Tag;
import seedu.addressbook.data.tag.UniqueTagList;

public class Tagging {
	
	private String type;
	private Tag tag;
	
	/*
	 * Constructor
	 */
	public Tagging(String type,  Tag tag){
		if(type == "ADD"){
			this.type ="+ ";
		}
		else if (type == "REMOVE"){
			this.type ="- ";
		}
		this.tag = tag;
	}
	
	public String getType(){
		return type;
	}
	
	public String getTag(){
		return tag.toString();
	}
}
