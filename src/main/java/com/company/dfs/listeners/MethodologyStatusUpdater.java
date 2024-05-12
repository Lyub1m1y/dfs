package com.company.dfs.listeners;

import com.company.dfs.entity.Methodology;
import org.springframework.stereotype.Component;

@Component(value = "methodologyStatusUpdater")
public class MethodologyStatusUpdater {

    public void execute(Methodology methodology, String nextStatus) {
        methodology.setStatus(nextStatus);
    }
}