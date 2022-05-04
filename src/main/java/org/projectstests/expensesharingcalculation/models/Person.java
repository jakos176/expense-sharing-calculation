package org.projectstests.expensesharingcalculation.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Setter
@Getter
@Entity
@Builder
public class Person extends GenericEntity {

    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "person")
    private List<Spent> spents;

}
