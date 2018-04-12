package seedu.address.model.user.exceptions;

import seedu.address.commons.exceptions.IllegalValueException;

/**
 * Signals that the username that the user does not exist.
 */
public class UserDoesNotExistException extends IllegalValueException {
    public UserDoesNotExistException() {
        super("The username does not exist");
    }
}
