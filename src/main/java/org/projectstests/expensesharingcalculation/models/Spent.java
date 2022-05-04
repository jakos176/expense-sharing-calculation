package org.projectstests.expensesharingcalculation.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@Builder
public class Spent extends GenericEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private Person person;

    private String description;

    private BigDecimal price;

    private LocalDate date;
}
