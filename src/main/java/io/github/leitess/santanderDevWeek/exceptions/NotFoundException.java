package io.github.leitess.santanderDevWeek.exceptions;

import io.github.leitess.santanderDevWeek.util.MessageUtils;

public class NotFoundException extends  RuntimeException {

    public NotFoundException() {
        super(MessageUtils.NO_RECORD_FOUND);
    }
}
