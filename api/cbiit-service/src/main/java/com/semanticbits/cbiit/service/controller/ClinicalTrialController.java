package com.semanticbits.cbiit.service.controller;

import com.semanticbits.cbiit.service.model.ClinicalTrial;
import com.semanticbits.cbiit.service.repository.ClinicalTrialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clinicaltrials")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class ClinicalTrialController {

    @Autowired
    private ClinicalTrialRepository trialRepository;

    @RequestMapping("/")
    public List<ClinicalTrial> listTrials(@RequestParam(value="page", defaultValue="0") Integer page, @RequestParam(value="limit", defaultValue="10") Integer limit) {
        List<ClinicalTrial> clinicalTrials = new ArrayList<ClinicalTrial>();

        Pageable pageable = new PageRequest(page, limit);

        trialRepository.findAll(pageable).forEach(clinicalTrials::add);

        return clinicalTrials;
    }

}
