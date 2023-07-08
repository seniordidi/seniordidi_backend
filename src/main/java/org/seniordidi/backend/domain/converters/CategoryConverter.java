package org.seniordidi.backend.domain.converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.seniordidi.backend.domain.enums.Category;

@Converter(autoApply = true)
public class CategoryConverter implements AttributeConverter<Category, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Category category) {
        return category.getId();
    }

    @Override
    public Category convertToEntityAttribute(Integer id) {
        for (Category category : Category.values()) {
            if (id.equals(category.getId())) {
                return category;
            }
        }
        return null;
    }
}
