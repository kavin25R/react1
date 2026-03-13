package com.university.aiagents.service;

import com.university.aiagents.entity.Agent;
import com.university.aiagents.repository.AgentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AgentService {

    private final AgentRepository agentRepository;

    public AgentService(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    public Agent saveAgent(Agent agent) {
        return agentRepository.save(agent);
    }

    public List<Agent> getAllAgents() {
        return agentRepository.findAll();
    }

    public void deleteAgent(Long id) {
        agentRepository.deleteById(id);
    }
}