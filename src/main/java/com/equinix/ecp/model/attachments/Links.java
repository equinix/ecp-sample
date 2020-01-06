package com.equinix.ecp.model.attachments;

public class Links {
    private ReferenceLink first;
    private ReferenceLink next;
    private ReferenceLink self;
    private ReferenceLink prev;
    private ReferenceLink last;

    public ReferenceLink getFirst() {
        return first;
    }

    public void setFirst(ReferenceLink first) {
        this.first = first;
    }

    public ReferenceLink getNext() {
        return next;
    }

    public void setNext(ReferenceLink next) {
        this.next = next;
    }

    public ReferenceLink getSelf() {
        return self;
    }

    public void setSelf(ReferenceLink self) {
        this.self = self;
    }

    public ReferenceLink getPrev() {
        return prev;
    }

    public void setPrev(ReferenceLink prev) {
        this.prev = prev;
    }

    public ReferenceLink getLast() {
        return last;
    }

    public void setLast(ReferenceLink last) {
        this.last = last;
    }
}
