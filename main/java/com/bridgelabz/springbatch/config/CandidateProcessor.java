package com.bridgelabz.springbatch.config;

import com.bridgelabz.springbatch.model.CandidateModel;
import org.springframework.batch.item.ItemProcessor;

public class CandidateProcessor implements ItemProcessor<CandidateModel,CandidateModel> {
    @Override
    public CandidateModel process(CandidateModel candidateModel) throws Exception {
        if (candidateModel.getCity().equalsIgnoreCase("ongole")){
            return candidateModel;
        }else {
            return null;
        }
    }
}
