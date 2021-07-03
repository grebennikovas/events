package com.events.event_api.Service.Impl;

import com.events.event_api.Dao.Entity.Campaign;
import com.events.event_api.Dao.Repos.ICampaignRepository;
import com.events.event_api.Service.Interface.ICampaignService;
import com.events.event_api.Service.Interface.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaignServiceImpl implements ICampaignService {
    @Autowired
    ICampaignRepository campaignRepos;
    @Override
    public List<Campaign> getAll() {
        return campaignRepos.findAll();
    }

    @Override
    public Campaign getById(long id) {
        return campaignRepos.getById(id);
    }
}
