package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

public class Tagging {
	private String action;
	private String name;
    private String tag;
    
    public Tagging(String action, Person person, Tag tag) {
    	if(action == "Add") {
    		this.action = "+";
    	} else if(action == "Remove") {
    		this.action = "-";
    	}
    	
    	this.name = person.getName().toString();
    	this.tag = tag.toString();
    }
    
    @Override
    public String toString() {
    	return action + " " + name + " " + tag;
    }
}
