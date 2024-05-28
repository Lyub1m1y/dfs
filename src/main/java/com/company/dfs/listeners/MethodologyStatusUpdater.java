package com.company.dfs.listeners;

import com.company.dfs.entity.Methodology;
import io.jmix.core.DataManager;
import org.springframework.stereotype.Component;

@Component(value = "methodologyStatusUpdater")
public class MethodologyStatusUpdater {

    private final DataManager manager;

    public MethodologyStatusUpdater(DataManager manager) {
        this.manager = manager;
    }

    public void execute(Methodology methodology, String nextStatus) {
        methodology.setStatus(nextStatus);
        manager.save(methodology);
    }
}