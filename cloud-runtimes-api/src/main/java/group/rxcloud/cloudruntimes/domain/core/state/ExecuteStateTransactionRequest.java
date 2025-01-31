/*
 * Copyright (c) CloudRuntimes Contributors.
 * Licensed under the MIT License.
 */

package group.rxcloud.cloudruntimes.domain.core.state;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ExecuteStateTransactionRequest {

    /**
     * Name of the state store.
     */
    private final String stateStoreName;

    /**
     * Transactional operations list.
     */
    private List<group.rxcloud.cloudruntimes.domain.core.state.TransactionalStateOperation<?>> operations;

    /**
     * Metadata used for transactional operations.
     */
    private Map<String, String> metadata;

    public ExecuteStateTransactionRequest(String stateStoreName) {
        this.stateStoreName = stateStoreName;
    }

    public String getStateStoreName() {
        return stateStoreName;
    }

    public ExecuteStateTransactionRequest setOperations(List<group.rxcloud.cloudruntimes.domain.core.state.TransactionalStateOperation<?>> operations) {
        this.operations = operations == null ? null : Collections.unmodifiableList(operations);
        return this;
    }

    public List<TransactionalStateOperation<?>> getOperations() {
        return operations;
    }

    public ExecuteStateTransactionRequest setMetadata(Map<String, String> metadata) {
        this.metadata = metadata == null ? null : Collections.unmodifiableMap(metadata);
        return this;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }
}
