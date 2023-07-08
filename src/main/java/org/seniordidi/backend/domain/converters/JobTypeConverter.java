package org.seniordidi.backend.domain.converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.seniordidi.backend.domain.enums.JobType;

@Converter(autoApply = true)
public class JobTypeConverter implements AttributeConverter<JobType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(JobType jobType) {
        return jobType.getId();
    }

    @Override
    public JobType convertToEntityAttribute(Integer id) {
        for (JobType jobType : JobType.values()) {
            if (id.equals(jobType.getId())) {
                return jobType;
            }
        }
        return null;
    }
}
