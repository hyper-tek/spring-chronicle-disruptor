package com.josephio.springchronicledisruptor.queue;

public interface queue {

    void create(String path);

    void exists(String path);

    void countMessages(String queue);

    void send(String queue);

    void readAll(String queue);

    void read(String queue);

    void deleteAll(String queue);

    void delete(long index);

}
