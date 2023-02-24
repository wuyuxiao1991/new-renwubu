package com.model.request;

import lombok.Data;

/**
 *
 * @author wuyuxiao
 */

@Data
public class DeleteTeamDetailRequest {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

