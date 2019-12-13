package com.tenduke.events.api.model;

import java.net.URI;

/**
 * Instruction describing how to access older or newer feed events.
 * @author jarkko
 */
public class EventFeedInstruction extends AbstractEventFeedItem {

    /**
     * Value of {@code instruction} field describing that the instruction
     * is for accessing events older than events in the current feed window.
     */
    public static final String INSTRUCTION_OLDER = "older";

    /**
     * Value of {@code instruction} field describing that the instruction
     * is for accessing events newer than events in the current feed window.
     */
    public static final String INSTRUCTION_NEWER = "newer";

    private URI url;

    private String instruction;

    private Integer count;

    /**
     * Initializes a new instance of the {@link EventFeedInstruction} class.
     */
    public EventFeedInstruction() {
        super();
    }

    /**
     * Gets relative URL referring to the instruction target.
     * @return The target URL.
     */
    public URI getUrl() {
        return url;
    }

    /**
     * Sets relative URL referring to the instruction target.
     * @param url The target URL.
     */
    public void setUrl(final URI url) {
        this.url = url;
    }

    /**
     * Gets name describing the instruction.
     * @return Either {@link #INSTRUCTION_OLDER "older"} or {@link #INSTRUCTION_NEWER "newer"}.
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * Sets name describing the instruction.
     * @param instruction Either Either {@link #INSTRUCTION_OLDER "older"} or {@link #INSTRUCTION_NEWER "newer"}.
     */
    public void setInstruction(final String instruction) {
        this.instruction = instruction;
    }

    /**
     * Gets number of events available when accessing events referenced by this instruction.
     * @return If not specified or {@code null}, number of available events is unknown.
     *      {@code -1} means that there is at least one event available, but the exact amount is
     *      unknown. {@code 0} or a positive integer is the exact number of events available.
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets number of events available when accessing events referenced by this instruction.
     * @param count If not specified or {@code null}, number of available events is unknown.
     *      {@code -1} means that there is at least one event available, but the exact amount is
     *      unknown. {@code 0} or a positive integer is the exact number of events available.
     */
    public void setCount(final Integer count) {
        this.count = count;
    }
}
