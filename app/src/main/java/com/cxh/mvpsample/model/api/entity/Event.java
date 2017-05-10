package com.cxh.mvpsample.model.api.entity;

/**
 * EventBus事件
 * Created by Hai (haigod7@gmail.com) on 2017/4/18 17:41.
 */
public class Event<T> {
    public String tag;
    public T data;

    public Event(String tag, T data) {
        this.tag = tag;
        this.data = data;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Event{" +
                "tag='" + tag + '\'' +
                ", data=" + data +
                '}';
    }
}