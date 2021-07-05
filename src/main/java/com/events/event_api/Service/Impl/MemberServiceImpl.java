package com.events.event_api.Service.Impl;

import com.events.event_api.Dao.Entity.Member;
import com.events.event_api.Dao.Repos.IMemberRepository;
import com.events.event_api.Service.Interface.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements IMemberService {
    @Autowired
    IMemberRepository memberRepository;
    @Override
    public List<Member> getAll() {
        return memberRepository.findAll();
    }

    @Override
    public Member getById(long id) {
        return memberRepository.getById(id);
    }
}
