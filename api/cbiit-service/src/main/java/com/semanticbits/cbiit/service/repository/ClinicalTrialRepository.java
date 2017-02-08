package com.semanticbits.cbiit.service.repository;

import com.semanticbits.cbiit.service.model.ClinicalTrial;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicalTrialRepository extends PagingAndSortingRepository<ClinicalTrial,Long> {

}
