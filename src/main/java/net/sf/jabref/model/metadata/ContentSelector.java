package net.sf.jabref.model.metadata;

import java.util.Collections;
import java.util.List;

public class ContentSelector {

    private final String fieldName;

    private final List<String> values;

    public ContentSelector(String fieldName, List<String> keys) {
        this.fieldName = fieldName;
        this.values = keys;
    }

    public String getFieldName() {
        return fieldName;
    }

    public List<String> getValues() {
        return Collections.unmodifiableList(values);
    }
}
