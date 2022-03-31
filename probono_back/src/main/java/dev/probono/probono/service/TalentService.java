package dev.probono.probono.service;

import java.util.List;

import dev.probono.probono.model.dto.TalentDTO;

public interface TalentService {
    void insertTalent(TalentDTO talentDTO);

    List<TalentDTO> getAllTalents();
}
