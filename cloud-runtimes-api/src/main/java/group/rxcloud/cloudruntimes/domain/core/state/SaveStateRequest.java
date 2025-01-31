/*
 * Copyright (c) CloudRuntimes Contributors.
 * Licensed under the MIT License.
 */

package group.rxcloud.cloudruntimes.domain.core.state;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A request to save states to state store.
 */
public class SaveStateRequest {

    private final String storeName;

    private List<group.rxcloud.cloudruntimes.domain.core.state.State<?>> states;

    public SaveStateRequest(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public List<group.rxcloud.cloudruntimes.domain.core.state.State<?>> getStates() {
        return states;
    }

    public SaveStateRequest setStates(List<group.rxcloud.cloudruntimes.domain.core.state.State<?>> states) {
        this.states = states == null ? null : Collections.unmodifiableList(states);
        return this;
    }

    public SaveStateRequest setStates(State<?>... states) {
        this.states = Collections.unmodifiableList(Arrays.asList(states));
        return this;
    }
}
