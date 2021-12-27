package edu.umb.cs680.hw14;

import java.time.LocalDateTime;

public class ApfsLink extends ApfsElement {
    private ApfsElement target;

    public ApfsLink(ApfsDirectory parent, String name, int size, ApfsElement target) {
        super(parent, name, creation time, LocalDateTime, modified date);
        this.target = target;
    }

    public boolean isDirectory() {
        return false;
    }
    public boolean isFile() {
        return false;
    }
    public boolean isLink() {
        return true;
    }

    public ApfsElement getTarget() {
        return this.target;
    }
}
